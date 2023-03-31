import java.util.Scanner;

public class Car{
    String brand;
    int plate;
    int speed;
    int stopSpeed = 0;
    int increaseSpeed = 0;
    int decreaseSpeed = 0;

    Car(int plate, int speed, String brand){
        this.speed = speed;
        this.plate = plate;
        this.brand = brand;
    }

    void printPlate(){
        System.out.println(String.valueOf(plate));
    }

    void printBrand(){
        System.out.println(brand);
    }

    void printSpeed(){
        System.out.println(speed);
    }

    void ask(){
        System.out.println("------------------");
        System.out.println("The car infos are:");

        System.out.println(brand);
        System.out.println(plate);
    }

    int caculate(){
        boolean choose;
        boolean run = true;

        System.out.println("--------------------");


        while(run){
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to increase ? (Enter only true/ false)");
        choose = scan.nextBoolean();  // Read user input

        if (choose){ // = choose == true

            Scanner scan3 = new Scanner(System.in);  
            System.out.println("Enter increase speed(only +): ");
            increaseSpeed = scan3.nextInt();

            speed = speed + increaseSpeed;
            System.out.println("The speed after increasing is: " + speed);
        }

        if (!choose){  // = choose == false

            Scanner scan4 = new Scanner(System.in);  
            System.out.println("Enter decrease speed(only -): ");
            decreaseSpeed = scan4.nextInt();

            speed = speed - decreaseSpeed;
            System.out.println("The speed after decreasing is:" + speed);
        }

        Scanner scanask = new Scanner(System.in);  
        System.out.println("Do you want to continue? (Only true/false) ");
        run = scanask.nextBoolean();

        if(!run){
            System.out.println("The final speed of the car is: " + speed);
            return speed;
        }
    }
    return speed;
    }
}