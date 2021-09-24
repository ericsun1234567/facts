package gui;
import java.util.ArrayList;
import javax.swing.*;  

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FactList list = new FactList();
		
				
		
		  EventQueue.invokeLater(new Runnable() { public void run() { try { gui frame =
		  new gui(list); frame.setVisible(true); } catch (Exception e) {
		  e.printStackTrace(); } } });
			
	
	}

	/**
	 * Create the frame.
	 */
	public gui(FactList lis) {
		Fact f = new Fact();
		f.setAuthor("a");
		f.setText("b");
		f.setType("c");
		Fact g = new Fact();
		g.setAuthor("d");
		g.setText("e");
		g.setType("f");
		Fact h = new Fact();
		h.setAuthor("x");
		h.setText("y");
		h.setType("z");
		lis.set(f);
		lis.set(g);
		lis.set(h);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Robert L. Glass: Facts and Fallacies of Software Engineering");
		lblNewLabel.setBounds(82, 11, 342, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("QUALITY IS: a collection of attributes.");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(127, 36, 276, 26);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Fact");
		lblNewLabel_3.setBounds(200, 71, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		JButton btnNewButton = new JButton("Next");
	
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			
				lblNewLabel_3.setText("a b c");
			
			}
		});
		btnNewButton.setBounds(0, 65, 71, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("-Robert L. Glass");
		lblNewLabel_2.setBounds(216, 53, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Search:");
		lblNewLabel_4.setBounds(10, 118, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(66, 115, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mode");
		lblNewLabel_5.setBounds(10, 157, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("text");
		rdbtnNewRadioButton.setBounds(39, 153, 86, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("author");
		rdbtnNewRadioButton_1.setBounds(127, 153, 86, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("type");
		rdbtnNewRadioButton_2.setBounds(39, 180, 63, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("all");
		rdbtnNewRadioButton_3.setBounds(127, 179, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		 ButtonGroup myButtonGroup = new ButtonGroup();
	        myButtonGroup.add(rdbtnNewRadioButton);
	        myButtonGroup.add(rdbtnNewRadioButton_1);
	        myButtonGroup.add(rdbtnNewRadioButton_2);
	        myButtonGroup.add(rdbtnNewRadioButton_3);
		
		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		            textField_1.setText(textField.getText() + textField_1.getText());
		 
		            // set the text of field to blank
		            textField.setText("  ");
			}
		});
		btnSearch.setBounds(0, 224, 78, 26);
		contentPane.add(btnSearch);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("  ");
			}
		});
		btnReset.setBounds(95, 224, 71, 26);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_6 = new JLabel("Search History");
		lblNewLabel_6.setBounds(340, 71, 84, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(317, 96, 86, 107);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
