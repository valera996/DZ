package DZ5.Restaurant;

public class HotDish extends Dish{

    private int temperature;

    HotDish(int temperature){
        this.temperature = temperature;
    }

    public int getTemerature(){
        return this.temperature;
    }

    @Override
    public void showCaracteristic(){
        System.out.println("Температура блюда " + getTemerature());
    }
}
