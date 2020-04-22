package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TutoController {

  private String name;

  @GetMapping({ "/", "/hello" })
    public String index(Model model, @RequestParam(value="name", required=false, defaultValue="world")  String name ) {

      model.addAttribute("name", name);

    return "home"; // you can also write return "home.html"
    }

    public String getName(){
      return this.name = name;
    }

}