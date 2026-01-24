package DZ5.Restaurant;

public class Drink extends Dish{

    private double volume;

    Drink(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return this.volume;
    }

    @Override
    public void showCaracteristic(){
        System.out.println("Объём напитка " + getVolume());
    }
}
