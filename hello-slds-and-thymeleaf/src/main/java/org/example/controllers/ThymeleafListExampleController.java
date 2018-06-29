package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import org.example.models.ThymeleafExampleList;

/**
 * Sample Application
 */
@Controller
public class ThymeleafListExampleController {
	
	ThymeleafExampleList ContactList = new ThymeleafExampleList();

    @RequestMapping(value = "/thymeleaflistexample", method = RequestMethod.GET)
    public String trailheadrecord(HttpServletRequest request, Model model) {
    	
    	model.addAttribute("contactlist", ContactList.getContactlist());
    	    	
    	return "thymeleaflistexample";
    }
    
}
