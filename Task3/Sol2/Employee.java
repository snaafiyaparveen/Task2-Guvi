package Task3.Sol2;

public class Employee implements Taxable{
    int empId;
    String name;
    double salary;
    public Employee() {

    }
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double taxAmount = salary * incomeTax;
        System.out.println("Income tax amount for " + empId +", " + name + " is " + taxAmount);
    }
}
