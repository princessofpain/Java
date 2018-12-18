package main.SpaceAge;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.SpaceAge.Factory.Planet;
import main.SpaceAge.Factory.PlanetFactory;

/* Program to calculate a humans age oriented on earth´s years on another planet
 * input via Swing
 * output via Swing
 */

public class SpaceAgeInterface extends JFrame {
	
	private List<String> planets = new ArrayList<String>();
	private JPanel contentPane;
	private JTextField age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceAgeInterface frame = new SpaceAgeInterface();
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
	public SpaceAgeInterface() {
		setTitle("Space Age");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 300);
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
		chckbxMercury.addActionListener((event) -> {
			if(chckbxMercury.isSelected()) {
				planets.add("Mercury");
			} 
		});
		chckbxMercury.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxMercury.setBounds(10, 69, 74, 24);
		contentPane.add(chckbxMercury);
		
		JCheckBox chckbxVenus = new JCheckBox("Venus");
		chckbxVenus.addActionListener((event) -> {
			if(chckbxVenus.isSelected()) {
				planets.add("Venus");
			}
		});
		chckbxVenus.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxVenus.setBounds(10, 91, 74, 24);
		contentPane.add(chckbxVenus);
		
		JCheckBox chckbxMars = new JCheckBox("Mars");
		chckbxMars.addActionListener((event) -> {
			if(chckbxMars.isSelected()) {
				planets.add("Mars");
			} 
		});
		chckbxMars.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxMars.setBounds(10, 113, 74, 24);
		contentPane.add(chckbxMars);
		
		JCheckBox chckbxJupiter = new JCheckBox("Jupiter");
		chckbxJupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxJupiter.isSelected()) {
					planets.add("Jupiter");
				}
			}
		});
		chckbxJupiter.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxJupiter.setBounds(10, 135, 74, 24);
		contentPane.add(chckbxJupiter);
		
		JCheckBox chckbxSaturn = new JCheckBox("Saturn");
		chckbxSaturn.addActionListener((event) -> {
			if(chckbxSaturn.isSelected()) {
				planets.add("Saturn");
			}
		});
		chckbxSaturn.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxSaturn.setBounds(10, 157, 74, 24);
		contentPane.add(chckbxSaturn);
		
		JCheckBox chckbxUranus = new JCheckBox("Uranus");
		chckbxUranus.addActionListener((event) -> {
			if(chckbxUranus.isSelected()) {
				planets.add("Uranus");
			}
		});
		chckbxUranus.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxUranus.setBounds(10, 180, 74, 24);
		contentPane.add(chckbxUranus);
		
		JCheckBox chckbxNeptune = new JCheckBox("Neptune");
		chckbxNeptune.addActionListener((event) -> {
			if(chckbxNeptune.isSelected()) {
				planets.add("Neptune");
			} 
		});
		chckbxNeptune.setFont(new Font("Dialog", Font.BOLD, 11));
		chckbxNeptune.setBounds(10, 203, 74, 24);
		contentPane.add(chckbxNeptune);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener((event) -> {
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
		});
		btnReset.setFont(new Font("Dialog", Font.BOLD, 11));
		btnReset.setBounds(402, 43, 68, 21);
		contentPane.add(btnReset);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				
				for(String planet: planets) {
					PlanetFactory planetFactory = new PlanetFactory();
					Planet planet1 = planetFactory.getPlanet(planet);
					planet1.calculateAge(Integer.parseInt(age.getText()));
					String resultMessage = planet1.createResultMessage();
					
					switch(planet) {
						case "Mercury": mercuryResult.setText(resultMessage);
										break;
						case "Venus": 	venusResult.setText(resultMessage);
									  	break;
						case "Mars":	marsResult.setText(resultMessage);
					  					break;	
						case "Jupiter":	jupiterResult.setText(resultMessage);
	  									break;						
						case "Saturn":	saturnResult.setText(resultMessage);
										break;		
						case "Uranus":	uranusResult.setText(resultMessage);
	  									break;	
						case "Neptune":	neptuneResult.setText(resultMessage);
	  									break;	
					}
				};
				planets.clear();		
			}
		});
		btnCalculate.setFont(new Font("Dialog", Font.BOLD, 11));
		btnCalculate.setBounds(306, 43, 84, 21);
		contentPane.add(btnCalculate);
	}
}
