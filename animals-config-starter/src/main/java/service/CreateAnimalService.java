package service;

import dto.Animal;
import dto.AnimalsEnum;

import java.util.List;
import java.util.Map;

public interface CreateAnimalService {
    /**
     * Создает одно уникальное животное случайного типа
     */
    default Animal createAnimal(AnimalsEnum animal) {
        switch (animal) {
            case BEAR:
                return createBear();
            case TIGER:
                return createTiger();
            case PARROT:
                return createParrot();
            case HAMSTER:
                return createHamster();
            default:
                System.out.println("Error");
                return null;
        }
    }

    Animal createBear();
    Animal createTiger();
    Animal createParrot();
    Animal createHamster();

    Map<String, List<Animal>> createAnimals();

    void setAnimalType(AnimalsEnum animalsEnum);
}
