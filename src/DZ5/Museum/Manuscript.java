package DZ5.Museum;

public class Manuscript extends Exhibit{

    private String info = "Этот манускрипт старый и интересный";
    private String requirements = "Манускрипт требует контролируемой влажности";

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
