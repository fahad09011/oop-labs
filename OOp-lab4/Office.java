public class Office {
    private static int officeCount = 100;
    private static int totaloffice = 0;
    private final int maxOffice = 3;

    // instance of Office class
    private int officeNumber;
    private Employee[] employee;
    private int numberOfEmployee;

    // constructor of office class
    public Office() {
        if (totaloffice <= maxOffice) {
            this.officeNumber = officeNumber++;
            this.employee = new Employee[2];
            this.numberOfEmployee = 0;
            totaloffice++;
        } else {
            System.out.println("only 3 office are allowed to create thanks!");
        }
    }

    // add employee to the office
    public void addEmployee(Employee employees) {
        if (numberOfEmployee < 2) {
            employee[numberOfEmployee] = employees;
            numberOfEmployee++;
        } else {
            System.out.println("number of employees are exceed in office");
        }

    }

    // print list of emplooyees
    public  int    printemployees() {
        for (int i = 0; i <numberOfEmployee; i++) 
        {
System.out.println(i+1 +"-"+employee[i].toString());
        }
        return numberOfEmployee;
    }
public String toString(){
    return " number of employees in office : "+numberOfEmployee;
}
}
