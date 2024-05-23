package Bai4_BT4_Bai3;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
    private JButton plainJButton; // button with just text
    private JButton fancyJButton; // button with icons
    // ButtonFrame adds JButtons to JFrame

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout()); // set frame layout

        Icon bug1 = new ImageIcon(getClass().getResource("img/bug1.GIF"));
        Icon bug2 = new ImageIcon(getClass().getResource("img/bug2.GIF"));

        plainJButton = new JButton("Plain Button"); // button with text
        fancyJButton = new JButton("Fancy Button", bug1); // set image

        fancyJButton.setRolloverIcon(bug2); // hover's event

        add(plainJButton); // add plainJButton to JFrame
        add(fancyJButton); // add fancyJButton to JFrame

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();

        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);

        this.setVisible(true);
        this.setSize(1000, 500);

    } // end ButtonFrame constructor
      // inner class for button event handling

    private class ButtonHandler implements ActionListener {
        // handle button event
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        } // end method actionPerformed
    } // end private inner class ButtonHandler

} // end class ButtonFrame