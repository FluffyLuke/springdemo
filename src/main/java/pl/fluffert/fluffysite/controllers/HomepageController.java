package pl.fluffert.fluffysite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/homepage")
public class HomepageController {

    @GetMapping
    public String renderHomePage(){
        return "homepage";
    }

}
