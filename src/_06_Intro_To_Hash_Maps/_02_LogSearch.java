package _06_Intro_To_Hash_Maps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _04_HangMan.HangMan;

public class _02_LogSearch implements MouseListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton search;
	JButton view;
	JButton remove;
	
	public static void main(String[] args) {
		new _02_LogSearch().setup();
	}
	
	
	void setup(){
		frame = new JFrame();
		panel = new JPanel();
		add = new JButton();
		search = new JButton();
		view = new JButton();
		//remove = new JButton();
		
		add.addMouseListener(this);
		search.addMouseListener(this);
		view.addMouseListener(this);
		//remove.addMouseListener(this);
		
		frame.add(panel);
		panel.add(add);
		panel.add(search);
		panel.add(view);
		//panel.add(remove);
		
		add.setText("ADD");
		search.setText("SEARCH");
		view.setText("VIEW");
		//remove.setText("REMOVE");
		
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.pack();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("ID number:"));
			String name = JOptionPane.showInputDialog("Name:");
			log.put(id, name);
		}
		
		else if(e.getSource() == search) {
			String searchedName = JOptionPane.showInputDialog("Enter an ID number:");
			for()
		}
		
		else if(e.getSource() == view) {
			
		}
		
		else if(e.getSource() == remove) {
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
