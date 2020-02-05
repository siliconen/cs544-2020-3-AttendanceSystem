package attendance.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Administrator {
    @Id
<<<<<<< HEAD:src/main/java/attendence/demo/domain/Administrator.java
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
=======
    @GeneratedValue
    private int id;
>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/domain/Administrator.java

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
