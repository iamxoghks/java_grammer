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
        List<Post> postList = new ArrayList<>();

        while (true){
            System.out.println("실행할 서비스의 번호를 눌러주세요.");
            System.out.println("1. 회원가입\n2. 회원 전체 목록 조회\n3. 회원 상세조회\n4. 게시글 작성\n5. 게시물 목록 조회\n6. 게시물 상세 조회");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            StringTokenizer st = new StringTokenizer();
            int number = Integer.parseInt(br.readLine());

            switch (number){
                case 1:
                    System.out.println("회원가입 서비스 입니다.\n이름, 이메일, 비밀번호를 순서대로 입력해주세요\n");
                    String name = br.readLine();
                    String email = br.readLine();
                    String password = br.readLine();
                    userList.add(new User(name, password, email));
                    System.out.println("가입되었습니다.\n");
                    break;
                case 2:
                    System.out.println("회원 전체 목록을 조회합니다.\n");
                    if(userList.isEmpty()) System.out.println("사용자 목록이 비어있습니다.\n");
                    else for(User u : userList) System.out.println(u.getName() + ", " + u.getEmail());
                    break;
                case 3:
                    System.out.println("회원 상세 조회(id로 조회)합니다. id를 입력해주세요.\n");
//                    id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
                    long id = Long.parseLong(br.readLine());
                    if(!userList.contains(id)) System.out.println("존재하지 않는 유저 아이디입니다.\n");
                    else {
                        User user  = null;
                        for(User u : userList){
                            if(u.getUserId() == id){
                                user = u;
                                break;
                            }
                        }
                        long count = 0;
                        for(Post post : postList) {
                            if(post.getUserEmail().equals(user.getEmail())) count++;
                        }
                    }
                    break;
                case 4:
                    System.out.println("게시글을 작성합니다. title, content, email을 입력해주세요.\n");
                    String title = br.readLine();
                    String content = br.readLine();
                    String userEmail = br.readLine();
                    User user = null;
                    for(User u : userList){
                        if(u.getEmail().equals(userEmail)) {
                            user = u;
                            break;
                        }
                    }
                    postList.add(new Post(title, content, userEmail));
                    System.out.println("작성 완료.");
                    break;
                case 5:
                    System.out.println("게시물 목록을 조회합니다.\n");
                    for(Post post : postList) System.out.println(post.getPost_id() + ", " + post.getTitle());
                    break;
                case 6:
                    System.out.println("게시물의 상세 정보를 조회합니다.\n게시글의 id를 입력해주세요.\n");
                    long postId = Long.parseLong(br.readLine());
                    Post post = null;
                    for(Post p : postList) {
                        if(p.getPost_id() == postId) {
                            post = p;
                            break;
                        }
                    }
                    User user1 = null;
                    for(User u : userList){
                        if(post.getUserEmail().equals(u.getEmail())) {
                            user1 = u;
                            break;
                        }
                    }

                    System.out.println("id: " + post.getPost_id() + ", title: " + post.getTitle() + ", content: " + post.getContent() + ", user email: " + user1.getEmail());

                    break;
            }
        }
    }

}

class User{
    private String name;
    private String password;
    private String email;
    private long user_id;
    private static long staticUserId;

    public User(String name, String password, String email) {
        staticUserId++;
        this.name = name;
        this.password = password;
        this.email = email;
        this.user_id = staticUserId;
    }

    public long getUserId() {
        return user_id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "(id: " + this.user_id +
                ", name: " + this.name +
                ", email: " + this.email +
                ")";
    }
}

class Post{
    private long post_id;
    private String title;
    private String content;
    private static long staticPostId;
    private String userEmail;

    public Post(String title, String content, String userEmail) {
        staticPostId++;
        this.post_id = staticPostId;
        this.title = title;
        this.content = content;
        this.userEmail = userEmail;
    }

    public long getPost_id() {
        return post_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public static long getStaticPostId() {
        return staticPostId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String toString() {
        return "(post id: " + post_id +
                "title: " + title +
                "content: " + content +
                "user email : " + userEmail +
                ")";
    }

}