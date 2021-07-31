package cybersoft.javabackend.java12.gira.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class WelcomeController {
	@GetMapping("/home")
	@ResponseBody
	public String welcome() {
		return "welcome";
		
	}
}
