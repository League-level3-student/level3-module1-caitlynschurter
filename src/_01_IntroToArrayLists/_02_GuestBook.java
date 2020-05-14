package _01_IntroToArrayLists;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class _02_GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewNames;
	
	public static void main(String[] args) {
		new _02_GuestBook().start();
	}
	
	private static _02_GuestBook new_02_GuestBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public void start() {
		frame = new JFrame();
		panel = new JPanel();
		addName = new JButton();
		viewNames = new JButton();
		
		frame.setSize(500,400);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addName);
		addName.setText("Add Name");
		addName.addActionListener(this);
		panel.add(viewNames);
		viewNames.setText("View Names");
		viewNames.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> guests = new ArrayList<String>();
		if(e.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Enter a Name!!");
			guests.add(name);
		}
		
		if(e.getSource() == viewNames) {
			System.out.println("Guests: ");
			for(int i =0; i<0; i++) {
				String s = guests.get(i);
				System.out.print(s + ", ");
			}
			System.out.println("");
		}
		
	}
	
}
