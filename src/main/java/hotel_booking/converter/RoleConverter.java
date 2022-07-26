package hotel_booking.converter;

import org.springframework.stereotype.Component;

import hotel_booking.dto.RoleDTO;
import hotel_booking.entity.Role;

@Component
public class RoleConverter {

	public RoleDTO toDTO(Role entity) {
		int roleID = entity.getRoleID();
		String roleName = entity.getRoleName();
		RoleDTO dto = new RoleDTO(roleID, roleName);
		return dto;
	}

}
