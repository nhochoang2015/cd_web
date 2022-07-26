package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.RoleConverter;
import hotel_booking.dto.RoleDTO;
import hotel_booking.entity.Role;
import hotel_booking.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private RoleConverter roleConverter;

	public Role findByRoleID(int roleID) {
		Role role = roleRepository.findByRoleID(roleID);
		return role;

	}

	public Role findByRoleName(String roleName) {
		Role role = roleRepository.findByRoleName(roleName);
		return role;

	}

	public List<RoleDTO> findAllRole() {
		List<Role> listRole = roleRepository.findAll();
		List<RoleDTO> listRoleDTO = new ArrayList<RoleDTO>();
		for (Role r : listRole) {
			RoleDTO roleDTO = roleConverter.toDTO(r);
			listRoleDTO.add(roleDTO);
		}
		return listRoleDTO;
	}
}
