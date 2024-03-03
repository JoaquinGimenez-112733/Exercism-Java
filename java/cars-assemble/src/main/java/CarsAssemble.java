public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        final int carsPerHour = 221;

        double successRate;
        if (speed > 0 && speed <= 4){
            successRate = 1;
        }else if (speed > 4 && speed <= 8){
            successRate = 0.90;
        }else if (speed == 9) {
            successRate = 0.80;
        }else if (speed == 10){
            successRate = 0.77;
        }else{
            successRate = 0;
        }

    return carsPerHour * speed * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
