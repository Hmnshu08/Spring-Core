package com.SpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springMvc {

	
@RequestMapping(value = "/welcome")
@ResponseBody
	public String sayHello() {
		return "Hello World..!!";
	}
}
