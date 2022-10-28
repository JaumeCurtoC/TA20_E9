package TA20.Ex9;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JToggleButton;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private int contador=0;
	private JToggleButton[] arrayTB = new JToggleButton[16];
	private JToggleButton[] comparadorBotones = new JToggleButton[2];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana9 frame = new Ventana9();
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
	public Ventana9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 0, 0));

		for (int i = 0; i < arrayTB.length; i++) {
			arrayTB[i] = new JToggleButton("");
			arrayTB[i].setBackground(new Color(0, 0, 0));
			arrayTB[i].setSelected(true);
			contentPane.add(arrayTB[i]);
			arrayTB[i].addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				//compare();
    			}
    		});
		}

		setVisible(true);
		
		randomColor();
		//botonSeleccionado();
		
	}
	private void compare(JToggleButton boton) {
        if(contador==0) {
            comparadorBotones[contador] = boton;
            contador++;
        } else if(contador==1){
            if(comparadorBotones[contador-1].getBackground() == boton.getBackground()) {
                comparadorBotones[contador] = boton;
                contador=0;
                acerto();
            } else {
                contador=0;
                noAcerto();
            }
        }
    }

    private void acerto() {
        for(int i = 0; i<comparadorBotones.length; i++) {
            comparadorBotones[i].setEnabled(false);
        }
    }

    private void noAcerto() {
        for(int i=0;i<comparadorBotones.length; i++) {
            comparadorBotones[i].setSelected(true);
        }
    }
	private void randomColor() {
		ArrayList<Color> colores = new ArrayList<>(Arrays.asList(
                Color.RED,Color.RED, Color.BLUE,Color.BLUE, Color.GREEN,Color.GREEN, Color.ORANGE,Color.ORANGE,
                Color.YELLOW,Color.YELLOW, Color.CYAN,Color.CYAN,  Color.MAGENTA,Color.MAGENTA, Color.PINK, Color.PINK));
		
		for (int i = 0; i < arrayTB.length; i++) {
			if (arrayTB[i].getBackground().getRed() == 0 && arrayTB[i].getBackground().getGreen() == 0 && arrayTB[i].getBackground().getBlue() == 0) {

				int r = getRandomNumber(i);
				arrayTB[i].setBackground(colores.get(r));
				colores.remove(r);
			}
		}
	}
	
	public int getRandomNumber(int i) {
        Random ran = new Random();
        int randomNumber=ran.nextInt(16-i);
        return randomNumber;
    }

}
