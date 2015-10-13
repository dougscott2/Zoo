import java.util.Scanner;

/**
 * Created by DrScott on 10/13/15.
 */
public class Zoo {
    public static void main(String[] args) {//sweet sweet main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the name of an animal");
        String animalName = scanner.nextLine();
        Animal animal = createsAnimal(animalName);
        System.out.println(String.format("Created %s! YOU'RE A GOD!", animal));
    }//end main method

    static Animal createsAnimal(String animalName) {
        if (animalName.equals("Snek")){
             return new Snake();
        } else if(animalName.equals("Lion")){
                return new Lion();
        } else if (animalName.equals("Condor")){
                return new Condor();
        } else {
                return new Animal();
        }
    }
}

