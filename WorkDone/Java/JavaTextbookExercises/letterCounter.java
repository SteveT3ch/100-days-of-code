import javax.swing.JOptionPane;

public class letterCounter {
    public static void main(String[] args) {
        //declare variables
        String inputWord, inputLetter; 
        char convLetter;
        int count, result = 0;

        //Input string
        JOptionPane.showMessageDialog(null, "Letter counter will count the number of times your desired letter appears in a word.");
        do {
            inputWord = JOptionPane.showInputDialog("Enter any word.");
        } while(!inputWord.matches("[a-zA-Z]+"));

        //Input letter
        do {
            inputLetter = JOptionPane.showInputDialog("Enter a letter.");
            convLetter = inputLetter.charAt(0);
        } while(Character.isDigit(convLetter));

        //Count how many times a string appears
        for (count = 0; count < inputWord.length(); count++) {
            if (inputWord.charAt(count) == convLetter) {
                result++;
            }
        }
        //Display result
        JOptionPane.showMessageDialog(null, "The letter " + inputLetter + " appears " + result + " times in the word " + inputWord + ".");
        System.exit(0);
    }
}