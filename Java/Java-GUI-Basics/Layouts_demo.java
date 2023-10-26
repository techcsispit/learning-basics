import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layouts_demo implements ActionListener {
    
    /*FlowLayout- Places components in a row, sized at their preferred size. If the horizontal container is too small,
                 the FlowLayout class uses the next available row.  
      GridLayout- Places components within a grid of cells. Each component takes up all the available space with its cell 
                 and each cell is the same size.
    */            


    static JFrame frame;
    static JButton button1;
    static JButton button2;
    static JButton button3;
    static JButton button4;
    static JButton button5;
    static JPanel color_bar;
    static JPanel control_panel;

    public static void main(String[] args) {
        frame=new JFrame();
        button1 =new JButton("1");
        button2 =new JButton("2");
        button3 =new JButton("3");
        button4 =new JButton("4");
        button5 =new JButton("5");
        control_panel=new JPanel();
        color_bar =new JPanel();
        Layouts_demo ob=new Layouts_demo();

        color_bar.setBounds(0,750,1000,250);
        color_bar.setVisible(false);

        //Giving features to all JButtons

        button1.setBackground(Color.yellow);
        button1.setSize(100,100);
        button1.setFocusable(false);
        button1.addActionListener(ob);

        button2.setBackground(Color.yellow);
        button2.setSize(100,100);
        button2.setFocusable(false);
        button2.addActionListener(ob);

        button3.setBackground(Color.yellow);
        button3.setSize(100,100);
        button3.setFocusable(false);
        button3.addActionListener(ob);

        button4.setBackground(Color.yellow);
        button4.setSize(100,100);
        button4.setFocusable(false);
        button4.addActionListener(ob);

        button5.setBackground(Color.yellow);
        button5.setSize(100,100);
        button5.setFocusable(false);
        button5.addActionListener(ob);

        //Adding all JButtons to the control panel JPanel

        control_panel.setBackground(Color.GREEN);
        control_panel.setPreferredSize(new Dimension(300,450));
        control_panel.add(button1);
        control_panel.add(button2);
        control_panel.add(button3);
        control_panel.add(button4);
        control_panel.add(button5);
        //panel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        //LEADING aligns all components at the top-left, CENTER is default position AND TRAILING aligns all components in
        //top-left


        control_panel.setLayout(new GridLayout(3,2,3,3));
        //Parameters in order are no.of rows, no.of columns, horizontal spacing, vertical spacing


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FLOW/GRID LAYOUT!!!");
        frame.setSize(500,500);
        frame.getContentPane().setBackground(new Color(0,0,110));
        frame.setResizable(true);
        frame.add(control_panel);
        frame.add(color_bar);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //Method implemented by interface
        if (e.getSource() == button1){ //Executed if button1 is pressed
            color_bar.setBounds(00,750,2000,100);
            color_bar.setBackground(Color.BLACK);
            color_bar.setVisible(true);
        } else if (e.getSource() == button2){ //Executed if button2 is pressed
            color_bar.setBounds(00,750,2000,100);
            color_bar.setBackground(Color.RED);
            color_bar.setVisible(true);
        } else if (e.getSource() == button3){ //Executed if button3 is pressed
            color_bar.setBounds(00,750,2000,100);
            color_bar.setBackground(Color.ORANGE);
            color_bar.setVisible(true);
        } else if (e.getSource() == button4){ //Executed if button4 is pressed
            color_bar.setBounds(00,750,2000,100);
            color_bar.setBackground(Color.DARK_GRAY);
            color_bar.setVisible(true);
        } else if (e.getSource() == button5){ //Executed if button5 is pressed
            color_bar.setBounds(00,750,2000,100);
            color_bar.setBackground(Color.MAGENTA);
            color_bar.setVisible(true);
        }
    }
}