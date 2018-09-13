import javax.swing.JOptionPane;

public class romanNumeral {
    public static void main(String[] args) {
        int number;
        String input;
        
        input = JOptionPane.showInputDialog("Enter a number between 1 and 10: ");
        number = Integer.parseInt(input);
        
        switch (number) {
            case 1:
                JOptionPane.showMessageDialog(null, "I");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "II");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "III");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "IV");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "V");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "VI");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "VII");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "VIII");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "IX");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "X");
                break;
        }
        System.exit(0);
    }
}