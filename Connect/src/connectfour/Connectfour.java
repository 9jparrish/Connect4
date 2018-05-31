package connectfour;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Connectfour extends JFrame implements ActionListener{
private JPanel a = new JPanel();
private JButton[] header = new JButton[7];
private JLabel[][] labels = new JLabel[6][7];
int i = 0;
int j = 0;
	
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
		//header[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		a.add(header[i]);
		header[i].addActionListener(this);
		String currentplace = Integer.toString(i);
		header[i].setActionCommand(currentplace);
	}
	
	for(i = 0; i < labels.length; i++) {
		{
			for(j = 0; j < labels[i].length; j++) {

				labels[i][j] = new JLabel();
				labels[i][j].setOpaque(true);
				//labels[i].setBackground(Color.BLUE);
				labels[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				labels[i][j].setVerticalAlignment(SwingConstants.CENTER);
				labels[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				a.add(labels[i][j]);
			}
		}
		
		
	}
	add(a);
	setVisible(true);
}



public static void main(String[] args){
	 new Connectfour();
}



@Override
public void actionPerformed(ActionEvent e) {
	String action = e.getActionCommand();
	System.out.println(action);
	if(action.equals("0")) {
		for(i = 0; i < labels.length; i++) {
				for(j = 0; j < labels[i].length; j++) {
					if(j == 0) {
						labels[i][j].setText("yup");
					}
			}
		}
	}
	if(action.equals("1")) {
		for(i = 0; i < labels.length; i++) {
				for(j = 0; j < labels[i].length; j++) {
					if(j == 1) {
						labels[i][j].setText("yup");
					}
				}
		}
	}
	if(action.equals("2")) {
		for(i = 0; i < labels.length; i++) {
				for(j = 0; j < labels[i].length; j++) {
					if(j == 2) {
						labels[i][j].setText("yup");
					}
				}
		}
	}
	if(action.equals("3")) {
		for(i = 0; i < labels.length; i++) {
				for(j = 0; j < labels[i].length; j++) {
					if(j == 3) {
						labels[i][j].setText("yup");
					}
				}
			}
	}
	if(action.equals("4")) {
		for(i = 0; i < labels.length; i++) {
				for(j = 0; j < labels[i].length; j++) {
					if(j == 4) {
						labels[i][j].setText("yup");
					}
				}
		}
	}
	if(action.equals("5")) {
		for(i = 0; i < labels.length; i++) {
				for(j = 0; j < labels[i].length; j++) {
					if(j == 5) {
						labels[i][j].setText("yup");
					}
				}
		}
	}
	if(action.equals("6")) {
		for(i = 0; i < labels.length; i++) {
				for(j = 0; j < labels[i].length; j++) {
					if(j == 6) {
						if(!(labels[i][j].getText().equals("yup"))) {
							labels[i][j].setText("yup");
							break;
						}
						break;
					}
					
				}
		}
	}	
}
}


