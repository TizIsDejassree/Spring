package com.example.dayone.day4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class kir {
	@GetMapping("/hi")
	@ResponseBody
	public String display()
	{
		return "hi";
				
	}

}
