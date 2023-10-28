import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButton_demo implements ActionListener { //Practice for JRadioButton
    static JFrame frame;
    static JLabel LABEL;
    static JRadioButton jrb1;
    static JRadioButton jrb2;
    static JRadioButton jrb3;
    public static void main(String[] args) {
        frame=new JFrame();
        frame.setLayout(new FlowLayout());
        LABEL=new JLabel();
        jrb1=new JRadioButton("Mystery emoji 1");
        jrb2=new JRadioButton("Mystery emoji 2");
        jrb3=new JRadioButton("Mystery emoji 3");
        JRadioButton_demo ob=new JRadioButton_demo();

        ButtonGroup bg=new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);

        jrb1.addActionListener(ob);
        jrb2.addActionListener(ob);
        jrb3.addActionListener(ob);

        frame.add(jrb1);
        frame.add(jrb2);
        frame.add(jrb3);
        frame.setTitle("MYSTERY EMOJI GAME");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jrb1){
            LABEL.setBounds(100,100,200,200);
            LABEL.setIcon(new ImageIcon("smiley.png"));
            frame.add(LABEL, FlowLayout.LEADING);
            frame.setVisible(true);

        }  else if(e.getSource()==jrb2){
            LABEL.setBounds(100,100,200,200);
            LABEL.setIcon(new ImageIcon("thumbs_up.png"));
            frame.add(LABEL, FlowLayout.LEADING);
            frame.setVisible(true);

        }  else if(e.getSource()==jrb3){
            LABEL.setBounds(100,100,200,200);
            LABEL.setIcon(new ImageIcon("halloween_pumpkin.png"));
            frame.add(LABEL, FlowLayout.LEADING);
            frame.setVisible(true);

        }
        jrb3.setEnabled(false);
        jrb2.setEnabled(false);
        jrb1.setEnabled(false);
    }
}
