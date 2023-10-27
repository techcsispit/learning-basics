import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton_demo implements ActionListener {

    //JButton- A button that performs an action when clicked on.
    //JPanel- A GUI component that functions as a container to hold other components.
    //An ActionListener interface has been implemented to direct flow of control whenever JButton is clicked


    static JFrame frame;
    static JLabel label;
    static JPanel panel;
    static JButton button;
    static JPanel buttonpanel;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {//This method is executed only when JButton is clicked
        if(e.getSource() == button){
        panel.setVisible(true); //When JButton is clicked, hidden JPanel is displayed
        button.setEnabled(false); //After being clicked once, JButton is now no longer in action
        }
    }

    public static void main(String[] args) {
        JButton_demo ob=new JButton_demo(); 
        frame=new JFrame();
        label=new JLabel();
        panel=new JPanel(); //Creating a new JPanel
        button=new JButton();//Creating a new button object
        buttonpanel=new JPanel();
        ImageIcon ii=new ImageIcon("smiley.png");
        Border border=BorderFactory.createLineBorder(new Color(128,0,128), 4);

        //GIVING PROPERTIES TO JButton

        button.setBounds(0,0,200,100);
        button.setText("First button");
        button.addActionListener(ob); //This action listener is reposible to execute any action when button is clicked
        button.setFont(new Font("Adobe Caslon pro",Font.ITALIC,16));
        button.setFocusable(false);
        button.setBackground(Color.GREEN);
        button.setForeground(Color.DARK_GRAY);

        //Giving properties to JLabel which is supposed to pop up after button is clicked

        label.setText("SOURCE START OP!");
        label.setIcon(ii);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Adobe Caslon pro", Font.ITALIC, 18));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(border);

        //Giving properties to JPanel which is supposed to hold the JLabel

        panel.setBackground(new Color(0,120,255));
        panel.setBounds(250,150,800,500);
        panel.setLayout(new BorderLayout());
        panel.add(label);
        panel.setVisible(false);

        //Giving properties to JPanel to hold JButton

        buttonpanel.setBackground(Color.WHITE);
        buttonpanel.setBounds(100,0,200,150);
        buttonpanel.add(button);
        button.setVerticalAlignment(JButton.CENTER);
        button.setHorizontalAlignment(JButton.CENTER);
        buttonpanel.setLayout(new BorderLayout());

        //Setting up JFrame

        frame.setTitle("SECOND GUI");
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setIconImage(ii.getImage());
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(450,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.add(buttonpanel);
    }

    
}
