package org.springframework.samples.mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloMVC {
	
	@RequestMapping("/index")
	public String helloMVC() {
		return "index";
	}
}
