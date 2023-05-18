package hello.login.domain.member;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Member {
    private Long id;
    @NotBlank
    private String loginId;
    @NotBlank
    private String name;
    @NotBlank
    private String password;

    public Member(String loginId, String name, String password) {
        this.loginId = loginId;
        this.name = name;
        this.password = password;
    }

    public Member() {
    }
}
