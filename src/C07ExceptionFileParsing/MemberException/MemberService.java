package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.Optional;

// 핵심 로직 구현 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }
    public void register(String name, String email, String password) {
        if(name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("please enter your info");
        }
        // List(DB)에 email이 중복일 경우 예외처리
        // not null 일 때 error
        Optional<Member> member = memberRepository.findByEmail(email);
        if(member.isPresent()) {
            throw new IllegalArgumentException("already exists");
        }
        // 객체 조립 후 repository를 통해 저장
        Member newMember = null;
        newMember = new Member(name, email, password);
        memberRepository.register(newMember);
    }


    public Member findById(long id) {
        Member member = memberRepository.findById(id);
        if(member == null) {
            // null 일 때 Exception 발생 Optional이 좋다고 함
            // orElseThrow로 변경
            throw new IllegalArgumentException("member not found");
        }
        return member;
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public void login(String email, String password) {
        // email 있는지 확인 후 없으면 예외 발생
        Member member = memberRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("member not found"));
        // password 일치하는지 확인, + 예외 발생
        if(member.getEmail().equals(email)) {
            throw new IllegalArgumentException("member not found");
        }
    }
}

