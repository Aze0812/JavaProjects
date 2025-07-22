import java.util.Scanner;

//base class
class Superhero{
    String name, Superpower;

    public void getHeroDetails(){

        Scanner za = new Scanner(System.in);

        System.out.print("Enter hero name: ");
        name = za.nextLine();

        System.out.print("Enter Hero Superpower: ");
        Superpower =  za. nextLine();
    }
    
    public void displaySuperhero(){
        System.out.println("-------SuperHero Details--------------");
        System.out.println("Hero's name: " + name);
        System.out.println("Hero's Superpower: " + Superpower);
        
    }
}


    //subclass extends base class
    class Abilities extends Superhero{
        String HeroAbilities;

            public void getHeroAbilities(){
                super.getHeroDetails();

        Scanner za = new Scanner(System.in);

            System.out.print("Enter Hero's Ability: ");
                HeroAbilities = za.nextLine();
        }

        public void displayHeroAbilities(){
            super.displaySuperhero();
            System.out.println("Hero's Abilities: " + HeroAbilities);
            System.out.println("-----------------------------------");
        }
    }

public class SuperHeroes {
    public static void main(String[] args) {

        //subclass var = new var ();

        Abilities ab = new Abilities();

        ab.getHeroAbilities();
        ab.displayHeroAbilities();
        
        
    }
}
