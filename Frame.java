
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.LineBorder;


class Frame {

    // Private variables:
    private JFrame frame = new JFrame("Gravity-Simulator"); // new frame

    // Private methods:
    private JLabel newLabel(String text) {
        JLabel label = new JLabel(text); // create label
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        return label;
    };

    // private JButton Button(String text) {
    //     JButton button = new JButton(text); // create button
    //     button.setVerticalAlignment(JButton.CENTER);
    //     button.setHorizontalAlignment(JButton.CENTER);
    //     return button;
    // };

    
    public Frame() {
        frame.setSize(700,500); // set frame size
        frame.setLayout(new FlowLayout()); // set layout of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit command
    }

    // Methods for UI background:
    public void menuPage() {
        
        // new borderlayout with size
        JPanel panel = new JPanel();

        panel.add(newLabel("Gravity Simulator"));

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
                simulatorPage();
            }
        }
        ); 
        

    }

    public void simulatorPage() {

        JPanel panel = new JPanel();

        JButton backButton = new JButton("Back");
        backButton.setVerticalAlignment(JButton.CENTER);
        backButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(backButton);

        JButton settingsButton = new JButton("Settings");
        settingsButton.setVerticalAlignment(JButton.CENTER);
        settingsButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(settingsButton);

        panel.add(newLabel("Velocity ="));
        panel.add(newLabel("Force = "));

        frame.add(panel);
        frame.setVisible(true);

        backButton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                menuPage();
            }
        }
        );

        settingsButton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                settingsPage();
            }
        }
        );

    }

    public void settingsPage() {
        
        JPanel panel = new JPanel();

        panel.add(newLabel("Settings"));

        JButton backButton = new JButton("Back");
        backButton.setVerticalAlignment(JButton.CENTER);
        backButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(backButton);

        panel.add(newLabel("Acceleration of Gravity: "));
        panel.add(newLabel("Initial Velocity: "));

        frame.add(panel);
        frame.setVisible(true);

        backButton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                simulatorPage();
            }
        }
        );

    }

}

class Simulator extends Frame {
    
    JFrame frame = new JFrame();

    Simulator() {
        frame.setSize(700,500);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    };

    public void panel() {

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.blue));

        frame.add(panel);
        frame.setVisible(true);
    };

    public void drawObject() {};


}