package cm.skct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class deja {
	@GetMapping("/a")
	@ResponseBody
 public String display()
 {
	 return "Welcome";
 }
}
