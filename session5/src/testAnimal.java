import animal.Animal;
import animal.Tiger;
import animal.chiken;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class testAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new chiken();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].makeSound());

            if (animals[i] instanceof chiken) {
                Edible edibler = (chiken) animals[i];
                System.out.println(edibler.howToEat());
            }
        }
        System.out.println("Test fruit");
        Fruit[] fruit = new Fruit[2];
        fruit[0] =new Orange();
        fruit[1]=new Apple();
        for (int i=0; i< fruit.length;i++){
            System.out.println(fruit[i].howToEat());
        }
    }
}
