package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
<게시판서비스>
1.계좌객체 : Author, Post
2.자료구조 : List(authorList, postList)
3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
    3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
    3-2.회원 전체 목록 조회 : id, email
    3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
    3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
    3-5.게시물 목록 조회 : id(post), title
    3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, userName
     */
public class C10BoardService {
    public static void main(String[] args) throws IOException {
        List<User> userList = new ArrayList<>();
        List<Board>  boardList = new ArrayList<>();

        while (true) {
            System.out.println("원하는 서비스의 번호를 입력해주세요.");
            System.out.println("1. 회원가입\n2. 회원 전체 목록 조회\n3. 회원 상세조회\n" +
                    "4. 게시글 작성\n5. 게시물 목록 조회\n6. 게시물 상세 조회");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(br.readLine());

            switch (number) {
                case 1:
                    System.out.println("이름, 비밀번호, 이메일 순서대로 입력");
                    String name = br.readLine();
                    String password = br.readLine();
                    String email = br.readLine();

                    userList.add(new User(name,password,email));
                    break;
                case 2:
                    System.out.println("회원 전체 목록 조회");
                    User user = null;
                    for(User u : userList) System.out.println("name: " + u.getUserName() + ", email:" +  u.getUserEmail());
                    break;
                case 3:
                    System.out.println("상세 조회. id를 입력하세요.");
                    long userId = Long.parseLong(br.readLine());
                    User user1 = null;
                    for(User u : userList) {
                        if(u.getUserId() ==userId) {
                            user1 = u;
                            break;
                        }
                    }
                    Board board = null;
                    int counter = 0;
                    for(Board b : boardList) {
                        if(b.getUserEmail().equals(user1.getUserEmail())) {
                            board = b;
                            counter++;
                        }
                    }
                    System.out.println(user1.getUserId() + user1.getUserName() + user1.getUserEmail() + user1.getPassword() + counter);
                    break;
                case 4:
                    System.out.println("게시글을 작성합니다. 제목과 내용, 이메일을 입력해주세요");
                    String title = br.readLine();
                    String content = br.readLine();
                    String userEmail = br.readLine();

                    boardList.add(new Board(title,content,userEmail));

                    System.out.println("입력 완료");
                    break;
                case 5:
                    for (Board b : boardList) System.out.println("id: " + b.getPostId() + ", title: " + b.getTitle());
                    break;
                case 6:
                    System.out.println("조회할 글의 id 입력");
                    Board board1 = null;
                    long postId = Long.parseLong(br.readLine());
                    for(Board b : boardList) {
                        if(b.getPostId() == postId) {
                            board1 = b;
                        }
                    }

                    System.out.println(board1.getPostId() + board1.getTitle() + board1.getContent() + board1.getUserEmail());
                    break;
            }
        }

    }
}

class User {
    private long userId;
    private String userName;
    private String password;
    private String userEmail;
    private static long staticId;

    public User(String name, String password, String userEmail) {
        staticId++;
        this.userId=staticId;
        this.userName = name;
        this.password = password;
        this.userEmail = userEmail;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public static long getStaticId() {
        return staticId;
    }
}

class Board {
    private long postId;
    private String title;
    private String content;
    private String userEmail;
    private static long staticBoardId;

    public Board(String title, String content, String userEmail) {
        staticBoardId++;
        this.postId=staticBoardId;
        this.title = title;
        this.content = content;
        this.userEmail = userEmail;

    }

    public long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public static long getStaticBoardId() {
        return staticBoardId;
    }
}