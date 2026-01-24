package DZ5.AmusementPark;

public class RollerCoaster extends Attraction{

    private String requirements = "Американские горки требует проверки безопасности";
    private String infoForVisitor = "Американские горки: Быстро едем, громко кричите";


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
