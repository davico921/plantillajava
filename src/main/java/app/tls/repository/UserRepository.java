package app.tls.repository;

import app.tls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findUserByEmplid(String emplid);

    User findUserByEmplidAndGender(String emplid, String gender);
}
