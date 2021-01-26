package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/showFormStudent")
    public String showForm(Model theModel) {

        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @RequestMapping("processFormStudent")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        System.out.println(theStudent);

        return "student-confirmation";
    }
}
