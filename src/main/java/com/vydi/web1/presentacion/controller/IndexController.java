package com.vydi.web1.presentacion.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(path = "/homeland", method = RequestMethod.GET)
    public String indexController(Model model) {
        model.addAttribute("xd", "Hola");

        return "index";
    }
}
