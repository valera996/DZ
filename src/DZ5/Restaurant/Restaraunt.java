package DZ5.Restaurant;

public class Restaraunt {

    private Dish dish;

    public void setNewDish(Dish dish){
        this.dish = dish;
    }

    public void showMenu(){
        dish.showCaracteristic();
    }
}
