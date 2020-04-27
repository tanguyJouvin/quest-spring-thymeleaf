package com.example.thymeleaf.controller;

import java.util.ArrayList;

import com.example.thymeleaf.model.Food;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TutoController {

  @GetMapping({ "/hello", "/hello/{name}" })
    public String index(Model model, @RequestParam(value="name", required=false, defaultValue="world") @PathVariable  String name) {

      Food cassoulet = new Food("cassoulet", 128);
      Food couscous = new Food("couscous", 458);
      Food paupiette = new Food("paupiette", 128);
      Food tomateFarcie = new Food("tomate farcie", 128);
      Food potiron = new Food("soupe de potiron", 128);

      ArrayList<Food> lunch = new ArrayList<>();

      lunch.add(cassoulet);
      lunch.add(couscous);
      lunch.add(paupiette);
      lunch.add(tomateFarcie);
      lunch.add(potiron);

      model.addAttribute("name", name);
      model.addAttribute("lunch", lunch);

    return "home"; // you can also write return "home.html"
    }
    


}