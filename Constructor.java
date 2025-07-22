import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        // Create a StudentInformation object and use the first constructor
        StudentInformation si = new StudentInformation();

        // Display the student's information
        si.display();
    }
}

class StudentInformation {
    String Firstname, Middlename, Lastname;
    int age;

    // Constructor to input name
    StudentInformation() {
        Scanner za = new Scanner(System.in);

        System.out.println("Enter your Firstname: ");
        this.Firstname = za.nextLine();
        System.out.println("Enter your Middlename: ");
        this.Middlename = za.nextLine();
        System.out.println("Enter your Lastname: ");
        this.Lastname = za.nextLine();

        System.out.println("Enter your age: ");
        this.age = Integer.parseInt(za.nextLine());
    }

    // Display method
    public void display() {
        System.out.println("Your name is " + Firstname + " " + Middlename + " " + Lastname);
        System.out.println("Your age is " + age);
    }
}
