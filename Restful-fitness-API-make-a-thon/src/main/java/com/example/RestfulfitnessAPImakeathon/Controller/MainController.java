package com.example.RestfulfitnessAPImakeathon.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class MainController {
    @RequestMapping("/home-page")
	public String home() {
		
        return "index.html";
	}
}
