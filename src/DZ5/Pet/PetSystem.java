package DZ5.Pet;

public class PetSystem {
    private Pet pet;

    public void setNewPet(Pet pet){
        this.pet = pet;
    }


    public void playWithPet(){
        if(this.pet instanceof Playble) {
            Playble playble = (Playble) this.pet;
            playble.play();
        }else System.out.println("Это животное не играет");

    }

    public void walkWithPet(){
        if(this.pet instanceof Walkble){
            Walkble walkble = (Walkble) this.pet;
            walkble.walk();
        }else System.out.println("Это животное не гуляет");
    }

    public void feedPet(){
        pet.eat();
    }
}
