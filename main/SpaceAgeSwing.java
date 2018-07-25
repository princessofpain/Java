package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/* Program to calculate a humans age oriented on earth�s years on another planet
 * input via Swing
 * output via Swing
 */

public class SpaceAgeSwing extends JFrame {

	private JPanel contentPane;
	private JTextField age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceAgeSwing frame = new SpaceAgeSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SpaceAgeSwing() {
		setTitle("Space Age");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type your age:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 14, 90, 14);
		contentPane.add(lblNewLabel);
		
		age = new JTextField();
		age.setBounds(98, 11, 68, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		JLabel lblWhichPlanetsDo = new JLabel("Which planets do you want to calculate your age for?");
		lblWhichPlanetsDo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblWhichPlanetsDo.setBounds(10, 45, 299, 16);
		contentPane.add(lblWhichPlanetsDo);
		
		JLabel mercuryResult = new JLabel("");
		mercuryResult.setBounds(98, 73, 308, 16);
		contentPane.add(mercuryResult);
		
		JLabel venusResult = new JLabel("");
		venusResult.setBounds(97, 95, 308, 16);
		contentPane.add(venusResult);
		
		JLabel marsResult = new JLabel("");
		marsResult.setBounds(97, 117, 308, 16);
		contentPane.add(marsResult);
		
		JLabel jupiterResult = new JLabel("");
		jupiterResult.setBounds(97, 139, 308, 16);
		contentPane.add(jupiterResult);
		
		JLabel saturnResult = new JLabel("");
		saturnResult.setBounds(97, 161, 308, 16);
		contentPane.add(saturnResult);
		
		JLabel uranusResult = new JLabel("");
		uranusResult.setBounds(97, 184, 308, 16);
		contentPane.add(uranusResult);
		
		JLabel neptuneResult = new JLabel("");
		neptuneResult.setBounds(97, 207, 308, 16);
		contentPane.add(neptuneResult);
		
		JCheckBox chckbxMercury = new JCheckBox("Mercury");
		chckbxMercury.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMercury.isSelected()) {
					mercuryResult.setText("Your age in years: " + calculateAge(1, Double.parseDouble(age.getText())));
				} else {
					mercuryResult.setText("");
				}
			}
		});
		chckbxMercury.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxMercury.setBounds(10, 69, 74, 24);
		contentPane.add(chckbxMercury);
		
		JCheckBox chckbxVenus = new JCheckBox("Venus");
		chckbxVenus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxVenus.isSelected()) {
					venusResult.setText("Your age in years: " + calculateAge(2, Double.parseDouble(age.getText())));
				} else {
					venusResult.setText("");
				}
			}
		});
		chckbxVenus.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxVenus.setBounds(10, 91, 74, 24);
		contentPane.add(chckbxVenus);
		
		JCheckBox chckbxMars = new JCheckBox("Mars");
		chckbxMars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMars.isSelected()) {
					marsResult.setText("Your age in years: " + calculateAge(3, Double.parseDouble(age.getText())));
				} else {
					marsResult.setText("");
				}
			}
		});
		chckbxMars.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxMars.setBounds(10, 113, 74, 24);
		contentPane.add(chckbxMars);
		
		JCheckBox chckbxJupiter = new JCheckBox("Jupiter");
		chckbxJupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxJupiter.isSelected()) {
					jupiterResult.setText("Your age in years: " + calculateAge(4, Double.parseDouble(age.getText())));
				} else {
					jupiterResult.setText("");
				}
			}
		});
		chckbxJupiter.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxJupiter.setBounds(10, 135, 74, 24);
		contentPane.add(chckbxJupiter);
		
		JCheckBox chckbxSaturn = new JCheckBox("Saturn");
		chckbxSaturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSaturn.isSelected()) {
					saturnResult.setText("Your age in years: " + calculateAge(5, Double.parseDouble(age.getText())));
				} else {
					saturnResult.setText("");
				}
			}
		});
		chckbxSaturn.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxSaturn.setBounds(10, 157, 74, 24);
		contentPane.add(chckbxSaturn);
		
		JCheckBox chckbxUranus = new JCheckBox("Uranus");
		chckbxUranus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxUranus.isSelected()) {
					uranusResult.setText("Your age in years: " + calculateAge(6, Double.parseDouble(age.getText())));
				} else {
					uranusResult.setText("");
				}
			}
		});
		chckbxUranus.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxUranus.setBounds(10, 180, 74, 24);
		contentPane.add(chckbxUranus);
		
		JCheckBox chckbxNeptune = new JCheckBox("Neptune");
		chckbxNeptune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNeptune.isSelected()) {
					neptuneResult.setText("Your age in years: " + calculateAge(7, Double.parseDouble(age.getText())));
				} else {
					neptuneResult.setText("");
				}
			}
		});
		chckbxNeptune.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxNeptune.setBounds(10, 203, 74, 24);
		contentPane.add(chckbxNeptune);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				age.setText("");
				chckbxMercury.setSelected(false);
				mercuryResult.setText("");
				chckbxVenus.setSelected(false);
				venusResult.setText("");
				chckbxMars.setSelected(false);
				marsResult.setText("");
				chckbxJupiter.setSelected(false);
				jupiterResult.setText("");
				chckbxSaturn.setSelected(false);
				saturnResult.setText("");
				chckbxUranus.setSelected(false);
				uranusResult.setText("");
				chckbxNeptune.setSelected(false);
				neptuneResult.setText("");
			}
		});
		btnReset.setFont(new Font("Dialog", Font.BOLD, 11));
		btnReset.setBounds(307, 43, 98, 21);
		contentPane.add(btnReset);
	}
	
	String calculateAge(int planet, double ageInYears) {
		double result = 0;
		
		switch(planet) {
			// Mercury
			case 1: result = ageInYears * 0.2408467;
					break;
			// Venus
			case 2: result = ageInYears * 0.61519726;
					break;
			// Mars
			case 3: result = ageInYears * 1.8808158;
					break;
			// Jupiter
			case 4: result = ageInYears * 11.862615;
					break;
			// Saturn
			case 5: result = ageInYears * 29.447498;
					break;
			// Uranus
			case 6: result = ageInYears * 84.016846;
					break;		
			// Neptune
			case 7: result = ageInYears * 164.79132;
					break;
		}
		
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		return df.format(result);
	}
}
