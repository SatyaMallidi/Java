public class Employee {
    int employeeID;
    String name;
    double salary;
    String department;

    void increaseSalary(double increment) {
        if (increment > 0) {
            salary += increment;
            System.out.println("The increased salary is :" + salary);
        } else {
            System.out.println("please enter the valid value");
        }
    }

        void employeeDetails(){
            System.out.println("Employee ID is :"+ employeeID);
            System.out.println("Employee name is :"+ name);
            System.out.println("Employee department is :"+ department);
            System.out.println("Employee salary is :"+ salary);

        }
        public static void main(String[] args){
        Employee employee = new Employee();
        employee.employeeID=1;
        employee.name="Satya";
        employee.department="JAVA Fullstock";
        employee.salary=100000;
        employee.employeeDetails();
        employee.increaseSalary(25000);
        }
    }
