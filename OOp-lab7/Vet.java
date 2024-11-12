

public class Vet {
    private String name;

    public Vet(String name){
        this.name=name;
    }
    public void vaccinated(Animal animal){
        System.out.println("Dr."+name+" is vaccinating!");
        if (animal instanceof Dog) {
        System.out.println("dog is vaccinated: "+animal.displayAnimalDetails());
    }
        else if (animal instanceof Cat) {
        System.out.println("Cat is vaccinated: "+animal.displayAnimalDetails());
    }
}
}
