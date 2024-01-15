package com.ryanhuynh.demo.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
//Can not use @RestController here because using @RestController, 
//the assumption is that the method will return data in a format such as JSON or XML, not HTML. 
//And in this project, we want to handle web requests and return views using thymeleaf (html files)
public class PageController {
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	@GetMapping({"/", "/home", "/index"})
    public String home(Model model) {
        model.addAttribute("message", "This is Home Page created with Spring Boot Thymeleaf!");
        logger.info("in Home method");
        return "index";
    }
	
//	@GetMapping("/errors")
//    public String error(Model model) {
//		logger.info("in Error method");
//        return "error";
//    }
	
	@GetMapping("/product")
    public String product(Model model) {
		logger.info("in Product method");
        return "product";
    }
}
