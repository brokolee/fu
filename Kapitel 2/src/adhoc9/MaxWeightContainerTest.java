package adhoc9;


import adhoc9.WeighableObjects.*;

public class MaxWeightContainerTest {
    public static void main(String[] args) {
        MaxWeightContainer mwc = new MaxWeightContainer();
        Animal animal = new Animal();
        Apple apple = new Apple();
        Hammer hammer = new Hammer();
        
        mwc.store(hammer);
        mwc.store(animal);
        mwc.store(apple);
        
        Weighable heaviest = mwc.getHeaviest();
        System.out.println("heaviest: " + heaviest.getWeight());
    }
}
