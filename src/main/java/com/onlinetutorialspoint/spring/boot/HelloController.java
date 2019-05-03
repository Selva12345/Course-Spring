package com.onlinetutorialspoint.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
    public String index(@RequestParam("Selva")String Name) {
		
        return "Hello World Spring !"+Name;
    }
}
