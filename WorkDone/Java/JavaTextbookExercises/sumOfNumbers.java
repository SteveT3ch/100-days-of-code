import javax.swing.JOptionPane;

public class sumOfNumbers {
    public static void main(String[] args) {
        //declare variables
        String inputNumber;
        int input, result = 0;
        
        //User input for positive nonzero integer value
        do {
            inputNumber = JOptionPane.showInputDialog("Enter a positive, nonzero integer.");
            input = Integer.parseInt(inputNumber);
        } while(input < 0 || input == 0);
        
        for (int count = 0; count <= input; count++) {
            result += count;
        }

        //Use loop to get the sum of all integers from 1 up to the number entered.
        JOptionPane.showMessageDialog(null, "The sum of 1 to "+ input + " is " + result + ".");
    }
}