package com.colorzones.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ColorZones extends Canvas {
	private static final long serialVersionUID = 1L;

	public static final int width = Toolkit.getDefaultToolkit().getScreenSize().width / 1;
	public static final int height = Toolkit.getDefaultToolkit().getScreenSize().height / 1;

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		JLabel morning = new JLabel("===== MORNING (8am - 4pm) =====");
		
		JLabel jl1 = new JLabel("Did you behave well during the overnight? (Y/N)");
		JTextField jt1 = new JTextField((int) 1);
		
		JLabel jl2 = new JLabel("Did you wake up ontime and get on transportation? (Y/N)");
		JTextField jt2 = new JTextField((int) 1);
		
		JLabel jl3 = new JLabel("Did you make your bed? (Y/N)");
		JTextField jt3 = new JTextField((int) 1);
		
		JLabel jl4 = new JLabel("Did you remain in school throughout the day? (Y/N)");
		JTextField jt4 = new JTextField((int) 1);

		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(width / 3, 500));

		panel.add(morning);
		
		panel.add(jl1);
		panel.add(jt1);
		
		panel.add(jl2);
		panel.add(jt2);
		
		panel.add(jl3);
		panel.add(jt3);
		
		panel.add(jl4);
		panel.add(jt4);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setTitle("Color Zones");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
