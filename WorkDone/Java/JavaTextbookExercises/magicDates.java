import javax.swing.JOptionPane;

public class magicDates {
    public static void main(String[] args) {
        String input;
        int day, month, year;

        JOptionPane.showMessageDialog(null, "Find out if the special date you hold dear is indeed magic!");
        
        //If any inputs are out of range, the input prompt will repeat
        do {
            day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day of the month: "));
        } while (day < 0 || day > 32); //Day must be between 1-31
        
        do {
            month = Integer.parseInt(JOptionPane.showInputDialog("Enter the numerical month: "));
        } while (month < 0 || month > 13); //Month must be between 1-12
        
        do {
            year = Integer.parseInt(JOptionPane.showInputDialog("Enter the last two digits of the year: "));
        } while (year < 0 || year > 100); //Year must be a positive, two-digit integer
        
        if (day * month == year) {
            JOptionPane.showMessageDialog(null, "This date is magic!");
        } else {
            JOptionPane.showMessageDialog(null, "This date is unfortunately not magic.");
        }
        System.exit(0);
    }
}