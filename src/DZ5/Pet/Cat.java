package DZ5.Pet;

public class Cat extends Pet implements Playble{

    private String food = "влажный корм";

    public String getFood(){
        return this.food;
    }

    @Override
    public void eat(){
        System.out.println("Кошка ест " + getFood());
    }

    @Override
    public void play(){
        System.out.println("Кошка играет");
    }
}
