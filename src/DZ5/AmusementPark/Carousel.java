package DZ5.AmusementPark;

public class Carousel extends Attraction{
    private String requirements = "Карусель требует технического обслуживания";
    private String infoForVisitor = "Карусель: Весело и не громко, чуть скрипим";


    public String getRequirements(){
        return this.requirements;
    }

    public String getInfoForVisitor(){
        return this.infoForVisitor;
    }
    @Override
    public void showRequirements(){
        System.out.println(getRequirements());
    }

    @Override
    public void showInfo(){
        System.out.println(getInfoForVisitor());
    }
}
