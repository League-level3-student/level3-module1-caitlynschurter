package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<String> stack;

	public static void main(String[] args) {
		new HangMan().setup();
	}

	void setup() {
		stack = new Stack<String>();
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();

		frame.setSize(400, 200);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener((KeyListener) this);
		frame.pack();
		frame.setVisible(true);

		int totalWords = Utilities.getTotalWordsInFile("dictionary.txt");
		int wordCount = Integer
				.parseInt(JOptionPane.showInputDialog("Please set the randomizer for the number of playable words:"));

		for (int i = 0; i < wordCount; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			stack.push(word);
			System.out.println(word);
		}

		startGame();
	}

	void startGame() {
		String currentWord = stack.pop();
		System.out.println(currentWord);
		for(int i = 0; i < currentWord.length(); i++) {
			label.setText(label.getText() + "-");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
