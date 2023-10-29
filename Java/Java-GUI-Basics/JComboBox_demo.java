import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_demo extends JFrame implements ActionListener {
    String options[] = {"JButton_demo", "JFrame_demo", "JOption_Pane_demo"};
    //int options[] = {0,1,2};
    JComboBox jcombobox;
    String select;
    JButton b;

    JComboBox_demo() {
        this.setLayout(new FlowLayout());
        jcombobox = new JComboBox(options);
        b = new JButton();
        

        b.setPreferredSize(new Dimension(200, 200));
        b.setText("SUBMIT");
        b.setBounds(0, 0, 100, 60);
        b.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.add(jcombobox);
        this.add(b);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            if ((""+jcombobox.getItemAt(jcombobox.getSelectedIndex())).equalsIgnoreCase("GUI2")) {
                 JButton_demo ob=new JButton_demo();
                ob.main(new String[]{"", ""});
                this.dispose();
            } else if ((""+jcombobox.getItemAt(jcombobox.getSelectedIndex())).equalsIgnoreCase("GUI3")) {
                JFrame_demo ob=new JFrame_demo();
                ob.main(new String[]{"",""});
                this.dispose();
            } else {
                JOption_Pane_demo ob=new JOption_Pane_demo();
                ob.main(new String[]{""});
                this.dispose();
            }
        }
    }
    public static void main(String[] args) {
        new JComboBox_demo();
    }
}
