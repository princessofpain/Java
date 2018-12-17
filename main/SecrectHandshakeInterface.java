package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;

/* Program to generate a secret handshake based on a decimal number converted to a binary number
 * with reset button and button to show the binary code
 * input and output with Swing
 * 
 * Steps of the handshake: 
 * binary >= 1 --> wink
 * binary >= 10 --> double blink
 * binary >= 100 --> close your eyes
 * binary >= 1000 --> jump
 * binary >= 10000 --> like binary >= 1000 and reverse of the order
 */

public class SecrectHandshakeInterface extends JFrame {
	
	private SecretHandshakeLogic logic = new SecretHandshakeLogic();

	private JPanel contentPane;
	private JTextField number;
	private JTextField txtWink;
	private JTextField txtDoubleBlink;
	private JTextField txtCloseYourEyes;
	private JTextField txtJump;
	private JButton btnNewButton;
	private JTextArea binaryCode;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecrectHandshakeInterface frame = new SecrectHandshakeInterface();
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
	public SecrectHandshakeInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 299);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterADecimal = new JLabel("Enter a decimal number:");
		lblEnterADecimal.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEnterADecimal.setBounds(12, 66, 151, 14);
		contentPane.add(lblEnterADecimal);
		
		number = new JTextField();
		number.setBounds(161, 63, 45, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		txtWink = new JTextField();
		txtWink.setEnabled(false);
		txtWink.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		txtWink.setBorder(null);
		txtWink.setHorizontalAlignment(SwingConstants.LEFT);
		txtWink.setEditable(false);
		txtWink.setText("wink");
		txtWink.setBounds(22, 137, 114, 20);
		contentPane.add(txtWink);
		txtWink.setColumns(10);
		
		txtDoubleBlink = new JTextField();
		txtDoubleBlink.setEnabled(false);
		txtDoubleBlink.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		txtDoubleBlink.setText("double blink");
		txtDoubleBlink.setHorizontalAlignment(SwingConstants.LEFT);
		txtDoubleBlink.setEditable(false);
		txtDoubleBlink.setColumns(10);
		txtDoubleBlink.setBorder(null);
		txtDoubleBlink.setBounds(22, 160, 114, 20);
		contentPane.add(txtDoubleBlink);
		
		txtCloseYourEyes = new JTextField();
		txtCloseYourEyes.setEnabled(false);
		txtCloseYourEyes.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		txtCloseYourEyes.setText("close your eyes");
		txtCloseYourEyes.setHorizontalAlignment(SwingConstants.LEFT);
		txtCloseYourEyes.setEditable(false);
		txtCloseYourEyes.setColumns(10);
		txtCloseYourEyes.setBorder(null);
		txtCloseYourEyes.setBounds(22, 184, 114, 20);
		contentPane.add(txtCloseYourEyes);
		
		txtJump = new JTextField();
		txtJump.setEnabled(false);
		txtJump.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		txtJump.setText("jump");
		txtJump.setHorizontalAlignment(SwingConstants.LEFT);
		txtJump.setEditable(false);
		txtJump.setColumns(10);
		txtJump.setBorder(null);
		txtJump.setBounds(22, 207, 114, 20);
		contentPane.add(txtJump);
		
		JLabel lblDoYourSecret = new JLabel("Do your secret handshake:");
		lblDoYourSecret.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDoYourSecret.setBounds(12, 110, 179, 16);
		contentPane.add(lblDoYourSecret);
		
		JButton btnGenerateHandshake = new JButton("Generate");
		btnGenerateHandshake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int binary = Integer.parseInt(logic.decimalToBinary(Integer.parseInt(number.getText())));
				
				if(binary >= 10000) {
					txtWink.setText(txtJump.getText());
					txtDoubleBlink.setText(txtCloseYourEyes.getText());
					txtCloseYourEyes.setText("double blink");
					txtJump.setText("wink");
					
					txtWink.setEnabled(true);
					txtDoubleBlink.setEnabled(true);
					txtCloseYourEyes.setEnabled(true);
					txtJump.setEnabled(true);
				} else if (binary >= 1000) {
					txtWink.setEnabled(true);
					txtDoubleBlink.setEnabled(true);
					txtCloseYourEyes.setEnabled(true);
					txtJump.setEnabled(true);
				} else if (binary >= 100) {
					txtWink.setEnabled(true);
					txtDoubleBlink.setEnabled(true);
					txtCloseYourEyes.setEnabled(true);
				} else if(binary >= 10) {
					txtWink.setEnabled(true);
					txtDoubleBlink.setEnabled(true);
				} else if(binary >= 1) {
					txtWink.setEnabled(true);
				}  
			}
		});
		btnGenerateHandshake.setFont(new Font("Dialog", Font.BOLD, 11));
		btnGenerateHandshake.setBounds(226, 60, 85, 26);
		contentPane.add(btnGenerateHandshake);
		
		btnNewButton = new JButton("Show binary code");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				binaryCode.setText(logic.decimalToBinary(Integer.parseInt(number.getText())));
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton.setBounds(226, 106, 129, 26);
		contentPane.add(btnNewButton);
		
		binaryCode = new JTextArea();
		binaryCode.setWrapStyleWord(true);
		binaryCode.setLineWrap(true);
		binaryCode.setBackground(UIManager.getColor("Button.background"));
		binaryCode.setEditable(false);
		binaryCode.setBounds(226, 138, 151, 56);
		contentPane.add(binaryCode);
		
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Dialog", Font.BOLD, 11));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWink.setText("wink");
				txtDoubleBlink.setText("double blink");
				txtCloseYourEyes.setText("close your eyes");
				txtJump.setText("jump");
				
				txtWink.setEnabled(false);
				txtDoubleBlink.setEnabled(false);
				txtCloseYourEyes.setEnabled(false);
				txtJump.setEnabled(false);
				
				number.setText("");
				binaryCode.setText("");
			}
		});
		btnReset.setBounds(323, 60, 67, 26);
		contentPane.add(btnReset);
		
		JTextArea txtrCreateYourOwn = new JTextArea();
		txtrCreateYourOwn.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtrCreateYourOwn.setBackground(SystemColor.control);
		txtrCreateYourOwn.setLineWrap(true);
		txtrCreateYourOwn.setEditable(false);
		txtrCreateYourOwn.setText("Create your own handshake in one step! Simply enter a number and see how your handshake is generated based on its binary Code.");
		txtrCreateYourOwn.setBounds(12, 12, 373, 41);
		contentPane.add(txtrCreateYourOwn);
	}
}
