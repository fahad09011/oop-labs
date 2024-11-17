public class TestPerson {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] persons = new Person[2];

        // Add an Employee and a Student to the array
        persons[0] = new Employee("Alice", 50000);
        persons[1] = new Student("Bob", "Computer Science");

        // Iterate over the array and print details
        for (Person person : persons) {
            System.out.println("Name: " + person.getName());
            System.out.println("Description: " + person.getDescription());
        }
    }
}
