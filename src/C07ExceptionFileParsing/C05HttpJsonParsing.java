package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class C05HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
////        외부에서 데이터를 받아 java의 객체로 변환
////        외부api요청을 하기 위한 라이브러리 : HttpClient, RestTemplate, RestClient
////        HttpClient는 java내장클래스
////        RestTemplate, RestClient는 스프링에서 가장 많이 사용하는 클래스.
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
//                .GET().build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        String data = response.body();
//        ObjectMapper o1 = new ObjectMapper();
////        객체로 파싱
//        Post p1 = o1.readValue(data, Post.class);
//        System.out.println(p1);

////        리스트형식의 객체로 파싱
        ObjectMapper o1 = new ObjectMapper();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET().build();
        HttpResponse<String> response = client.send(request2, HttpResponse.BodyHandlers.ofString());
        String data = response.body();
        JsonNode jsonNodes = o1.readTree(data);
        List<Post> postList = new ArrayList<>();
        for (JsonNode j : jsonNodes){
            Post p1 = o1.readValue(j.toString(), Post.class);
            postList.add(p1);
        }
        System.out.println(postList);
    }
}
class Post{
    private long id;
    private long userId;
    private String title;
    private String body;

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}