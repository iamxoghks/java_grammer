package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소 계층(논리적)
// DB - CRUD 수행 계층
public class MemberRepository {

    private List<Member> memberList = new ArrayList<>();

    public MemberRepository() {
        this.memberList = new ArrayList<>();
    }

    public void register(Member member) {
        this.memberList.add(member);
    }

    public Optional<Member> findByEmail(String email) {
        Member member = null;
        // list 에 없는지 확인
        for(Member a : memberList) if(a.getEmail().equals(email)) member = a;

        return Optional.ofNullable(member);
    }

    public Member findById(long id) {
        Member member = null;
        for(Member a : memberList) if(a.getId() == id) member = a;
        return member;
    }

    public List<Member> findAll() {
        return this.memberList;
    }
}
