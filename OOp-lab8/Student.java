//<------------------- Student------------------> 
class Student extends Person {
    private String Course ;


    public Student(String name, String Course) {
        super(name);
        this.Course = Course;
    }

    //abstract method
    @Override
    public String getDescription(){
String result =" A student Studying : "+Course;
return result;
    }
}