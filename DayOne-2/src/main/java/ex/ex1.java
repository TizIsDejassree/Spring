package ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ex1 {
	@GetMapping("/hi")
	@ResponseBody
	public String display() {
		return "hello";
	}
	
  
}
