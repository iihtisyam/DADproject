package id.clsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/menu")
	public String getMain()
	{
		
		
		return "main";
		
}
}
