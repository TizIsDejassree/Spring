package com.example.dayone4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class second {
     @Value("${car:thar2}")
     public String car;
     @GetMapping("/mycar")
     @ResponseBody
     public String display()
     {
    	 return"My fav car "   +car;
     }
}
