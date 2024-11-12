
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


// <------------Student----------------->
class Student extends Person {
public static final int Maxcourses = 10;
    private int numCourse;
    private String courses[];
    private int grades[];

    // construcot for sub/child class student
    public Student(String name, String address) {
        super(name, address);
        this.courses = new String[Maxcourses];
        this.grades = new int[Maxcourses];
        this.numCourse=0;
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

    public void addCourseGrade(String course, int grade){
        if (numCourse<Maxcourses) {
        courses[numCourse]=course;
        grades[numCourse]=grade;
        numCourse++;
        }
        else{
            System.out.println("course limit exceed! ");
        }
    }

    public void printGrades() {
        for (int i = 0; i < numCourse; i++) {
            System.out.println("Course: " + courses[i] + ", Grade: " + grades[i]);
        }
    }
    public double getAverageGrade() {
        if (numCourse == 0) return 0.0;

        int total = 0;
        for (int i = 0; i < numCourse; i++) {
            total += grades[i];
        }
        double average = total/numCourse;
        return average;
    }
    // to string method
    public String toString(){
        return  " student :"+super.toString();
        // String result = "num of course : "+numCourse+" course : "+courses+" grade : "+grades;
        // return result;
    }


}


// <------------ Teacher ---------------->
class Teacher extends Person {
    private static final int MAX_COURSES = 10; 
    private String[] courses;                  
    private int numCourses;                   

    // Constructor
    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new String[MAX_COURSES];
        this.numCourses = 0;
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
        }
        if (numCourses < MAX_COURSES) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        } else {
            System.out.println("Cannot add more courses. Maximum limit reached.");
            return false;
        }
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[numCourses - 1] = null; 
                numCourses--;
                return true;
            }
        }
        return false; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Teacher";
    }
}
