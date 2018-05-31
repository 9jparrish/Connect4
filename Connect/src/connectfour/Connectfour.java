package connectfour;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Connectfour extends JFrame implements ActionListener{
private JPanel a = new JPanel();
private JButton[] header = new JButton[7];
private JLabel[] labels = new JLabel[42];
	
public Connectfour(){
	super("Connectfour");
	setSize(400, 400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	a.setLayout(new GridLayout(7, 7));
	
	for(int i = 0; i < 7; i++) {
		header[i] = new JButton("Drop");
		header[i].setOpaque(true);
		header[i].setBackground(Color.WHITE);
		header[i].setMaximumSize(new Dimension(40,40));
		header[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		String currentplace = Integer.toString(i);
		header[i].setActionCommand(currentplace);
		header[i].addActionListener(this);
		a.add(header[i]);
	}
	
	for(int i = 0; i < 42; i++) {
		
		labels[i] = new JLabel();
		labels[i].setOpaque(true);
		//labels[i].setBackground(Color.BLUE);
		labels[i].setHorizontalAlignment(SwingConstants.CENTER);
		labels[i].setVerticalAlignment(SwingConstants.CENTER);
		labels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		a.add(labels[i]);
		
	}
	add(a);
	setVisible(true);
}



public static void main(String[] args){
	 new Connectfour();
}



@Override
public void actionPerformed(ActionEvent e) {
	String action = e.toString();
	if(action == "0") {
		for(int i = 0; i < labels.length; i++) {
		 labels[i].setText("pushed");
		 a.add(labels[i]);
		}
		add(a);
		setVisible(true);
	}
	if(action == "1") {
		for(int i = 0; i < labels.length; i++) {
			 labels[i].setText("pushed");
			}
	}
	if(action == "2") {
		for(int i = 0; i < labels.length; i++) {
			 labels[i].setText("pushed");
			}
	}
	if(action == "3") {
		for(int i = 0; i < labels.length; i++) {
			 labels[i].setText("pushed");
			}
	}
	if(action == "4") {
		for(int i = 0; i < labels.length; i++) {
			 labels[i].setText("pushed");
			}
	}
	if(action == "5") {
		for(int i = 0; i < labels.length; i++) {
			 labels[i].setText("pushed");
			}
	}
	if(action == "6") {
		for(int i = 0; i < labels.length; i++) {
			 labels[i].setText("pushed");
			}
	}
	
}

}
