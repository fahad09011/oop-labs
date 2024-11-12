

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("huskie", 5, "German");
        // System.out.println(d1.displayAnimalDetails());

        Cat c1 = new Cat("catoo", 2, "persian");
        // System.out.println(c1.displayAnimalDetails());
        
        Vet v1 = new Vet("Zameer");
        v1.vaccinated(d1);
        v1.vaccinated(c1);
    }


}
