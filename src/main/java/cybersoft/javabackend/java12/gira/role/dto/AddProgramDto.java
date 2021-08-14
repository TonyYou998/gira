package cybersoft.javabackend.java12.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AddProgramDto {
	@NotBlank(message = "{program.name.not-blank}")
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
