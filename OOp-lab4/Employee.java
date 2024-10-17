public class Employee {
    private static int employeeCount=1000;
    private static int totalEmployees=0;
    private final int maxEmployees=5;

    // instanse of Employee class
    private int  employeeNumber;
    private String name;
    private String employeeType;
    private Address address ;
    private String car ;

    // constructor of Employee class
    public Employee(String employeeNumber, String name, String employeeType, Address address, String car) {
        if (totalEmployees<maxEmployees) {
        
            this.employeeNumber = employeeCount++;
            this.name = name;
            this.employeeType = employeeType;
            this.address=address;
            totalEmployees++;
            if (employeeType=="manager") {
                this.car=car;
            }
            // else{
            //     System.out.println("only manager have car thanks! ");
            // }
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
        String result = employeeNumber+" "+name+" "+employeeType+" "+address.toString()+" "+car;
        
        if (employeeType=="manager") {
            System.out.println(name+" have a toyota GLI ");
        }
        // else{
        //     System.out.println("only manager have car thanks! ");
        // }
        return result;
    }
}