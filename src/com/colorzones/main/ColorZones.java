package com.colorzones.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ColorZones extends Canvas {
	private static final long serialVersionUID = 1L;

	public static final int width = Toolkit.getDefaultToolkit().getScreenSize().width / 1;
	public static final int height = Toolkit.getDefaultToolkit().getScreenSize().height / 1;
	private static int ys;
	private static int ns;
	private static int ss;
	private static final JLabel[] jl = new JLabel[20];
	private static final JTextField[] jt = new JTextField[20];
	public static final String[] input = new String[20];
	public static String[] YesOrNo = new String[20];

	private static JLabel labelName = new JLabel("NAME: ");
	private static JTextField textName = new JTextField(10);
	private static JLabel labelDate = new JLabel("   DATE: ");
	private static JTextField textDate = new JTextField(10);

	private static Formatter x;

	public static void main(String[] args) throws InterruptedException {
		JPanel panel = new JPanel(new FlowLayout());
		JFrame frame = new JFrame();
		final String[] input = new String[20];

		JLabel morning = new JLabel("======== MORNING (8am - 4pm) ========");
		JLabel afternoon = new JLabel("======== AFTERNOON (4pm - 12am) ========");
		JButton jb = new JButton("                                         CALCULATE PERCENT                                         ");

		jl[0] = new JLabel("Did you behave well during the overnight?");
		jl[1] = new JLabel("Did you wake up on time and get on transportation?");
		jl[2] = new JLabel("Did you make your bed in the morning?");
		jl[3] = new JLabel("Did you remain in school throughout the day?");
		jl[4] = new JLabel("Did you have appropriate boundries with peers and staff?");
		jl[5] = new JLabel("Did you have appropriate language with peers and staff?");
		jl[6] = new JLabel("Did you do anything extra around the house?");
		jl[7] = new JLabel("Did you follow staff prompts and program rules?");
		jl[8] = new JLabel("Are your belongings orginized?");
		jl[9] = new JLabel("Did you work on any of your PAYA skills?");
		jl[10] = new JLabel("Did you do well in tutoring or group?");
		jl[11] = new JLabel("Did you have an appropriate dinner time routine?");
		jl[12] = new JLabel("Did you do well while out in public if an offground activity occured?");
		jl[13] = new JLabel("Did you handle tranitions/bed prep well tonight?");
		jl[14] = new JLabel("Did you have appropriate boundries with peers and staff?");
		jl[15] = new JLabel("Did you have appropriate language with peers and staff?");
		jl[16] = new JLabel("Did you follow staff prompts and program rules througout the shift?");
		jl[17] = new JLabel("Did you do your after dinner chore?");
		jl[18] = new JLabel("Did you show any positive leadership or role model behaviors?");
		jl[19] = new JLabel("Did you work on any of your PAYA skills?");

		for (int i = 0; i <= jt.length - 1; i++) {
			jt[i] = new JTextField(1);
		}

		panel.setBackground(Color.LIGHT_GRAY);

		panel.add(labelName);
		panel.add(textName);
		panel.add(labelDate);
		panel.add(textDate);
		panel.add(morning);

		for (int i = 0; i <= 9; i++) {
			panel.add(jl[i]);
			panel.add(jt[i]);
		}

		panel.add(afternoon);

		for (int i = 10; i <= jl.length - 1; i++) {
			panel.add(jl[i]);
			panel.add(jt[i]);
		}

		panel.add(jb);

		jt[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[0] = jt[0].getText();
				if (input[0].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[0] = "Y";
				}
				if (input[0].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[0] = "N";
				}
				if (input[0].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[0] = "/";
				}
			}
		});

		jt[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[1] = jt[1].getText();
				if (input[1].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[1] = "Y";
				}
				if (input[1].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[1] = "N";
				}
				if (input[1].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[1] = "/";
				}
			}
		});

		jt[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[2] = jt[2].getText();
				if (input[2].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[2] = "Y";
				}
				if (input[2].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[2] = "N";
				}
				if (input[2].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[2] = "/";
				}
			}
		});

		jt[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[3] = jt[3].getText();
				if (input[3].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[3] = "Y";
				}
				if (input[3].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[3] = "N";
				}
				if (input[3].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[3] = "/";
				}
			}
		});

		jt[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[4] = jt[4].getText();
				if (input[4].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[4] = "Y ";
				}
				if (input[4].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[4].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[5] = jt[5].getText();
				if (input[5].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[5].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[5].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[6] = jt[6].getText();
				if (input[6].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[6].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[6].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[7] = jt[7].getText();
				if (input[7].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[7].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[7].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[8] = jt[8].getText();
				if (input[8].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[8].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[8].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[9] = jt[9].getText();
				if (input[9].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[9].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[9].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[10] = jt[10].getText();
				if (input[10].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[10].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[10].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[11] = jt[11].getText();
				if (input[11].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[11].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[11].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[12] = jt[12].getText();
				if (input[12].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[12].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[12].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[13] = jt[13].getText();
				if (input[13].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[13].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[13].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[14] = jt[14].getText();
				if (input[14].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[14].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[14].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[15] = jt[15].getText();
				if (input[15].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[15].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[15].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[16] = jt[16].getText();
				if (input[16].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[16].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[16].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[17] = jt[17].getText();
				if (input[17].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[17].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[17].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[18] = jt[18].getText();
				if (input[18].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[18].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[18].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jt[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[19] = jt[19].getText();
				if (input[19].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
				}
				if (input[19].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
				}
				if (input[19].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
				}
			}
		});

		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jb.getModel().isEnabled()) {
					double t = ys + ns;
					double p = ys / t;
					String percent = String.valueOf(p * 10 * 10);

					JLabel jl21 = new JLabel("PERCENT: " + percent + "%");
					panel.add(jl21);

					frame.setSize(width / 3 + 50, 655);

					String dateInput = textDate.getText();
					String nameInput = textName.getText();

					try {
						x = new Formatter(nameInput.toUpperCase() + "'S YES OR NO SHEET " + dateInput + ".txt");
						System.out.println("You created a file!");
					} catch (Exception e1) {
						System.out.println("Error detected!");
					}
				}

				x.format("Did you behave well during the overnight?: " + YesOrNo[0]);
				x.format("Did you wake up on time and get on transportation?: " + YesOrNo[1]);
				x.close();
			}
		});

		frame.getContentPane().add(panel);
		frame.setSize(width / 3 + 50, 635);
		frame.setTitle("Color Zones (by Evan Schenkman)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
