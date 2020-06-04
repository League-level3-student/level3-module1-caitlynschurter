package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		// Song demoSong = new Song("demo.mp3");
		// demoSong.play();

		// Song miiSong = new Song("Mii Theme.mp3");
		// miiSong.play();

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}

	JFrame frame;
	JPanel panel;
	JButton button;
	JButton stop;

	Song demoSong;
	Song miiSong;

	public static void main(String[] args) {
		new _06_IPodShuffle().setup();

	}

	public void setup() {
		demoSong = new Song("demo.mp3");
		miiSong = new Song("Mii Theme.mp3");

		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		stop = new JButton();

		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		panel.add(button);
		panel.add(stop);
		button.setText("Suprise Me!");
		stop.setText("Stop");
		button.addActionListener(this);
		stop.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		int rand = new Random().nextInt(2);
		if (buttonPressed == button) {
			if (rand == 0) {
				demoSong.play();
			} 
			
			else if (rand == 1) {
				miiSong.play();
			} 
			
			else {
				System.out.println("something went wrong...");
			}
		}
		
		else {
			demoSong.stop();
			miiSong.stop();
		}
	}
}