package se.stridsberg.lenaszoo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.stridsberg.lenaszoo.model.Animal;
import se.stridsberg.lenaszoo.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AnimalController {
    AnimalService animalService = new AnimalService();

    @GetMapping("/animals")
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }
}
