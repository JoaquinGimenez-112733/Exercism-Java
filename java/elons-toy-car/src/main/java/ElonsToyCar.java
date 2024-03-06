public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;
    public static ElonsToyCar buy() {
        ElonsToyCar elonsToyCar = new ElonsToyCar();
        return elonsToyCar;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        if (this.battery != 0) {
            return String.format("Battery at %d%s", this.battery, '%');
        }else{
            return "Battery empty";
        }

    }

    public void drive() {
        if(this.battery >= 1 ) {
            this.distance += 20;
            this.battery -= 1;
        }

    }
}
