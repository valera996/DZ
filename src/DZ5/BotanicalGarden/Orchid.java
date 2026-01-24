package DZ5.BotanicalGarden;

public class Orchid extends Plant{
    private String light = "Орхидея требует тень";
    private String watering = "Орхидея требует высокую влажность";


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
