package Task4.Sol1;

public class student {
    int rollNo;
    String name;
    int age;
    String course;
    public student() {

    }
    public student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

        if(age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException: Age not in range");
        }else
        if (!name.matches("[a-zA-Z]+")){
            throw new NameNotValidException("NameNotValidException: Name must not contain a special character");
        }
    }

    public void display(){
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
