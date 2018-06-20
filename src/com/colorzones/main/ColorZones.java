package com.colorzones.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ColorZones extends Canvas {
	private static final long serialVersionUID = 1L;

	public static final int width = Toolkit.getDefaultToolkit().getScreenSize().width / 1;
	public static final int height = Toolkit.getDefaultToolkit().getScreenSize().height / 1;
	public static final String y = "Y";
	public static int ys;
	public static int ns;

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();

		JLabel morning = new JLabel("======== MORNING (8am - 4pm) ========");

		JLabel jl1 = new JLabel("Did you behave well during the overnight? (Y/N)");
		JTextField jt1 = new JTextField((int) 1);

		JLabel jl2 = new JLabel("Did you wake up on time and get on transportation? (Y/N)");
		JTextField jt2 = new JTextField((int) 1);

		JLabel jl3 = new JLabel("Did you make your bed in the morning? (Y/N)");
		JTextField jt3 = new JTextField((int) 1);

		JLabel jl4 = new JLabel("Did you remain in school throughout the day? (Y/N)");
		JTextField jt4 = new JTextField((int) 1);

		JLabel jl5 = new JLabel("Did you have appropriate boundries with peers and staff? (Y/N)");
		JTextField jt5 = new JTextField((int) 1);

		JLabel jl6 = new JLabel("Did you have appropriate language with peers and staff? (Y/N)");
		JTextField jt6 = new JTextField((int) 1);

		JLabel jl7 = new JLabel("Did you do anything extra around the house? (Y/N)");
		JTextField jt7 = new JTextField((int) 1);

		JLabel jl8 = new JLabel("Did you follow staff prompts and program rules? (Y/N)");
		JTextField jt8 = new JTextField((int) 1);

		JLabel jl9 = new JLabel("Are your belongings orginized? (Y/N)");
		JTextField jt9 = new JTextField((int) 1);

		JLabel jl10 = new JLabel("Did you work on any of your PAYA skills? (Y/N)");
		JTextField jt10 = new JTextField((int) 1);

		JLabel afternoon = new JLabel("======== AFTERNOON (4pm - 12am) ========");

		JLabel jl11 = new JLabel("Did you do well in tutoring or group? (Y/N)");
		JTextField jt11 = new JTextField((int) 1);

		JLabel jl12 = new JLabel("Did you have an appropriate dinner time routine? (Y/N)");
		JTextField jt12 = new JTextField((int) 1);

		JLabel jl13 = new JLabel("Did you do well while out in public if an offground activity occured? (Y/N)");
		JTextField jt13 = new JTextField((int) 1);

		JLabel jl14 = new JLabel("Did you handle tranitions/bed prep well tonight? (Y/N)");
		JTextField jt14 = new JTextField((int) 1);

		JLabel jl15 = new JLabel("Did you have appropriate boundries with peers and staff? (Y/N)");
		JTextField jt15 = new JTextField((int) 1);

		JLabel jl16 = new JLabel("Did you have appropriate language with peers and staff? (Y/N)");
		JTextField jt16 = new JTextField((int) 1);

		JLabel jl17 = new JLabel("Did you follow staff prompts and program rules througout the shift? (Y/N)");
		JTextField jt17 = new JTextField((int) 1);

		JLabel jl18 = new JLabel("Did you do your after dinner chore? (Y/N)");
		JTextField jt18 = new JTextField((int) 1);

		JLabel jl19 = new JLabel("Did you show any positive leadership or role model behaviors? (Y/N)");
		JTextField jt19 = new JTextField((int) 1);

		JLabel jl20 = new JLabel("Did you work on any of your PAYA skills? (Y/N)");
		JTextField jt20 = new JTextField((int) 1);

		JButton jb1 = new JButton("CLICK WHEN FINISHED TO CALCULATE COLOR");

		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(width / 3 + 50, 570));

		panel.add(morning);

		panel.add(jl1);
		panel.add(jt1);

		panel.add(jl2);
		panel.add(jt2);

		panel.add(jl3);
		panel.add(jt3);

		panel.add(jl4);
		panel.add(jt4);

		panel.add(jl5);
		panel.add(jt5);

		panel.add(jl6);
		panel.add(jt6);

		panel.add(jl7);
		panel.add(jt7);

		panel.add(jl8);
		panel.add(jt8);

		panel.add(jl9);
		panel.add(jt9);

		panel.add(jl10);
		panel.add(jt10);

		panel.add(afternoon);

		panel.add(jl11);
		panel.add(jt11);

		panel.add(jl12);
		panel.add(jt12);

		panel.add(jl13);
		panel.add(jt13);

		panel.add(jl14);
		panel.add(jt14);

		panel.add(jl15);
		panel.add(jt15);

		panel.add(jl16);
		panel.add(jt16);

		panel.add(jl17);
		panel.add(jt17);

		panel.add(jl18);
		panel.add(jt18);

		panel.add(jl19);
		panel.add(jt19);

		panel.add(jl20);
		panel.add(jt20);

		panel.add(jb1);

		jt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1 = jt1.getText();
				System.out.println(input1);
				if (input1.equals("Y")) {
					ys++;
					System.out.print("YS: " + ys);
				} else {
					ns++;
					System.out.print("NS: " + ns);
				}
			}
		});

		jt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input2 = jt2.getText();
				System.out.println(input2);
				if (input2 != null && input2 == "Y") {
					ys++;
					System.out.print("YS: " + ys);
				} else {
					ns++;
					System.out.print("NS: " + ns);
				}
			}
		});

		jt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input3 = jt3.getText();
				System.out.println(input3);
				if (input3 != null && input3 == "Y") {
					ys++;
					System.out.print("YS: " + ys);
				} else {
					ns++;
					System.out.print("NS: " + ns);
				}
			}
		});

		jt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input4 = jt4.getText();
				System.out.println(input4);
			}
		});

		jt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input5 = jt5.getText();
				System.out.println(input5);
			}
		});

		jt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input6 = jt6.getText();
				System.out.println(input6);
			}
		});

		jt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input7 = jt7.getText();
				System.out.println(input7);
			}
		});

		jt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input8 = jt8.getText();
				System.out.println(input8);
			}
		});

		jt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input9 = jt9.getText();
				System.out.println(input9);
			}
		});

		jt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input10 = jt10.getText();
				System.out.println(input10);
			}
		});

		jt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input11 = jt11.getText();
				System.out.println(input11);
			}
		});

		jt12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input12 = jt12.getText();
				System.out.println(input12);
			}
		});

		jt13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input13 = jt13.getText();
				System.out.println(input13);
			}
		});

		jt14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input14 = jt14.getText();
				System.out.println(input14);
			}
		});

		jt15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input15 = jt15.getText();
				System.out.println(input15);
			}
		});

		jt16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input16 = jt16.getText();
				System.out.println(input16);
			}
		});

		jt17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input17 = jt17.getText();
				System.out.println(input17);
			}
		});

		jt18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input18 = jt18.getText();
				System.out.println(input18);
			}
		});

		jt19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input19 = jt19.getText();
				System.out.println(input19);
			}
		});

		jt20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input20 = jt20.getText();
				System.out.println(input20);
			}
		});

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setTitle("Color Zones");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
