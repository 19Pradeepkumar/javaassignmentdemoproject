import com.myPackage.*;

public class Main {
    public static void main(String[] args) {
        Vehicle obj = new ElectricCar();
        Vehicle ElectricBikeObject=new ElectricBike();
        Vehicle CarObject=new Car();
        Vehicle BikeObject=new Bike();
        obj.model();
        obj.passengerCapacity();
        obj.Power();
        obj.range();
        obj.type();
        obj.TopSpeed();
        obj.wheels();
    }
}