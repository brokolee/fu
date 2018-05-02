package adhoc2;

public class Dog implements Weighable {

    double weight;

    public Dog(double weight) {
        this.weight = weight;

    }

    public double getWeight() {
        return this.weight;
    }

    public void bark() {
        System.out.println("WOOF!");
    }

}
