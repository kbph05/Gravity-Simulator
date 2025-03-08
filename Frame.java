
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Frame {

    private JFrame frame = new JFrame("Gravity-Simulator"); // new frame

    public Frame() {
        frame.setSize(700,500); // set frame size
        frame.setLayout(new FlowLayout()); // set layout of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit command
    }

    public void menu() {
        
        // new borderlayout with size
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Gravity Simulation"); // create label
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        panel.add(label);

        JButton startButton = new JButton("Start");
        startButton.setVerticalAlignment(JButton.CENTER);
        startButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(startButton);
        
        frame.add(panel);
        frame.setVisible(true);

        startButton.addActionListener(new ActionListener() {
            // Code inside actionPerformed will run whenever startButton is clicked
            // This method can only be called when actionPerformed
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                simulator();
            }
        }
        ); 
        

    }

    public void simulator() {

        JPanel panel = new JPanel();

        JButton backButton = new JButton("Back");
        backButton.setVerticalAlignment(JButton.CENTER);
        backButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(backButton);

        JButton settingsButton = new JButton("Settings");
        settingsButton.setVerticalAlignment(JButton.CENTER);
        settingsButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(settingsButton);

        JLabel label2 = new JLabel("Velocity = ");
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);

        JLabel label3 = new JLabel("Force = ");
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label3);

        frame.add(panel);
        frame.setVisible(true);

        backButton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                menu();
            }
        }
        );

        settingsButton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                settings();
            }
        }
        );

    }

    public void settings() {
        
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Settings");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        panel.add(label);

        JButton backButton = new JButton("Back");
        backButton.setVerticalAlignment(JButton.CENTER);
        backButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(backButton);

        JLabel gravityLabel = new JLabel("Acceleration of Gravity: ");
        gravityLabel.setVerticalAlignment(JLabel.CENTER);
        gravityLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(gravityLabel);

        JLabel massLabel = new JLabel("Mass: ");
        massLabel.setVerticalAlignment(JLabel.CENTER);
        massLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(massLabel);

        frame.add(panel);
        frame.setVisible(true);

        backButton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                simulator();
            }
        }
        );

    }

}