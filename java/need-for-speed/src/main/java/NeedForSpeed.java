class NeedForSpeed {
    private int distance = 0;
    private int battery = 100;
    private int speed;
    private int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(this.battery == 0){
            return true;
        }else{
            return false;
        }
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(this.battery >= this.batteryDrain ) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }

    }

    public static NeedForSpeed nitro() {
        var speed = 50;
        var batteryDrain = 4;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
        return car;
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        }

        if(car.distanceDriven() >= this.distance){
            return true;
        }else{
            return false;
        }
    }
}
