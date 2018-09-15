import java.util.Scanner;
import java.io.*;

public class penniesForPay {
    public static void main(String[] args) throws IOException 
    {
        //declare variables
        int timeInput, day;
        String logName;
        double total = 0;

        //set up Scanner;
        Scanner input = new Scanner(System.in);

        //Input period of time (in days)
        System.out.print("Enter the duration (in days): ");
        timeInput = input.nextInt();
        
        //Consume nextLine();
        input.nextLine();

        //Create log file;
        System.out.print("Create a name for your report: ");
        logName = (input.nextLine() + ".txt");
        PrintWriter logFile = new PrintWriter(logName);

        //Create header for table
        //Template:
        // Day      Earned ($)
        //----------------------
        //  1         0.01
        //  2         0.02
        logFile.println(" Day      Earned ($) ");
        System.out.println(" Day      Earned ($) ");
        logFile.println("----------------------");
        System.out.println("----------------------");

        //Loop to earn +=0.01 per day
        for (day = 1; day <= timeInput + 1; day++) {
            total += (0.01 * day);
            logFile.printf("  %d         %.2f",day, total);
            logFile.println();
            System.out.printf("  %d         %.2f",day, total);
            System.out.println();
        }
        //Close file
        logFile.close();
        System.out.println("Pennies for Pay calculation complete. See report for more information.");
    }
}