//Chapter 4 Programming Challanges #2
import java.util.Scanner;
import java.io.*;

public class distanceTraveled {
    public static void main(String[] args) throws IOException
    {
        //init variables
        int speedInput, timeInput, result = 0;
        Scanner keyboard = new Scanner(System.in);
        String filename;

        //Input speed of vehicle (in miles per hour). Must be positive and not 0.
        do {
            System.out.print("Enter the speed you were traveling at (in miles/hour): ");
            speedInput = keyboard.nextInt();
        } while(speedInput < 0 || speedInput == 0);

        //Input number of hours it has traveled
        do {
            System.out.print("Enter how many hours your journey took: ");
            timeInput = keyboard.nextInt();
        } while(timeInput < 0 || timeInput == 0);

        //Clear nextLine() after nextInt();
        keyboard.nextLine();

        //Name a new file to create report
        System.out.print("Name the distance traveled report: ");
        filename = (keyboard.nextLine()) + ".txt";

        //Create file
        PrintWriter reportFile = new PrintWriter(filename);

        //Creater report header
        reportFile.println(" Hour    Distance Traveled ");
        System.out.println(" Hour    Distance Traveled ");
        reportFile.println("---------------------------");
        System.out.println("---------------------------");

        // Hour    Distance Traveled
        //---------------------------
        // 1              40
        // 2              80
        // 3              120

        //For loop to calculate distance traveled; Distance = Speed * Time;
        for (int count = 1; count <= timeInput + 1; count++) {
            result += (speedInput * timeInput);
            reportFile.println(" " + count + "              " + result);
            System.out.println(" " + count + "              " + result);
        }

        reportFile.close();
        System.out.println("Report generated.");
    }
}
