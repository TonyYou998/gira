package cybersoft.javabackend.java12.gira.role.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java12.gira.role.dto.AddGroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;
import cybersoft.javabackend.java12.gira.role.service.itf.GroupService;


@RestController
@RequestMapping("/api/group")
public class GroupController {
	private GroupService service;
	public GroupController(GroupService service) {
		// TODO Auto-generated constructor stub
		this.service=service;
		
	}
	@GetMapping
	public Object findAllGroups() {
		List<Group> groups=service.findAllGroups();
		return new ResponseEntity<>(groups, HttpStatus.OK);
		
	}
	@PostMapping
	public Object addNewGroup(@RequestBody AddGroupDto dto) {
		
		Group group=service.addNewGroup(dto);
		
		return new ResponseEntity<>(group,HttpStatus.OK);
		
	}

}
