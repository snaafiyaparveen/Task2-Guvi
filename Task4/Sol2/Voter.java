package Task4.Sol2;

public class Voter {
    int voterId;
    String name;
    int age;

    public Voter(){

    }
    public Voter(int voterId, String name, int age) throws InvalidVotingAge {
        this.voterId = voterId;
        this.name = name;
        this.age = age;

        if(age < 18){
            throw new InvalidVotingAge("InvalidVotingAge: You aren't above 18, so you can't vote");
        }
    }

    public void display(){
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
