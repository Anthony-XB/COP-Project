package cop2805;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class readfile {
	
	public class MyGui {

	    public static void main(String[] args) {

	        // create a frame and set its size and layout
	        JFrame frame = new JFrame("My GUI");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 150);
	        frame.setLayout(new BorderLayout());

	        // create a label with a message
	        JLabel label = new JLabel("Enter your name:");
	        frame.add(label, BorderLayout.NORTH);

	        // create a text field for the user's input
	        JTextField textField = new JTextField();
	        frame.add(textField, BorderLayout.CENTER);

	        // create a button that triggers an action
	        JButton button = new JButton("Say Hello");
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String name = textField.getText();
	                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
	            }
	        });
	        frame.add(button, BorderLayout.SOUTH);

	        // display the frame to the user
	        frame.setVisible(true);
	    }
	}
	
}
