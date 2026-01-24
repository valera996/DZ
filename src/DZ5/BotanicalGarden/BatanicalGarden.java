package DZ5.BotanicalGarden;

public class BatanicalGarden {

    private Plant plant;

    public void setNewPlant(Plant plant){
        this.plant = plant;
    }

    public void takeCareOfPlant(){
        plant.showRequirements();
    }
}
