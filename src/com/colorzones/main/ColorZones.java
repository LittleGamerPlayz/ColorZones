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
	private static JTextField textDate = new JTextField("USE -'s!", 10);

	private static Formatter x;
	static String percent;

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
		jl[4] = new JLabel("Did you have appropriate boundaries with peers and staff?");
		jl[5] = new JLabel("Did you have appropriate language with peers and staff?");
		jl[6] = new JLabel("Did you do anything extra around the house?");
		jl[7] = new JLabel("Did you follow staff prompts and program rules?");
		jl[8] = new JLabel("Are your personal belongings organized?");
		jl[9] = new JLabel("Did you work on any of your PAYA skills?");
		jl[10] = new JLabel("Did you do well in tutoring or group?");
		jl[11] = new JLabel("Did you have an appropriate dinner time routine?");
		jl[12] = new JLabel("Did you do well while out in public if an off ground activity occurred?");
		jl[13] = new JLabel("Did you handle transitions/bed preparation well tonight?");
		jl[14] = new JLabel("Did you have appropriate boundaries with peers and staff?");
		jl[15] = new JLabel("Did you have appropriate language with peers and staff?");
		jl[16] = new JLabel("Did you follow staff prompts and program rules throughout the shift?");
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
				jt[0].setEnabled(false);
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
				jt[1].setEnabled(false);
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
				jt[2].setEnabled(false);
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
				jt[3].setEnabled(false);
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
				jt[4].setEnabled(false);
				if (input[4].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[4] = "Y";
				}
				if (input[4].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[4] = "N";
				}
				if (input[4].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[4] = "/";
				}
			}
		});

		jt[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[5] = jt[5].getText();
				jt[5].setEnabled(false);
				if (input[5].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[5] = "Y";
				}
				if (input[5].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[5] = "N";
				}
				if (input[5].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[5] = "/";
				}
			}
		});

		jt[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[6] = jt[6].getText();
				jt[6].setEnabled(false);
				if (input[6].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[6] = "Y";
				}
				if (input[6].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[6] = "N";
				}
				if (input[6].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[6] = "/";
				}
			}
		});

		jt[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[7] = jt[7].getText();
				jt[7].setEnabled(false);
				if (input[7].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[7] = "Y";
				}
				if (input[7].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[7] = "N";
				}
				if (input[7].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[7] = "/";
				}
			}
		});

		jt[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[8] = jt[8].getText();
				jt[8].setEnabled(false);
				if (input[8].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[8] = "Y";
				}
				if (input[8].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[8] = "N";
				}
				if (input[8].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[8] = "/";
				}
			}
		});

		jt[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[9] = jt[9].getText();
				jt[9].setEnabled(false);
				if (input[9].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[9] = "Y";
				}
				if (input[9].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[9] = "N";
				}
				if (input[9].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[9] = "/";
				}
			}
		});

		jt[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[10] = jt[10].getText();
				jt[10].setEnabled(false);
				if (input[10].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[10] = "Y";
				}
				if (input[10].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[10] = "N";
				}
				if (input[10].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[10] = "/";
				}
			}
		});

		jt[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[11] = jt[11].getText();
				jt[11].setEnabled(false);
				if (input[11].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[11] = "Y";
				}
				if (input[11].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[11] = "N";
				}
				if (input[11].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[11] = "/";
				}
			}
		});

		jt[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[12] = jt[12].getText();
				jt[12].setEnabled(false);
				if (input[12].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[12] = "Y";
				}
				if (input[12].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[12] = "N";
				}
				if (input[12].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[12] = "/";
				}
			}
		});

		jt[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[13] = jt[13].getText();
				jt[13].setEnabled(false);
				if (input[13].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[13] = "Y";
				}
				if (input[13].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[13] = "N";
				}
				if (input[13].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[13] = "/";
				}
			}
		});

		jt[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[14] = jt[14].getText();
				jt[14].setEnabled(false);
				if (input[14].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[14] = "Y";
				}
				if (input[14].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[14] = "N";
				}
				if (input[14].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[14] = "/";
				}
			}
		});

		jt[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[15] = jt[15].getText();
				jt[15].setEnabled(false);
				if (input[15].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[15] = "Y";
				}
				if (input[15].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[15] = "N";
				}
				if (input[15].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[15] = "/";
				}
			}
		});

		jt[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[16] = jt[16].getText();
				jt[16].setEnabled(false);
				if (input[16].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[16] = "Y";
				}
				if (input[16].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[16] = "N";
				}
				if (input[16].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[16] = "/";
				}
			}
		});

		jt[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[17] = jt[17].getText();
				jt[17].setEnabled(false);
				if (input[17].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[17] = "Y";
				}
				if (input[17].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[17] = "N";
				}
				if (input[17].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[17] = "/";
				}
			}
		});

		jt[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[18] = jt[18].getText();
				jt[18].setEnabled(false);
				if (input[18].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[18] = "Y";
				}
				if (input[18].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[18] = "N";
				}
				if (input[18].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[18] = "/";
				}
			}
		});

		jt[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input[19] = jt[19].getText();
				jt[19].setEnabled(false);
				if (input[19].equals("Y")) {
					ys++;
					System.out.println("YS: " + ys);
					YesOrNo[19] = "Y";
				}
				if (input[19].equals("N")) {
					ns++;
					System.out.println("NS: " + ns);
					YesOrNo[19] = "N";
				}
				if (input[19].equals("/")) {
					ss++;
					System.out.println("SS: " + ss);
					YesOrNo[19] = "/";
				}
			}
		});

		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jb.getModel().isEnabled()) {
					jb.setEnabled(false);
					double t = ys + ns;
					double p = ys / t;
					percent = String.valueOf(p * 10 * 10);

					JLabel jl21 = new JLabel("PERCENT: " + percent + "%");
					panel.add(jl21);

					frame.setSize(width / 3 + 50, 655);

					String dateInput = textDate.getText();
					String nameInput = textName.getText();

					try {
						x = new Formatter(nameInput.toUpperCase() + "'S YES OR NO SHEET " + dateInput + ".txt");
					} catch (Exception e1) {
						System.out.println("Error detected!");
					}
				}

				x.format("======== MORNING (8am - 4pm) ======== ");
				x.format("Did you behave well during the overnight?: " + YesOrNo[0] + " ");
				x.format("Did you wake up on time and get on transportation?: " + YesOrNo[1] + " ");
				x.format("Did you make your bed in the morning?: " + YesOrNo[2] + " ");
				x.format("Did you remain in school throughout the day?: " + YesOrNo[3] + " ");
				x.format("Did you have appropriate boundaries with peers and staff?: " + YesOrNo[4] + " ");
				x.format("Did you have appropriate language with peers and staff?: " + YesOrNo[5] + " ");
				x.format("Did you do anything extra around the house?: " + YesOrNo[6] + " ");
				x.format("Did you follow staff prompts and program rules?: " + YesOrNo[7] + " ");
				x.format("Are your personal belongings organized?: " + YesOrNo[8] + " ");
				x.format("Did you work on any of your PAYA skills?: " + YesOrNo[9] + " ");
				x.format("======== AFTERNOON (4pm - 12am) ======== ");
				x.format("Did you do well in tutoring or group?: " + YesOrNo[10] + " ");
				x.format("Did you have an appropriate dinner time routine?: " + YesOrNo[11] + " ");
				x.format("Did you do well while out in public if an off ground activity occurred?: " + YesOrNo[12] + " ");
				x.format("Did you handle transitions/bed preparation well tonight?: " + YesOrNo[13] + " ");
				x.format("Did you have appropriate boundaries with peers and staff?: " + YesOrNo[14] + " ");
				x.format("Did you have appropriate language with peers and staff?: " + YesOrNo[15] + " ");
				x.format("Did you follow staff prompts and program rules througHout the shift?: " + YesOrNo[16] + " ");
				x.format("Did you do your after dinner chore?: " + YesOrNo[17] + " ");
				x.format("Did you show any positive leadership or role model behaviors?: " + YesOrNo[18] + " ");
				x.format("Did you work on any of your PAYA skills?: " + YesOrNo[19] + " ");
				x.format("PERCENT: " + percent + "%");
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
