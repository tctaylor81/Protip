import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Battlegame extends JFrame {

	
	public Battlegame() {
		super("Battlegame");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel pane = new JPanel();
		GridLayout game = new GridLayout(7, 7, 0, 0);
		pane.setLayout(game);
		//create icons
		ImageIcon pictureIcon = new ImageIcon("C:/Users/tctaylor81/Pictures/pic2.gif");
		//create buttons
		JButton a1 = new JButton("A1", pictureIcon);
		JButton b1 = new JButton("B1", pictureIcon);
		JButton c1 = new JButton("C1", pictureIcon);
		JButton d1 = new JButton("D1", pictureIcon);
		JButton e1 = new JButton("E1", pictureIcon);
		JButton f1 = new JButton("F1", pictureIcon);
		JButton g1 = new JButton("G1", pictureIcon);
		
		JButton a2 = new JButton("A2", pictureIcon);
		JButton b2 = new JButton("B2", pictureIcon);
		JButton c2 = new JButton("C2", pictureIcon);
		JButton d2 = new JButton("D2", pictureIcon);
		JButton e2 = new JButton("E2", pictureIcon);
		JButton f2 = new JButton("F2", pictureIcon);
		JButton g2 = new JButton("G2", pictureIcon);
		
		JButton a3 = new JButton("A3", pictureIcon);
		JButton b3 = new JButton("B3", pictureIcon);
		JButton c3 = new JButton("C3", pictureIcon);
		JButton d3 = new JButton("D3", pictureIcon);
		JButton e3 = new JButton("E3", pictureIcon);
		JButton f3 = new JButton("F3", pictureIcon);
		JButton g3 = new JButton("G3", pictureIcon);
		
		JButton a4 = new JButton("A4", pictureIcon);
		JButton b4 = new JButton("B4", pictureIcon);
		JButton c4 = new JButton("C4", pictureIcon);
		JButton d4 = new JButton("D4", pictureIcon);
		JButton e4 = new JButton("E4", pictureIcon);
		JButton f4 = new JButton("F4", pictureIcon);
		JButton g4 = new JButton("G4", pictureIcon);
		
		JButton a5 = new JButton("A5", pictureIcon);
		JButton b5 = new JButton("B5", pictureIcon);
		JButton c5 = new JButton("C5", pictureIcon);
		JButton d5 = new JButton("D5", pictureIcon);
		JButton e5 = new JButton("E5", pictureIcon);
		JButton f5 = new JButton("F5", pictureIcon);
		JButton g5 = new JButton("G5", pictureIcon);
		
		JButton a6 = new JButton("A6", pictureIcon);
		JButton b6 = new JButton("B6", pictureIcon);
		JButton c6 = new JButton("C6", pictureIcon);
		JButton d6 = new JButton("D6", pictureIcon);
		JButton e6 = new JButton("E6", pictureIcon);
		JButton f6 = new JButton("F6", pictureIcon);
		JButton g6 = new JButton("G6", pictureIcon);
		
		JButton a7 = new JButton("A7", pictureIcon);
		JButton b7 = new JButton("B7", pictureIcon);
		JButton c7 = new JButton("C7", pictureIcon);
		JButton d7 = new JButton("D7", pictureIcon);
		JButton e7 = new JButton("E7", pictureIcon);
		JButton f7 = new JButton("F7", pictureIcon);
		JButton g7 = new JButton("G7", pictureIcon);
		pane.add(a1);
		pane.add(a2);
		pane.add(a3);
		pane.add(a4);
		pane.add(a5);
		pane.add(a6);
		pane.add(a7);
		add(pane);
		
		pane.add(b1);
		pane.add(b2);
		pane.add(b3);
		pane.add(b4);
		pane.add(b5);
		pane.add(b6);
		pane.add(b7);
		add(pane);
		
		pane.add(c1);
		pane.add(c2);
		pane.add(c3);
		pane.add(c4);
		pane.add(c5);
		pane.add(c6);
		pane.add(c7);
		add(pane);
		
		pane.add(d1);
		pane.add(d2);
		pane.add(d3);
		pane.add(d4);
		pane.add(d5);
		pane.add(d6);
		pane.add(d7);
		add(pane);
		
		pane.add(e1);
		pane.add(e2);
		pane.add(e3);
		pane.add(e4);
		pane.add(e5);
		pane.add(e6);
		pane.add(e7);
		add(pane);
		
		pane.add(f1);
		pane.add(f2);
		pane.add(f3);
		pane.add(f4);
		pane.add(f5);
		pane.add(f6);
		pane.add(f7);
		add(pane);
		
		pane.add(g1);
		pane.add(g2);
		pane.add(g3);
		pane.add(g4);
		pane.add(g5);
		pane.add(g6);
		pane.add(g7);
		add(pane);
		setVisible(true);
		
	}
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
		} catch (Exception exc) {
			System.err.println("Couldn't use the system" 
					+ "look and feel: " + exc);
		}
	}

	public static void main(String[] args) {
		Battlegame frame = new Battlegame();

	}
}
