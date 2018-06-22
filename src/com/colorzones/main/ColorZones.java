package com.colorzones.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
	public static int ys;
	public static int ns;
	public static int ss;

	public static void main(String[] args) {
		JPanel panel = new JPanel(new FlowLayout());
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

		JButton jb1 = new JButton("                                         CALCULATE PERCENT                                         ");

		panel.setPreferredSize(new Dimension(width / 3 + 50, 600));

		panel.setBackground(Color.LIGHT_GRAY);

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

		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jb1.getModel().isEnabled()) {
					double t = ys + ns;
					double p = ys / t;
					String percent = String.valueOf(p * 10 * 10);

					JLabel jl21 = new JLabel("PERCENT: " + percent + "%");
					panel.add(jl21);

					frame.setSize(width / 3 + 50, 635);
				}
			}
		});

		jt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1 = jt1.getText();
				if (input1.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input1.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input1.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input2 = jt2.getText();
				if (input2.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input2.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input2.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input3 = jt3.getText();
				if (input3.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input3.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input3.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input4 = jt4.getText();
				if (input4.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input4.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input4.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input5 = jt5.getText();
				if (input5.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input5.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input5.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input6 = jt6.getText();
				if (input6.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input6.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input6.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input7 = jt7.getText();
				if (input7.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input7.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input7.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input8 = jt8.getText();
				if (input8.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input8.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input8.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input9 = jt9.getText();
				if (input9.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input9.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input9.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input10 = jt10.getText();
				if (input10.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input10.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input10.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input11 = jt11.getText();
				if (input11.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input11.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input11.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input12 = jt12.getText();
				if (input12.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input12.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input12.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input13 = jt13.getText();
				if (input13.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input13.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input13.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input14 = jt14.getText();
				if (input14.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input14.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input14.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input15 = jt15.getText();
				if (input15.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input15.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input15.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input16 = jt16.getText();
				if (input16.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input16.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input16.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input17 = jt17.getText();
				if (input17.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input17.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input17.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input18 = jt18.getText();
				if (input18.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input18.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input18.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input19 = jt19.getText();
				if (input19.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input19.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input19.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input20 = jt20.getText();
				if (input20.equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input20.equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input20.equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		frame.getContentPane().add(panel);
		frame.setSize(width / 3 + 50, 620);
		frame.setTitle("Color Zones");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
