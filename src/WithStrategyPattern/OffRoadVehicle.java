package WithStrategyPattern;

import WithStrategyPattern.DrivingStrategy.DriveStrategy;
import WithStrategyPattern.DrivingStrategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
