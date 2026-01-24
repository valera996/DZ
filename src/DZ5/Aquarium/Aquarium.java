package DZ5.Aquarium;

public class Aquarium {

    private SeaАnimal seaАnimal;

    public void setNewSeaAnimal(SeaАnimal seaAnimal){
        this.seaАnimal = seaAnimal;
    }

    public void showBehavior(){
        seaАnimal.move();
    }
}
