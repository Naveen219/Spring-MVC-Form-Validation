package com.computergeek.springcontext.springcontextdemo.controller;

import com.computergeek.springcontext.springcontextdemo.model.User;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    // add an initbinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation
    // executes for every request to the controller

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        // Removes all the leading and trailing whitespaces
        // parameter 'true' signifies : if the string is empty, set the value of the string to 'null'
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        // registering the string class in the dataBinder
        // It implies for every string data, do the trimming and set it to null if the string is empty
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @GetMapping("/showform")
    public String showForm(Model theModel){
        theModel.addAttribute("user", new User());
        return "show-form";
    }
    @PostMapping("/processform")
    public String processForm(@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult) {
        if (theBindingResult.hasErrors()) {
            return "show-form";
        }
        return "process-form";
    }

}
