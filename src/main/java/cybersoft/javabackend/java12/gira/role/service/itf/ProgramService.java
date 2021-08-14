package cybersoft.javabackend.java12.gira.role.service.itf;

import java.util.List;

import cybersoft.javabackend.java12.gira.role.dto.AddProgramDto;
import cybersoft.javabackend.java12.gira.role.entity.Program;

public interface ProgramService {

	List<Program> findAll();

	Program addNewProgram(AddProgramDto dto);
	
}
