package Task2.sol4;

public class Employee extends Person{
    int empId;
    int empSal;

    public Employee() {

    }

    public Employee(String name, int age, int empId, int empSal) {
        super(name, age);
        this.empId = empId;
        this.empSal = empSal;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee salary: " + empSal);
    }
}
