import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*This project is a graphical representation of how to integrate many GUI components together and have them work in sync.
 * In this project, I have demonstrated how an RFID(Radio frequency identification) scanner behaves when an RFID tag is
 * brought close to it. I have tried to be as accurate as I could while depicting the changing magnetic fields, and 
 * am solely responsible for any irrelevances display in this self-made GUI project. 
 */




public class RFID_Demo extends JFrame implements KeyListener {


    //KeyListener interface is implemented as user is expected to press keys to interact with the UI

    //Declaring all variables to store the necesary RFID components

    JLabel card;
    JLabel scanner;
    JLabel antenna;
    JLabel initial_field_lines;
    JLabel tag_circuit;
    JLabel final_field_lines;
    JLayeredPane layered_pane;
    JLabel finalcircuit;

    ImageIcon credit_card=new ImageIcon("card_rotated.png");
    ImageIcon credit_card_scanner=new ImageIcon("creditscanner.png");
    ImageIcon antenna1=new ImageIcon("coil_transparent.png");
    ImageIcon magnetic_field_1=new ImageIcon("mag_field.png");
    ImageIcon circuit=new ImageIcon("rotated_coil.png");
    ImageIcon magnetic_field_2=new ImageIcon("gray.png");
    ImageIcon final_circuit = new ImageIcon("rotated_coil_light.png");

    RFID_Demo(){
        layered_pane=new JLayeredPane();
        card=new JLabel();
        scanner=new JLabel();
        antenna=new JLabel();
        initial_field_lines=new JLabel();
        tag_circuit=new JLabel();
        final_field_lines=new JLabel();
        finalcircuit=new JLabel();

        //ADDING PROPERTIES TO ALL THE GUI ELEMENTS

        antenna.setBounds(425,275,75,75); //setBounds sets initial position
        antenna.setIcon(antenna1); //setIcon is used to add image to the UI variable
        antenna.setVisible(false); //setVisible is used to set visibility status

        card.setBounds(900,300,150,200);
        card.setIcon(credit_card);
        card.setVisible(false);

        tag_circuit.setBounds(780,320,120,160);
        tag_circuit.setIcon(circuit);
        tag_circuit.setVisible(false);

        initial_field_lines.setBounds(290,120,350,350);
        initial_field_lines.setIcon(magnetic_field_1);
        initial_field_lines.setVisible(false);

        scanner.setBounds(300,300,125,250);
        scanner.setIcon(credit_card_scanner);
        scanner.setVisible(false);

        final_field_lines.setBounds(350,150,350,350);
        final_field_lines.setIcon(magnetic_field_2);
        final_field_lines.setVisible(false);

        layered_pane.setBounds(0,0,1500,1500);
        layered_pane.add(tag_circuit,400);
        layered_pane.add(final_field_lines,JLayeredPane.DRAG_LAYER);
        layered_pane.add(initial_field_lines,0);
        layered_pane.add(scanner,400);
        layered_pane.add(antenna,400);

        this.getContentPane().setBackground(new Color(76,76,76));
        this.setLayout(null);
        this.add(layered_pane);
        this.add(finalcircuit);
        this.add(antenna);
        this.add(card);
        this.add(scanner);
        this.add(tag_circuit);
        this.add(final_field_lines);
        this.add(initial_field_lines);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("RFID SIMULATOR");
        this.setSize(420,420);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    public void keyTyped(KeyEvent e) { //Default method inherited due to interface implementation
        switch (e.getKeyChar()) {
            case 'z' -> {
                scanner.setVisible(true);
                antenna.setVisible(true);
            }
            case 'x' -> card.setVisible(true);
            case 'c' -> initial_field_lines.setVisible(true);
            case 'v' -> tag_circuit.setVisible(true);
            //case 'b' -> connectedfield.setVisible(true);
            case 'a' -> {
                card.setLocation(card.getX()-5, card.getY() );
                tag_circuit.setLocation(tag_circuit.getX()-5, tag_circuit.getY() );
                finalcircuit.setLocation(finalcircuit.getX()-5,finalcircuit.getY());
                if(tag_circuit.getX() < 550 && tag_circuit.getY() <500){
                    final_field_lines.setVisible(true);
                    initial_field_lines.setVisible(false);
                    finalcircuit.setBounds(tag_circuit.getX(), tag_circuit.getY(),120,160);
                    finalcircuit.setIcon(final_circuit);
                    finalcircuit.setVisible(true);
                    tag_circuit.setVisible(false);
                }
            }
            case 'd' -> {
                card.setLocation(card.getX() + 5, card.getY());
                tag_circuit.setLocation(tag_circuit.getX() + 5, tag_circuit.getY());
                finalcircuit.setLocation(finalcircuit.getX()+5,finalcircuit.getY());
                if(finalcircuit.getX() >550){
                    final_field_lines.setVisible(false);
                    initial_field_lines.setVisible(true);
                    finalcircuit.setVisible(false);
                    tag_circuit.setVisible(true);
                }
            }
            case 'w' -> {
                card.setLocation(card.getX(), card.getY()-5 );
                tag_circuit.setLocation(tag_circuit.getX(), tag_circuit.getY()-5 );
                finalcircuit.setLocation(finalcircuit.getX(),finalcircuit.getY()-5);
            }
            case 's' -> {
                card.setLocation(card.getX(), card.getY()+5);
                tag_circuit.setLocation(tag_circuit.getX() , tag_circuit.getY()+5);
                finalcircuit.setLocation(finalcircuit.getX(),finalcircuit.getY()+5);
            }
        }
    }

    public void keyPressed(KeyEvent e) {}//Default method inherited due to interface implementation
    public void keyReleased(KeyEvent e) {}//Default method inherited due to interface implementation

    /*INSTRUCTIONS TO USE:
     * 0] Right click and run code
     * 1] Press 'Z' for credit card scanner and antenna to appear
     * 2] Press 'X' for credit card to appear
     * 3] Press 'C' for initial magnetic field to appear
     * 4] Press 'V' for credit card circuit to appear
     * 5] Use WASD controls to bring credit card close to scanner
     * 6] Once card is close enough, the magnetic field will change and current will flow through the card's circuit
     * 7] That is Faraday's law. Changing magnetic field produces current. The principle upon which RFID is based.
     * 8] Enjoy
     */

    public static void main(String[] args) {
        new RFID_Demo();
    }

}
