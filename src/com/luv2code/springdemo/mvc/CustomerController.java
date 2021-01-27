package com.luv2code.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("showFormCustomer")
    public String showForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processFormCustomer")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult bindingResult
    ) {

        System.out.println("Last Name: |" + theCustomer.getLastName() + "|");

        System.out.println("Binding result: " + bindingResult);

        System.out.println("\n\n\n\n");

        if (bindingResult.hasErrors()) {
            return "customer-form";
        }else{
            return "customer-confirmation";
        }
    }
}
