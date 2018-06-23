package com.colorzones.main;

import java.awt.Canvas;
import java.awt.Color;
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
	private static int ys;
	private static int ns;
	private static int ss;
	private static final JLabel[] jl = new JLabel[20];
	private static final JTextField[] jt = new JTextField[20];
	private static final String[] input = new String[20];

	public static void main(String[] args) {
		JPanel panel = new JPanel(new FlowLayout());
		JFrame frame = new JFrame();

		JLabel labelName = new JLabel("NAME: ");
		JTextField textName = new JTextField(10);
		JLabel labelDate = new JLabel("   DATE: ");
		JTextField textDate = new JTextField(10);

		JLabel morning = new JLabel("======== MORNING (8am - 4pm) ========");
		JLabel afternoon = new JLabel("======== AFTERNOON (4pm - 12am) ========");
		JButton jb = new JButton(
				"                                         CALCULATE PERCENT                                         ");

		jl[0] = new JLabel("Did you behave well during the overnight? (Y/N)");
		jl[1] = new JLabel("Did you wake up on time and get on transportation? (Y/N)");
		jl[2] = new JLabel("Did you make your bed in the morning? (Y/N)");
		jl[3] = new JLabel("Did you remain in school throughout the day? (Y/N)");
		jl[4] = new JLabel("Did you have appropriate boundries with peers and staff? (Y/N)");
		jl[5] = new JLabel("Did you have appropriate language with peers and staff? (Y/N)");
		jl[6] = new JLabel("Did you do anything extra around the house? (Y/N)");
		jl[7] = new JLabel("Did you follow staff prompts and program rules? (Y/N)");
		jl[8] = new JLabel("Are your belongings orginized? (Y/N)");
		jl[9] = new JLabel("Did you work on any of your PAYA skills? (Y/N)");
		jl[10] = new JLabel("Did you do well in tutoring or group? (Y/N)");
		jl[11] = new JLabel("Did you have an appropriate dinner time routine? (Y/N)");
		jl[12] = new JLabel("Did you do well while out in public if an offground activity occured? (Y/N)");
		jl[13] = new JLabel("Did you handle tranitions/bed prep well tonight? (Y/N)");
		jl[14] = new JLabel("Did you have appropriate boundries with peers and staff? (Y/N)");
		jl[15] = new JLabel("Did you have appropriate language with peers and staff? (Y/N)");
		jl[16] = new JLabel("Did you follow staff prompts and program rules througout the shift? (Y/N)");
		jl[17] = new JLabel("Did you do your after dinner chore? (Y/N)");
		jl[18] = new JLabel("Did you show any positive leadership or role model behaviors? (Y/N)");
		jl[19] = new JLabel("Did you work on any of your PAYA skills? (Y/N)");

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

		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jb.getModel().isEnabled()) {
					double t = ys + ns;
					double p = ys / t;
					String percent = String.valueOf(p * 10 * 10);

					JLabel jl21 = new JLabel("PERCENT: " + percent + "%");
					panel.add(jl21);

					frame.setSize(width / 3 + 50, 655);
				}
			}
		});
		for (int i = 0; i <= jt.length - 1; i++) {
			jt[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input[i] = jt[i].getText();
					if (input[i].equals("Y")) {
						ys++;
						System.out.println("YS: " + ys);
					}
					if (input[i].equals("N")) {
						ns++;
						System.out.println("NS: " + ns);
					}
					if (input[i].equals("/")) {
						ss++;
						System.out.println("SS: " + ss);
					}
				}
			});
		}

		frame.getContentPane().add(panel);
		frame.setSize(width / 3 + 50, 635);
		frame.setTitle("Color Zones (by Evan Schenkman)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
