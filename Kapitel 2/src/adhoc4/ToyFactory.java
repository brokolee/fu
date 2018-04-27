package adhoc4;

import adhoc4.Toy;

public class ToyFactory {

    Toy getToy(String toyName) throws IllegalArgumentException {
        switch (toyName) {
        case "rubberduck":
            return new RubberDuck();
        case "teddy":
            return new TeddyBear();
        case "car":
            return new PlasticCar();
        default:
            String message = ("Cannot create Toy: " + toyName);
            throw new IllegalArgumentException(message);
        }
    }
}
