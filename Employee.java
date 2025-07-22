//constructor with scanner
import java.util.Scanner;

public class Employee
{
	public static void main(String[] args) {
	    Scanner za = new Scanner(System.in);
	    
	    
	    System.out.print("Enter your name: ");
	    String Name = za.nextLine();
	    
	    System.out.print("Enter your age: ");
	    int age = za.nextInt();
	    za.nextLine();

	    System.out.print("Enter your PreviousJob: ");
	    String PreviousJob = za.nextLine();
	    
	    System.out.print("How many Years/Months Unemployed: ");
	    int YearsUnemployed =  za.nextInt();
	
	    String unit = (YearsUnemployed >= 12) ? "Years" : "Months";
	    
	    EmployeeDetails ED = new EmployeeDetails(Name, age, PreviousJob, YearsUnemployed);
	    
	    System.out.println("NAME: " + ED.Name + "\nAGE: " + ED.age + "\nPreviousJob: " + ED.PreviousJob
	    + "\nYearsUnemployed: " + ED.YearsUnemployed + " " + unit);
	    
		
	}
}

class EmployeeDetails{
    String Name;
    int age;
    String PreviousJob;
    int YearsUnemployed;
    
    
    EmployeeDetails(String Name, int age, String PreviousJob, int YearsUnemployed){
        this.Name = Name;
        this.age = age;
        this.PreviousJob = PreviousJob;
        this.YearsUnemployed = YearsUnemployed;
    }
    
}