import javax.swing.JOptionPane;
import java.util.Random;

public class slotMachine {
    public static void main(String[] args) {
        //Declare variables
        int bet, roll, balance = 0;
        Random randomRoll = new Random();
        roll = randomRoll.nextInt(6);

        //Intro
        JOptionPane.showMessageDialog(null, "Welcome to the slot machine simulation. Are you ready to lose some money?");

        while(true) {
            //Enter betting amount
            bet = JOptionPane.showInputDialog("Enter how much money you would like to bet (in $):");
            System.out.println(bet);

            String result = "";
            //Roll 3 times to determine the result
            for (int count = 1; count <= 3; count++) {
                result += (String)roll;
                System.out.println(result);
            }

            //Outcome
            //NEED TO LEARN HOW TO CHECK IF STRING CHARACTERS ARE ALL THE SAME AND FIX
            if (result.charAt(0) == result.charAt(1) == result.charAt(2)) {
                int Earning = bet * 3;
                JOptionPane.showMessageDialog(null, "Jackpot! You have won $" + (String)Earning + "!");
            } //2 of the same
            //none of the same
            else {
                balance = -bet;
                JOptionPane.showMessageDialog(null, "Too bad! None of your slots are matching.");
                JOptionPane.showMessageDialog(null, "Your new balance is: " + (String)balance);
            }

            //Ask to play again
            do {
                char again = JOptionPane.showMessageDialog(null, "Play again? Y/N")
            } while (again != "Y" && again != "N" && again != "y" && again != "n");
            
            //Continue if yes
            if (again == "Y" || again == "y") {
                continue;
            } else {
                break;
            }
                
        }
        //Switch 0-5 for outcomes
        switch (roll)
        {
            case "0":
                slot = "Cherries";
                break;
            case "1":
                slot = "Oranges";
                break;
            case "2":
                slot = "Plums";
                break;
            case "3":
                slot = "Bells";
                break;
            case "4":
                slot = "Melons";
                break;
            case "5":
                slot = "Bars";
                break;
        }    
    }
}