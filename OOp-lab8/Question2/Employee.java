
    //<------------------- Employee ------------------> 
    public class Employee extends Person {
        private double annualSalary ;


        public Employee(String name, double annualSalary) {
            super(name);
            this.annualSalary = annualSalary;
        }

        //abstract method
        @Override
        public String getDescription(){
String result =" An employee with the salary of : "+annualSalary ;
return result;
        }
    }