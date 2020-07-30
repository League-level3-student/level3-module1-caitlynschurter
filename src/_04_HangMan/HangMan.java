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

	String currentWord;
	int lives;

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

		resetGame();
		startGame();
	}

	void resetGame() {
		System.out.println("resetGame");
		int totalWords = Utilities.getTotalWordsInFile("dictionary.txt");
		int wordCount = Integer.parseInt(JOptionPane.showInputDialog("Please set the randomizer for the number of playable words:"));

		for (int i = 0; i < wordCount; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			stack.push(word);
			System.out.println(word);
		}
	}

	void startGame() {
		System.out.println("startGame");
		lives = 5;
		label.setText("");

		if (stack.size() == 0) {
			String end = JOptionPane.showInputDialog("You're out of words! Would you like to play again? Yes/No");
			if (end.equals("Yes")) {
				resetGame();
			}

			else {
				frame.dispose();
				return;
			}
		}

		currentWord = stack.pop();
		System.out.println(currentWord);
		for (int i = 0; i < currentWord.length(); i++) {
			label.setText(label.getText() + "-");
		}
	}

	void endGame() {
		String end = JOptionPane.showInputDialog("Would you like to play again? Yes/No");
		if (end.equals("Yes")) {
			startGame();
		}

		else {
			frame.dispose();

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// determine if key typed is a letter in the word
		String word = label.getText();
		String output = "";
		char typed = e.getKeyChar();
		boolean found = false;
		for (int i = 0; i < currentWord.length(); i++) {
			if (typed == currentWord.charAt(i)) {
				found = true;
				output += typed;
			}

			else {
				output += word.charAt(i);
			}
		}
		if (found == false) {
			lives--;
		}

		if (lives <= 0) {
			endGame();
		}

		label.setText(output);
		if (output.equals(currentWord)) {
			JOptionPane.showMessageDialog(null, "Congrats! You won!");
			startGame();
		}
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
