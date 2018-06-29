package org.example.controllers;

import org.example.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;

/**
 * Sample Application
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request, Model model) {
    	
    	// get name parameter from request
    	String name = request.getParameter("name");
    	
    	if (name == null) {
    		name = "world";
    	}
    	
    	model.addAttribute("message", HelloMessage.getMessage(name));
    	
        return "hello";
    }
    
}
