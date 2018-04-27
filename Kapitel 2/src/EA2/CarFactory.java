package EA2;

class CarFactory {
    public Car giveMeACar() {
        return new RealCar(98);
    }
}