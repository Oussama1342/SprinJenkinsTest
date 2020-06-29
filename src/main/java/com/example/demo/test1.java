package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {
	
	
@GetMapping("/test1")
public String testjinkins() {
	
	return "Hellow Jinkins";
}

}
