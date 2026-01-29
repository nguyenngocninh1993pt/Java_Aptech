package asm5_animal;

public class Main {
    public static void main(String[] agrs){
        Animal[] animals = new Animal[3];
        animals[0] = new Elephant("Voi");
        animals[1] = new Lion("Sư tử");
        animals[2] = new Monkey("Khỉ");
        for (Animal a: animals){
            a.eat();
        }
    }
}
