package pl.awsome.workshops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloViewController {

    @GetMapping(value = "/hello-mvc")
    public String getHello(@RequestParam String name, Model model){
        model.addAttribute("inputName", name);
        return "hello-view";
    }
}
