package EA2;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car myCar =  factory.giveMeACar();
        System.out.println(myCar.readMotorPowerInKiloWatt());
        
        //myCar.tunePower();
        
        // funktioniert nicht :'(
        
        
        RealCar myTunedUpCar = (EA2.RealCar) factory.giveMeACar();
        myTunedUpCar.tunePower();
        System.out.println(myTunedUpCar.readMotorPowerInKiloWatt());
    }
}


