package TA20.Ex9;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JToggleButton;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 0, 0));
		
		JToggleButton tglbtn = new JToggleButton("");
		tglbtn.setBackground(new Color(0, 0, 0));
		tglbtn.setSelected(true);
		contentPane.add(tglbtn);
		
		JToggleButton tglbtn1 = new JToggleButton("");
		tglbtn1.setBackground(new Color(0, 0, 0));
		tglbtn1.setSelected(true);
		contentPane.add(tglbtn1);
		
		JToggleButton tglbtn2 = new JToggleButton("");
		tglbtn2.setBackground(new Color(0, 0, 0));
		tglbtn2.setSelected(true);
		contentPane.add(tglbtn2);
		
		JToggleButton tglbtn3 = new JToggleButton("");
		tglbtn3.setBackground(new Color(0, 0, 0));
		tglbtn3.setSelected(true);
		contentPane.add(tglbtn3);
		
		JToggleButton tglbtn4 = new JToggleButton("");
		tglbtn4.setSelected(true);
		tglbtn4.setBackground(new Color(0, 0, 0));
		contentPane.add(tglbtn4);
		
		JToggleButton tglbtn5 = new JToggleButton("");
		tglbtn5.setBackground(new Color(0, 0, 0));
		tglbtn5.setSelected(true);
		contentPane.add(tglbtn5);
		
		JToggleButton tglbtn6 = new JToggleButton("");
		tglbtn6.setBackground(new Color(0, 0, 0));
		tglbtn6.setSelected(true);
		contentPane.add(tglbtn6);
		
		JToggleButton tglbtn7 = new JToggleButton("");
		tglbtn7.setBackground(new Color(0, 0, 0));
		tglbtn7.setSelected(true);
		contentPane.add(tglbtn7);
		
		JToggleButton tglbtn8 = new JToggleButton("");
		tglbtn8.setBackground(new Color(0, 0, 0));
		tglbtn8.setSelected(true);
		contentPane.add(tglbtn8);
		
		JToggleButton tglbtn9 = new JToggleButton("");
		tglbtn9.setBackground(new Color(0, 0, 0));
		tglbtn9.setSelected(true);
		contentPane.add(tglbtn9);
		
		JToggleButton tglbtn10 = new JToggleButton("");
		tglbtn10.setBackground(new Color(0, 0, 0));
		tglbtn10.setSelected(true);
		contentPane.add(tglbtn10);
		
		JToggleButton tglbtn11 = new JToggleButton("");
		tglbtn11.setBackground(new Color(0, 0, 0));
		tglbtn11.setSelected(true);
		contentPane.add(tglbtn11);
		
		JToggleButton tglbtn12 = new JToggleButton("");
		tglbtn12.setBackground(new Color(0, 0, 0));
		tglbtn12.setSelected(true);
		contentPane.add(tglbtn12);
		
		JToggleButton tglbtn13 = new JToggleButton("");
		tglbtn13.setBackground(new Color(0, 0, 0));
		tglbtn13.setSelected(true);
		contentPane.add(tglbtn13);
		
		JToggleButton tglbtn14 = new JToggleButton("");
		tglbtn14.setBackground(new Color(0, 0, 0));
		tglbtn14.setSelected(true);
		contentPane.add(tglbtn14);
		
		JToggleButton tglbtn15 = new JToggleButton("");
		tglbtn15.setBackground(new Color(0, 0, 0));
		tglbtn15.setSelected(true);
		contentPane.add(tglbtn15);
		
		
		setVisible(true);
	}

	
}
