package DZ5.BotanicalGarden;

public class Cactus extends Plant{

    private String light = "Кактус требует много света";
    private String watering = "Кактус требует редкий полив";


    public String getLight(){
        return this.light;
    }
    public String getWatering(){
        return this.watering;
    }

    @Override
    public void showRequirements(){
        System.out.println(getLight()+ "\n" + getWatering());
    }

}
