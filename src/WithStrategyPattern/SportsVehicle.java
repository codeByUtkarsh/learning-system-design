package WithStrategyPattern;


import WithStrategyPattern.DrivingStrategy.DriveStrategy;
import WithStrategyPattern.DrivingStrategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
