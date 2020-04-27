package com.example.thymeleaf.controller;

import java.util.ArrayList;
import com.example.thymeleaf.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping({"/doctor/","/doctor/{number}/{name}"})
    public String doctor(Model model, @RequestParam(value="number", required=false, defaultValue="0") @PathVariable int number,
                         @RequestParam(value="name", required=false, defaultValue="John Smith") @PathVariable String name) {

        Doctor doctor1 = new Doctor(1, "William Hartnell");
        Doctor doctor2 = new Doctor(2, "Patrick Troughton");
        Doctor doctor3 = new Doctor(3, "Jon Pertwee");
        Doctor doctor4 = new Doctor(4, "Tom Baker");
        Doctor doctor5 = new Doctor(5, "Peter Davison");
        Doctor doctor6 = new Doctor(6, "Colin Baker");
        Doctor doctor7 = new Doctor(7, "Sylvester McCoy");
        Doctor doctor8 = new Doctor(8, "Paul McGann");
        Doctor doctor9 = new Doctor(9, "Christopher Eccleston");
        Doctor doctor10 = new Doctor(10, "David Tennant");
        Doctor doctor11 = new Doctor(11, "Matt Smith");
        Doctor doctor12 = new Doctor(12, "Peter Capaldi");
        Doctor doctor13 = new Doctor(13, "Jodie Whittaker");
    
        ArrayList<Doctor> doctor = new ArrayList<>();
    
        doctor.add(doctor1);
        doctor.add(doctor2);
        doctor.add(doctor3);
        doctor.add(doctor4);
        doctor.add(doctor5);
        doctor.add(doctor6);
        doctor.add(doctor7);
        doctor.add(doctor8);
        doctor.add(doctor9);
        doctor.add(doctor10);
        doctor.add(doctor11);
        doctor.add(doctor12);
        doctor.add(doctor13);

        model.addAttribute("doctor", doctor);
        model.addAttribute("name", name);
        model.addAttribute("number", number);

        return "index";
    }
}


