package DZ5.Museum;

public class Sculpture extends Exhibit{

    private String info = "Это скульптура Зевса";
    private String requirements = "Скульптура нуждается в реставрации";

    public String getInfo(){
        return this.info;
    }
    public String getRequirements(){
        return this.requirements;
    }

    @Override
    public void showRequirements(){
        System.out.println(getRequirements());
    }

    @Override
    public void showInfo(){
        System.out.println(getInfo());
    }
}
