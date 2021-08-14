package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.AddProgramDto;
//import cybersoft.javabackend.java12.gira.program.service.itf.ProgramService;
import cybersoft.javabackend.java12.gira.role.entity.Program;
import cybersoft.javabackend.java12.gira.role.repository.ProgramRepository;
@Service//set vao controller
public class ProgramServiceImpl implements cybersoft.javabackend.java12.gira.role.service.itf.ProgramService {
	private ProgramRepository repository;
	public ProgramServiceImpl(ProgramRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository=repository;
	}
	@Override
	public List<Program> findAll() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}
	@Override
	public Program addNewProgram(AddProgramDto dto) {
		// TODO Auto-generated method stub
		Program program=new Program();
		program.setName(dto.getName());
		return repository.save(program);
	}
	
}
