package TA20.Ex9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
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
		setBounds(100, 100, 533, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JToggleButton tglbtn = new JToggleButton("New toggle button");
		contentPane.add(tglbtn, "2, 2");
		
		JToggleButton tglbtn1 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn1, "4, 2");
		
		JToggleButton tglbtn2 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn2, "6, 2");
		
		JToggleButton tglbtn3 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn3, "8, 2");
		
		JToggleButton tglbtn4 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn4, "2, 4");
		
		JToggleButton tglbtn5 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn5, "4, 4");
		
		JToggleButton tglbtn6 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn6, "6, 4");
		
		JToggleButton tglbtn7 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn7, "8, 4");
		
		JToggleButton tglbtn8 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn8, "2, 6");
		
		JToggleButton tglbtn9 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn9, "4, 6");
		
		JToggleButton tglbtn10 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn10, "6, 6");
		
		JToggleButton tglbtn11 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn11, "8, 6");
		
		JToggleButton tglbtn12 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn12, "2, 8");
		
		JToggleButton tglbtn13 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn13, "4, 8");
		
		JToggleButton tglbtn14 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn14, "6, 8");
		
		JToggleButton tglbtn15 = new JToggleButton("New toggle button");
		contentPane.add(tglbtn15, "8, 8");
	
	}

}
