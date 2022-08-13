package GUI;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.server.Operation;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
            private	int count=0;
            private	JLabel label;
            private	JFrame frame; 
            private	JPanel panel; 
	public  GUI() {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Click");
		button.addActionListener(this);
	    label = new JLabel("Number of Click: 0");

		panel =new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button); 
		panel.add(label);
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}
     public static void main(String[] args) {
		new GUI(); 
	}
     @Override
     public void actionPerformed(ActionEvent e) {
		count++;
	    label.setText("Number of clicks:" + count);
	}
}
