package WithStrategyPattern;

import WithStrategyPattern.DrivingStrategy.DriveStrategy;
import WithStrategyPattern.DrivingStrategy.SportsDriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy obj){
        this.driveStrategy = obj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
