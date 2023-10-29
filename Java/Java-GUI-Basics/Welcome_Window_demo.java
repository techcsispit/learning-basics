import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Welcome_Window_demo implements ActionListener { 

    //JLayeredPane- A Swing container that provides a third dimensio  for positioning components. Ex: Depth.
    //Names of layers depthwise: Drag, PopUp, Modal, Palette and Default.

    static JFrame frame;
    static JLayeredPane jp;
    static JLabel label1;
    static JLabel label2;
    static JLabel label3;
    static JLabel label4;
    static JLabel label5;
    static JLabel label6;
    static JLabel label7;
    static JLabel label8;
    static JButton b;

    Welcome_Window_demo() {
         frame=new JFrame();
         jp=new JLayeredPane();
         label1=new JLabel();
         label2=new JLabel();
         label3=new JLabel();
         label4=new JLabel();
         label5=new JLabel();
         label6=new JLabel();
         label7=new JLabel();
         label8=new JLabel();
         b=new JButton();
         ImageIcon imageIcon=new ImageIcon("thumbs_up.png");

        b.setPreferredSize(new Dimension(150,100));
        b.setText("SOURCE START!!");
        b.setFocusable(false);
        b.setBackground(new Color(255,215,0));
        b.setFont(new Font("Times New roman", Font.ITALIC,12));
        b.setForeground(new Color(235, 223, 208));
        b.setBorder(BorderFactory.createLineBorder(Color.green,2));
        b.setBounds(725,300,150,100);
        b.addActionListener(this);

        jp.setBounds(0,0,2000,1000);

        label1.setBounds(0,00,200,200);
        label1.setIcon(imageIcon);


        label2.setBounds(200,200,200,200);
        label2.setIcon(imageIcon);


        label3.setBounds(400,400,200,200);
        label3.setIcon(imageIcon);


        label4.setBounds(600,600,200,200);
        label4.setIcon(imageIcon);


        label5.setBounds(820,600,200,200);
        label5.setIcon(imageIcon);


        label6.setBounds(1020,400,200,200);
        label6.setIcon(imageIcon);


        label7.setBounds(1220,200,200,200);
        label7.setIcon(imageIcon);

        label8.setBounds(1420,00,200,200);
        label8.setIcon(imageIcon);

        jp.add(label1, JLayeredPane.DEFAULT_LAYER);
        jp.add(label2, JLayeredPane.PALETTE_LAYER);
        jp.add(label3, JLayeredPane.MODAL_LAYER);
        jp.add(label4, JLayeredPane.POPUP_LAYER);
        jp.add(label5, JLayeredPane.DEFAULT_LAYER);
        jp.add(label6, JLayeredPane.PALETTE_LAYER);
        jp.add(label7, JLayeredPane.MODAL_LAYER);
        jp.add(label8, JLayeredPane.POPUP_LAYER);
        jp.setVisible(false);

        frame.setTitle("2ND WINDOW");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.add(jp);
        frame.add(b);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b ){
                jp.setVisible(true);
                b.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new NewWindow();
    }
}

class NewWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton jb = new JButton();
    ImageIcon icon = new ImageIcon("yellow.png");

    NewWindow() {
        jb.setText("Please click me");
        jb.setBackground(Color.ORANGE);
        jb.setBounds(650, 300, 200, 150);
        jb.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        jb.setForeground(Color.BLUE);
        jb.setFont(new Font("Times New Roman", Font.ITALIC, 14));
        jb.addActionListener(this);
        jb.setFocusable(false);

        frame.setTitle("WELCOME WINDOW");
        frame.setIconImage(icon.getImage());
        frame.add(jb);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb) {
            frame.dispose();
            new Welcome_Window_demo();
        }
    }
}
