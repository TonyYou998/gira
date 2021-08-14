package cybersoft.javabackend.java12.gira.role.dto;

import javax.validation.constraints.NotBlank;

public class AddGroupDto {
	@NotBlank
	private String name;
	private String descriotion;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return descriotion;
	}
}
