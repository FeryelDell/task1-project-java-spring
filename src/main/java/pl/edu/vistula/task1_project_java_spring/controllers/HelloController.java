package pl.edu.vistula.task1_project_java_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "Hello Vistula, in my first Spring controller !";
    }


    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Welcome to Vistula University!");
        return "greeting";
    }


}
