package cybersoft.javabackend.java12.gira.role.service.itf;

import java.util.List;

import cybersoft.javabackend.java12.gira.role.dto.AddGroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;

public interface GroupService {

	List<Group> findAllGroups();

	Group addNewGroup(AddGroupDto dto);

}
