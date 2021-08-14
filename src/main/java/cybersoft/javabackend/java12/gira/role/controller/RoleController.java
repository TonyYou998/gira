package cybersoft.javabackend.java12.gira.role.controller;



import java.util.List;

import javax.validation.Valid;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java12.gira.role.dto.CreateRoleDto;
import cybersoft.javabackend.java12.gira.role.entity.Role;
//import cybersoft.javabackend.java12.gira.role.service.RoleServiceImpl;
import cybersoft.javabackend.java12.gira.role.service.itf.RoleService;

@RestController //trả về json
@RequestMapping("/api/role")//đường dẫn mapping
public class RoleController {
	private RoleService service;
	public RoleController(RoleService roleService) {
		// TODO Auto-generated constructor stub
		service=roleService;
	}
	@GetMapping
	public Object findAllRole() {
		List<Role> roles=service.findAll();
		return new ResponseEntity<>(roles, HttpStatus.OK);
	}
	@PostMapping
	public Object saveRole(@Valid  @RequestBody CreateRoleDto dto,BindingResult errs) { 
		if(errs.hasErrors()) {
			
			return new ResponseEntity<>(errs.getAllErrors(),HttpStatus.BAD_REQUEST);
		}
			
		Role addedRole =service.addNewRole(dto);
		return new ResponseEntity<>(addedRole,HttpStatus.OK);
	}
}