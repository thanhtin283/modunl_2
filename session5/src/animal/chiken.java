package animal;

import edible.Edible;

public class chiken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "chiKen: cluck_cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
