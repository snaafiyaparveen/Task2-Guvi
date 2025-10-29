package Task2.sol1;

public class Person {
    String name;
    int age = 18;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("The name is "+ getName());
        System.out.println("The age is "+ age);
    }

}

