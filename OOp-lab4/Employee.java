public class Employee {
    private static int employeeCount=1000;
    private static int totalEmployees=0;
    private final int maxEmployees=5;

    // instanse of Employee class
    private int  employeeNumber;
    private String name;
    private String employeeType;
    private Address address ;

    // constructor of Employee class
    public Employee(String employeeNumber, String name, String employeeType, Address address) {
        if (totalEmployees<maxEmployees) {
        
            this.employeeNumber = employeeCount++;
            this.name = name;
            this.employeeType = employeeType;
            this.address=address;
            totalEmployees++;
        }
        else{
            System.out.println("only 5 employyes are allowed to create");
        }
    }

    // to display the employee details
    public int  getDisplaytottalEmployees(){
        return totalEmployees;
    }

    // to string methos to display the details of employees
    public String toString(){
        return employeeNumber+" "+name+" "+employeeType+" "+address.toString();
    }
}