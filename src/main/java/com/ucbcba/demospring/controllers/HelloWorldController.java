package com.ucbcba.demospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/{mensaje}", method = RequestMethod.GET)
    public String index(@PathVariable String mensaje, Model model) {
        mensaje = mensaje.substring(0,4);
        model.addAttribute("message", mensaje);
        return "hello";
    }


}
