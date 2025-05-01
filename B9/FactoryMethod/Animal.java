package B9.FactoryMethod;

public abstract class Animal {
    public abstract String makeSound();
}

class Dog extends Animal {
    public String makeSound() {
        return "Woof";
    }
}

class Cat extends Animal {
    public String makeSound() {
        return "Meow";
    }
}

class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}

class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}