package cybersoft.javabackend.java12.gira.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.java12.gira.role.entity.Role;
@Repository //danh dau day la 1 cai bean
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	
}
