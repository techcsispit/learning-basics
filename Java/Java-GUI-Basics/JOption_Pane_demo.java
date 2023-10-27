import javax.swing.*;

public class JOption_Pane_demo { 

    //Pops up a standard dialog box that prompts users for a value or informs them of something.

    /*For a message dialog: JOptionPane.showMessageDialog(parentComponent, message, title, message_type); 
     * parent component can be null, message is the message you want to display in string, title
     * is again a string. And for message type, you can have JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
     * JOptionPane.QUESTION_MESSAGE, JOptionPane.WARNING_MESSAGE and JOptionPane.ERROR_MESSAGE
     * 
     * For an inpur receiving message: JOptionPane.showInputDialog(message);
     * You can prompt the user to enter anything with this Option Pane type and store the response in any string variable
     * or array.
     * 
     * For a confirmation message: JOptionPane.showConfirmDialog(parentComponent, message, title, message_type);
     * parent component can be null, message is the message you want to display in string, title
     * is again a string. And for message_type, it can be a JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION
     * or JOptionPane.YES_OPTION
    */

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("What is your name buddy?");
        if (a != null) {
            int ch = JOptionPane.showConfirmDialog(null, "ARE YOU READDDDYYY FOR SOURCE START, " + a + " ???", "FIRST DIALOGUEBOX", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ch == 0) {
                NewWindow ob=new NewWindow();
            } else if (ch == 1 || ch == 2) {
                JOptionPane.showMessageDialog(null, "You are done. Thankyou", "Done", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You are done. Thankyou", "Done", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
