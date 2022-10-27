package TA20.Ex9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JToggleButton;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, -3, -3));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_9_1 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9_1);
		
		JToggleButton tglbtnNewToggleButton_9_3 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9_3);
		
		JToggleButton tglbtnNewToggleButton_9_2 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9_2);
		
		JToggleButton tglbtnNewToggleButton_9_4 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9_4);
		
		JToggleButton tglbtnNewToggleButton_9_7 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9_7);
		
		JToggleButton tglbtnNewToggleButton_9_5 = new JToggleButton("New toggle button");
		contentPane.add(tglbtnNewToggleButton_9_5);
	}

}
