public class Animal {
    private String name;
    private int age;
    
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayAnimalDetails(){
        return "Aniaml Details:\n "+"name: "+name+" age: "+age;
        // System.out.println("name : "+name);
        // System.out.println("age : "+age);

    }
}
// dog extend
class Dog extends Animal{
    
    private String breed;


    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

@Override
    public String displayAnimalDetails() {
    return super.displayAnimalDetails()+"\n Dog Breed: "+breed;
    }
} 

// cat extend
class Cat extends Animal{
    
    private String breed;


    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }


    public String displayAnimalDetails() {
        return super.displayAnimalDetails()+"\n Cat Breed: "+breed;
        }
} 
