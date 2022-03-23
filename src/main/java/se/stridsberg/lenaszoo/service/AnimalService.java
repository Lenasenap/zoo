package se.stridsberg.lenaszoo.service;

import org.springframework.stereotype.Service;
import se.stridsberg.lenaszoo.model.Animal;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lejon", "Simba"));
        animals.add(new Animal("Giraff", "Elsa"));
        animals.add(new Animal("Val", "Valle"));
        animals.add(new Animal("Snigel", "Lena"));
        return animals;
    }
}
