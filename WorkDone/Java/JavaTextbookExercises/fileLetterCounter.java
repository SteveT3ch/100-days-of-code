import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

public class fileLetterCounter {
    public static void main(String[] args) throws IOException
    {
        //declare variables
        String inputFile, inputLetter, inputLine; 
        char convLetter;
        int count, result = 0;



        //Input file name
        JOptionPane.showMessageDialog(null, "Letter counter will count the number of times your desired letter appears in a word.");
        do {
            inputFile = JOptionPane.showInputDialog("Enter the name of the document to parse.");
        } while(!inputFile.matches("[a-zA-Z]+"));
        inputFile += ".txt";

        //Input letter
        do {
            inputLetter = JOptionPane.showInputDialog("Enter a letter.");
            convLetter = inputLetter.charAt(0);
        } while(Character.isDigit(convLetter));

        //Open file
        File file = new File(inputFile);

        //Setup Scanner
        Scanner fileOperate = new Scanner(file);

        //Count how many times a string appears
        while (fileOperate.hasNext()) {
            inputLine = fileOperate.nextLine();
            for (count = 0; count < inputLine.length(); count++) {
                if (inputLine.charAt(count) == convLetter) {
                    result++;
                }
            }
        }
        
        //Display result
        JOptionPane.showMessageDialog(null, "The letter " + inputLetter + " appears " + result + " times in the word " + inputFile + ".");
        System.exit(0);
    }
}