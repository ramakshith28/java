package Assignment;

interface Eater {
    void eatFood(String animalName);
}

interface Mover {
    void moveAround(String animalName);
}

interface Noisy {
    void makeNoise(String animalName);
}

class Animal implements Eater, Mover, Noisy {
    public void eatFood(String animalName) {
        System.out.println(animalName + " is eating food happily.");
    }

    public void moveAround(String animalName) {
        System.out.println(animalName + " is moving around the zoo.");
    }

    public void makeNoise(String animalName) {
        System.out.println(animalName + " is making loud animal noises.");
    }
}

interface Protector {
    void protect(String animalName);
}

class GuardianAnimal extends Animal implements Protector {
    public void protect(String animalName) {
        System.out.println(animalName + " protects other animals in the zoo.");
    }

    public void showStrength(String animalName) {
        System.out.println(animalName + " shows its strength proudly.");
    }
}

public class Zoodemo {
    public static void main(String[] args) {
        GuardianAnimal lion = new GuardianAnimal();
        
        lion.eatFood("Lion");
        lion.moveAround("Lion");
        lion.makeNoise("Lion");
        lion.protect("Lion");
        lion.showStrength("Lion");
    }
}
