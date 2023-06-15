package hello.login.domain.login;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    /**
     *
     * @param loginId
     * @param password
     * @return null -> Login Fail
     */
    public Member login(String loginId, String password) {
        return memberRepository.findByLoginId(loginId).filter(member -> member.getPassword().equals(password))
                .orElse(null);
    }
}
