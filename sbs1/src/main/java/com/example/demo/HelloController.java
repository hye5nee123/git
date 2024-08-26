package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {
	//주소창에 요청이 들어오면 꽂아주는 거(mapping 해준다)
	@GetMapping("/hello")
	//html을 호출하는 게 아니라 그 글자 자체를 띄워준다. (잘 쓰진 않는다)
	@ResponseBody
	//원래는 html을 호줄하는 자리.
	public String hello() {
		return "Hello World";
	}
}
