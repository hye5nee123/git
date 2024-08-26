package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	// 주소가 이렇게 듷어오면
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "<h1>차은우 잘생겼다!</h1>";
	}
}
