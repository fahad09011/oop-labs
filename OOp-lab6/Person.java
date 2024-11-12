
public class Person {
    // Variables
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // toString
    public String toString() {
        return name + "(" + address + ")";
    }
}

class Student extends Person {

    private int numCourse;
    private String courses[];
    private int grades[];

    // construcot for sub/child class student
    public Student(String name, String address, int numCourse, String[] courses, int[] grades) {
        super(name, address);
        this.numCourse = numCourse;
        this.courses = courses;
        this.grades = grades;
    }

    // getter
    public int getNumCourse() {
        return numCourse;
    }

    public String[] getCourses() {
        return courses;
    }

    public int[] getGrades() {
        return grades;
    }
    // setter

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }


    
}
