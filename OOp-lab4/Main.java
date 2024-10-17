public class Main {
    public static void main(String[] args) {
        
        
        // adddes
        Address address1= new Address("john Stree", "enniscorthy", "wexford");
        
        // office
        Office office1 = new  Office();
        Office office2 = new  Office();
        Office office3 = new  Office();
        // Office office4 = new  Office();
        // Office office5 = new  Office();

        // Employee
        // create employee by using for loop
        // for (int i = 0; i < 5; i++) {
            
        //     Employee employee1= new Employee(null, "fahad", "manager", address1);
        //     office1.addEmployee(employee1);
            
        //     System.out.println("total employees are :"+employee1.getDisplaytottalEmployees());
        // }
        Employee employee1= new Employee(null, "fahad", "staff", address1," ");
        Employee employee2 = new Employee(null, "Atif", "manager", address1," ");
        
        // Employee employee3= new Employee(null, "fahad", "manager", address1);
        // Employee employee4= new Employee(null, "fahad", "manager", address1);
        // Employee employee5= new Employee(null, "fahad", "manager", address1);
        // Employee employee6= new Employee(null, "fahad", "manager", address1);
        

        // add number of employees in office 1
        office1.addEmployee(employee1);
        office1.addEmployee(employee2);
        // office1.addEmployee(employee3);
        // office1.addEmployee(employee4);


        

        System.out.println("office 1 "+office1.toString());
        System.out.println("office 2 "+office2.toString());
        System.out.println("office 3 "+office3.toString());
        // System.out.println("office 4 "+office4.toString());
        // System.out.println("office 5 "+office5.toString());

        System.out.println(office1.printemployees());
System.out.println("total employees are : "+employee1.getDisplaytottalEmployees());
       
        
    }
}
