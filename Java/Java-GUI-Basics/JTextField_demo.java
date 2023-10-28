import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextField_demo implements ActionListener { //To learn about JTextFields
                                              //And about JCheckBoxes

    //JTextField- A GUI component that can be used to add, set, or get text.
    //JCheckBox- A GUI component that can be selected or deselected


    static JFrame frame;
    static JButton button;
    static JTextField textfield;
    static String a;

    JTextField_demo() {
        frame = new JFrame();
        button = new JButton();
        textfield = new JTextField();
        ImageIcon im = new ImageIcon("smiley.png");

        //ADDING PROPERTIES TO ALL COMPONENTS

        textfield.setPreferredSize(new Dimension(200, 40));//set dimensions of text field
        textfield.setBackground(Color.black); //To set color of background
        textfield.setForeground(Color.GREEN); //To set color of font
        textfield.setCaretColor(Color.CYAN); 

        button.setText("Submit");
        button.setFont(new Font("Adobe Caslon Pro", Font.ITALIC, 14));
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.add(button);
        frame.add(textfield);
        frame.setIconImage(im.getImage());
        frame.setSize(200, 200);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == button) {
                a = textfield.getText();
                System.out.println("Username: " + a);
                frame.dispose();
            }
        } catch (Exception X){
            return;
        }
    }
}

 class Prompt_window implements ActionListener {
     static JButton button;
     static JFrame frame;
     static JCheckBox checkBox;
     int check=0;

     public static void main(String[] args) {
         frame = new JFrame();
         button = new JButton();
         checkBox = new JCheckBox();
         Prompt_window ob = new Prompt_window();

        //ADDING PROPERTIES TO ALL COMPONENTS

         button.setPreferredSize(new Dimension(150, 50));
         button.setText("Sumbit");
         button.addActionListener(ob);

         checkBox.setText("Are you a human?");
         checkBox.setFocusable(false);
         checkBox.setFont(new Font("Ubuntu Mono", Font.PLAIN, 13));

         frame.setSize(600,600);
         frame.add(checkBox);
         frame.add(button);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new FlowLayout());
         frame.setVisible(true);
     }

     @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == button) {
             if (checkBox.isSelected() == true) { //isSelected() returns true if checkbox is selected else false
                 frame.dispose();
                 new JTextField_demo();
                 check=1;
             }
               if(check==0){
                   frame.dispose();
               }
         }
     }
 }