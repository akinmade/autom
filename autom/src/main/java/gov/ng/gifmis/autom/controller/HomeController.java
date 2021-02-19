package gov.ng.gifmis.autom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/aboutus")
    public String aboutus(){
        return "aboutus";
    }
    @GetMapping("/products")
    public String products(){
        return "products";
    }
    @GetMapping("/services")
    public String services(){
        return "services";
    }
    @GetMapping("/events")
    public String events(){
        return "events";
    }
    @GetMapping("/contactus")
    public String contactus(){
        return "contactus";
    }
}
