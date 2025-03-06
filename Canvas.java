
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




class Canvas {

    private JFrame frame = new JFrame("Gravity-Simulator"); // new canvas

    public Canvas() {
        frame.setSize(700,500); // set canvas size
        frame.setLayout(new FlowLayout()); // set layout of canvas
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit command
    }

    public void menu() {

        JPanel panel = new JPanel();
        frame.getContentPane();
        
        JLabel label = new JLabel("Gravity Simulation");
        Dimension size = label.getPreferredSize();
        label.setBounds(150,100, size.width, size.height);
        frame.add(label);

        JButton startButton = new JButton("Start");
        frame.add(startButton);
        frame.add(panel);
        frame.setVisible(true); // set the frame to be true
        

    }
    

}