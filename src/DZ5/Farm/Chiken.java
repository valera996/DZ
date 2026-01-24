package DZ5.Farm;

public class Chiken extends LiveStock implements GivingProduct{

    @Override
    public void eat(){
        System.out.println("Курице необходимо зерно");
    }

    @Override
    public void giveProduct(){
        System.out.println("Курица снесла яйца");
    }
}
