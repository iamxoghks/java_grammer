package C07ExceptionFileParsing.MemberException;

// 객체 - entity
public class Member {

    private long id;
    private String name;
    private String email;
    private String password;
    private static long staticId = 0L;

    public Member(String name, String email, String password) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", email: " + email +
                ", password: " + password;
    }
}
