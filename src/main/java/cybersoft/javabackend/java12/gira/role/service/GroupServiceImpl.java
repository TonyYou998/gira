package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.AddGroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;
import cybersoft.javabackend.java12.gira.role.repository.GroupRepository;
import cybersoft.javabackend.java12.gira.role.service.itf.GroupService;
@Service
public class GroupServiceImpl implements GroupService {
	private GroupRepository repository;
	public GroupServiceImpl(GroupRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository=repository;
	}
	@Override
	public List<Group> findAllGroups() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Group addNewGroup(AddGroupDto dto) {
		// TODO Auto-generated method stub
		Group group=new Group();
		group.setName(dto.getName());
		group.setDescription(dto.getDescription());
		return repository.save(group);//save vao db
	
		
	}
	
}
