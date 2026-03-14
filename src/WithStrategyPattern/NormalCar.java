package WithStrategyPattern;

import WithStrategyPattern.DrivingStrategy.DriveStrategy;
import WithStrategyPattern.DrivingStrategy.NormalDriveStrategy;

public class NormalCar extends Vehicle{

    public NormalCar() {
        super(new NormalDriveStrategy());
    }
}
