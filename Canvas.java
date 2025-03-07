
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        Canvas canvas = new Canvas();

        JPanel panel = new JPanel();
        canvas.frame.getContentPane();
        
        JLabel label = new JLabel("Gravity Simulation");
        Dimension size = label.getPreferredSize();
        label.setBounds(100, 100, size.width, size.height);
        panel.add(label);

        JButton startButton = new JButton("Start");
        startButton.setBounds(100, 100, size.width, size.height);
        panel.add(startButton);
        canvas.frame.add(panel);
        canvas.frame.setVisible(true); // set the frame to be true

        startButton.addActionListener(new ActionListener() {
            // Code inside actionPerformed will run whenever startButton is clicked
            // This method can only be called when actionPerformed
            public void actionPerformed(ActionEvent e) {
                // open simulator canvas
                canvas.simulator();
            }
        }
        ); 
        

    }

    public void simulator() {
        Canvas canvas = new Canvas();

        JPanel panel = new JPanel();
        canvas.frame.getContentPane();
        
        JButton backButton = new JButton("Back");
        backButton.setBounds(100, 100, 100, 100);
        panel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            // Code inside actionPerformed will run whenever startButton is clicked
            // This method can only be called when actionPerformed
            public void actionPerformed(ActionEvent e) {
                // open main menu canvas
                canvas.menu();
            }
        }
        );

        JLabel label2 = new JLabel("velocity = ");
        Dimension size2 = label2.getPreferredSize();
        label2.setBounds(100, 100, size2.width, size2.height);
        panel.add(label2);

        canvas.frame.add(panel);
        canvas.frame.setVisible(true);

    }

}