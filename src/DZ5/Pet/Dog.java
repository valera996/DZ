package DZ5.Pet;

public class Dog extends Pet implements Walkble{

    private String food = "cухой корм";

    public String getFood(){
        return this.food;
    }


    @Override
    public void eat(){
        System.out.println("Собака ест " + getFood());
    }

    @Override
    public void walk(){
        System.out.println("Собака гуляет");
    }

}
