public class ElonsToyCar {
    private int battery = 100;
    private int meters = 0;



    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return "Driven " + meters +" meters";
    }
    public  String batteryDisplay() {
        if(battery <= 0){
            return "Battery empty";
        }
        return "Battery at " + battery +"%";
    }


    public boolean hasBattery() {
        return battery >=1;
    }

    public void drive() {
        if(battery >= 1) {
            meters +=20;
            battery -=1;
        }

    }


    }


