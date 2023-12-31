package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloSpringWebController {

	@RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value="/result", method=RequestMethod.POST)
    public String send(@RequestParam("inputvalue")String inputvalue, Model model) {
        model.addAttribute("message", inputvalue);
        return "result";
    }

}
