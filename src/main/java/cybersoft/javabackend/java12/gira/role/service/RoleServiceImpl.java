package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.CreateRoleDto;
import cybersoft.javabackend.java12.gira.role.entity.Role;
import cybersoft.javabackend.java12.gira.role.repository.RoleRepository;
import cybersoft.javabackend.java12.gira.role.service.itf.RoleService;
@Service //de set vao controller
public class RoleServiceImpl implements RoleService{
	private RoleRepository repository;
	public RoleServiceImpl(RoleRepository repository) {
		
		// TODO Auto-generated constructor stub
		this.repository=repository;
	}
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	public Role addNewRole(CreateRoleDto dto) {
		Role newRole=new Role();
		newRole.setName(dto.getName());
		newRole.setDescription(dto.getDescription());
		return repository.save(newRole);
		
		
	}
}
