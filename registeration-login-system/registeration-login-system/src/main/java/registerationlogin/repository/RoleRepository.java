package registerationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registerationlogin.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
