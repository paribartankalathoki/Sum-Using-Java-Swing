package com.java.swing;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Paribartan
 *
 */
public class SumUsingSwing extends JFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Sum of Two Numbers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel firstNumber = new JLabel("First Number : ");
		firstNumber.setBounds(100, 170, 100, 20);
		frame.add(firstNumber);
		
		JTextField firstNumberField = new JTextField();
		firstNumberField.setBounds(200, 170, 140, 20);
		frame.add(firstNumberField);
		
		JLabel secondNumber = new JLabel("Second Number : ");
		secondNumber.setBounds(100, 200, 100, 20);
		frame.add(secondNumber);
		
		JTextField secondNumberField = new JTextField();
		secondNumberField.setBounds(200, 200, 140, 20);
		frame.add(secondNumberField);
		
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		      firstNumberField.setText("");
		      secondNumberField.setText("");
		     }
		  });
		reset.setBounds(100, 230, 100, 20);
		frame.add(reset);
		
		JButton result = new JButton("ADD");
		
		JLabel add = new JLabel();
		add.setBounds(200, 300, 100, 20);
		frame.add(add);
		result.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String firstNumber = firstNumberField.getText();
				String secondNumber = secondNumberField.getText();
				int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
				System.out.println(sum);
				add.setText("SUM = " + sum);
			}
			
		});
		
		result.setBounds(240, 230, 100, 20);
		frame.add(result);
		
		
		frame.setVisible(true);

	}

}
