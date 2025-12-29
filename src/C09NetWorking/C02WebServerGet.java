package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C02WebServerGet {
    public static void main(String[] args) throws IOException {
//       사용자 : 크롬을 통해 http://localhost:8080?id=1 get 요청
//       서버 : "hello world java" + id 문자열을 응답
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버시작");
        while (true){
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line = br.readLine();
            while (line !=null && ! line.isEmpty()){
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstline =requestString.split("\n")[0];
            String infos = firstline.split(" ")[1];
            String id ="";
            if (infos.contains("?")){
                id = infos.split("=")[1];
            }
            String response = "HTTP/1.1 200 OK\r\n\r\n" + "hello world java" + id;
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();
        }
    }
}