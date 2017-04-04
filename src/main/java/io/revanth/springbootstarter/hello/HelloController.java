package io.revanth.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/api/welcome")
	public String welcome(){
		return "Welcome to the course API";
	}

}
