package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	 Role findByRoleID(int roleID);
	 Role findByRoleName(String roleName);

}
