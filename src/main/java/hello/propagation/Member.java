package hello.propagation;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    private Long id;
    private String username;

    public Member() {}

    public Member(String username) {
        this.username = username;
    }
}
