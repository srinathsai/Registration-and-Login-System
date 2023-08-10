package registerationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registerationlogin.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
