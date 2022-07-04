package app.tls.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PS_PERSONAL_DATA")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "EMPLID")
    private String emplid;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "SECOND_LAST_NAME")
    private String secondLastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "BIRTHDATE")
    private String dateOfBirth;

    @Column(name = "MAR_STATUS")
    private String maritalStatus;

    @Column(name = "SEX")
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLID", referencedColumnName = "EMPLID")
    private Document document;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return emplid != null && Objects.equals(emplid, user.emplid);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
