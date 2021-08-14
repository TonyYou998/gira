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

import cybersoft.javabackend.java12.gira.role.dto.AddProgramDto;
//import cybersoft.javabackend.java12.gira.program.service.itf.ProgramService;
import cybersoft.javabackend.java12.gira.role.entity.Program;
import cybersoft.javabackend.java12.gira.role.service.itf.ProgramService;

@RestController
@RequestMapping("/api/program")
public class ProgramController {
	private ProgramService service;
	
	public ProgramController(ProgramService programService) {
		service=programService;
	}
	@GetMapping
	public Object findAllProgram() {
		List<Program> programs= service.findAll();
		return new ResponseEntity<>(programs, HttpStatus.OK);
	}
	@PostMapping
	public Object addNewProgram(@Valid @RequestBody AddProgramDto dto,BindingResult errs) {
		if(errs.hasErrors())
			return new ResponseEntity<>(errs.getAllErrors(),HttpStatus.BAD_REQUEST);
		Program addProgram=service.addNewProgram(dto);
		
		return new ResponseEntity<>(addProgram,HttpStatus.OK);
	}
}
