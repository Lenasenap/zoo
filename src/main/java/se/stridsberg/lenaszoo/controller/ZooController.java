package se.stridsberg.lenaszoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.stridsberg.lenaszoo.service.AnimalService;

@Controller
public class ZooController {

    @Autowired
    AnimalService animalService;

    @RequestMapping("/index")
    public String start() {
        return "index";
    }

    @RequestMapping("/animals")
    public String animals(Model model) {
        model.addAttribute("animals", animalService.getAnimals());
        return "animals";
    }

    @RequestMapping("/employees")
    public String employees() {
        return "employees";
    }

    @RequestMapping("/visitors")
    public String visitors() {
        return "visitors";
    }



}
