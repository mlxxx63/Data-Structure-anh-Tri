import java.util.Arrays;
import java.util.Scanner;

public class carmain {
    public static void main(String[] args){   
        Scanner scan6 = new Scanner(System.in);  
        System.out.println("How many car do you want to input? ");
        int numberCar = scan6.nextInt();

        Car cars[] = new Car[numberCar];
        int finalsSpeed[] = new int[numberCar];

        for (int i = 0; i < numberCar; i++){  
            Scanner scan = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter brand");
            String brand = scan.nextLine();  // Read user input
    
            Scanner scan2 = new Scanner(System.in);  
            System.out.println("Enter plate");
            int plate = scan2.nextInt(); 
    
            Scanner scan5 = new Scanner(System.in);  
            System.out.println("Enter start speed: ");
            int speed = scan5.nextInt();

            cars[i] = new Car(plate, speed, brand);

            int storeSpeed = cars[i].caculate();
            finalsSpeed[i] = storeSpeed; 
        }

        System.out.println(Arrays.toString(cars));

        System.out.println(Arrays.toString(finalsSpeed));
        
        // Car c1 = new Car(plate, speed, brand);
        // c1.printPlate();
        // c1.ask();
        // c1.caculate();
    }
}
