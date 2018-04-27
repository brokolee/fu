package adhoc4;

public class Toy {
    void print() {
        System.out.println(this.getClass().getName());
    }
}

class RubberDuck extends Toy {
    @Override
    void print() {
        System.out.println(this.getClass().getName());
    }
}

class TeddyBear extends Toy {

    @Override
    void print() {
        System.out.println(this.getClass().getName());
    }
}

class PlasticCar extends Toy {
    @Override
    void print() {
        System.out.println(this.getClass().getName());
    }
}
