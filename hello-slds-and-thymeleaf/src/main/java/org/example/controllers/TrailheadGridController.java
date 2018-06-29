package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;

/**
 * Sample Application
 */
@Controller
public class TrailheadGridController {

    @RequestMapping(value = "/trailheadgrid", method = RequestMethod.GET)
    public String trailheadbadge(HttpServletRequest request, Model model) {
    	
    	return "trailheadgrid";
    }
    
}
