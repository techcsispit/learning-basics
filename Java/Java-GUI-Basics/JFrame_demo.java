import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class JFrame_demo {

    //JFrame- A GUI window to add components to.
    //JLabel- A GUI display area for a string of text, an image or both
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JLabel label =new JLabel();
        Border border=BorderFactory.createLineBorder(new Color(0,0,139), 2); //Creating a border object

        ImageIcon im=new ImageIcon("smiley.png"); //Creating an image icon with image file path as parameter
        frame.setIconImage(im.getImage()); //Setting icon of newly made frame
        frame.getContentPane().setBackground(Color.black); 

        //ADDING PROPERTIES TO JLabel


        label.setIcon(im); //Setting image icon to label
        label.setBounds(100,150,120,140);
        label.setText("I Like Source Start!");
        label.setForeground(Color.cyan);
        label.setFont(new Font("Times new roman", Font.ITALIC, 16));
        label.setHorizontalTextPosition(JLabel.CENTER); //Position can be LEFT, CENTER OR RIGHT
        label.setVerticalTextPosition(JLabel.TOP); //Position can be TOP, CENTER OR BOTTOM
        label.setIconTextGap(3); //Gap between image icon and text
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);


        //ADDING PROPERTIES TO THE JFrame

        frame.setVisible(true); //A must-add piece of code to have your frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Other options are DO_NOTHING_ON_CLOSE AND HIDE_ON_CLOSE
        frame.setTitle("SAMPLE GUI");
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.add(label); //Adding JLabel to the main display window, which is the JFrame.
        frame.pack();
    }
    
}
