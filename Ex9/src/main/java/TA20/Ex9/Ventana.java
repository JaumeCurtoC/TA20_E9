package TA20.Ex9;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JToggleButton;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private int contador=0;
	private JToggleButton[] arrayTB = new JToggleButton[16];
	private JToggleButton[] comparadorBotones;
	private int intentos;
	private int aciertos;


	public Ventana() {
		comparadorBotones = new JToggleButton[2];
		intentos = 0;
		aciertos = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		// Indicamos el tamaño del GridLayout para el número de botones
		contentPane.setLayout(new GridLayout(4, 4, 0, 0));
		
		// Creamos todos los botones y los organizamos en una array de JToogleButtons
		for (int i = 0; i < arrayTB.length; i++) {
			arrayTB[i] = new JToggleButton("");
			arrayTB[i].setBackground(new Color(0, 0, 0));
			arrayTB[i].setSelected(true);
			contentPane.add(arrayTB[i]);
			arrayTB[i].addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				// Al ser pulsados ejecutarán el siguiente método
    				compare((JToggleButton)e.getSource());
    			}
    		});
		}

		setVisible(true);
		
		// Asignamos los colores de cada botón de forma aleatoria
		randomColor();
		
	}
	
	// Este método comparará los colores de dos botones que hayamos pulsado
	private void compare(JToggleButton boton) {
		// Si es el primer botón que hemos pulsado: lo guardaremos y lo deshabilitaremos
		// Así el usuario no puede seleccionarlo de nuevo
        if(contador==0) {
            comparadorBotones[contador] = boton;
            contador++;
            boton.setEnabled(false);
        } else {
        	// Si es el segundo botón que se a pulsado: comparará los colores que tengan cada uno
            if(comparadorBotones[0].getBackground() == boton.getBackground()) {
            	// En caso que sean iguales: guardamos el segundo botón, ponemos el contador a 0 de nuevo y
            	// ejecutamos el método acerto().
                comparadorBotones[contador] = boton;
                contador=0;
                acerto();
                aciertos++;
                
                // Además pasamos los valores del array comparadorBotones a null,
                // Así podemos seguir comparando botones
                Arrays.fill(comparadorBotones, null);
            } else {
            	// En caso que no sean iguales:
            	// Deshabilitamos los botones
            	for (int i = 0; i < arrayTB.length; i++) {
            		arrayTB[i].setEnabled(false);
            	}
            	//Guardamos el botón y ponemos el contador a 0
            	comparadorBotones[contador] = boton;
                contador=0;
                // Dejaremos un tiempo en el cual el jugador podrá ver el color del segundo botón
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                    	// Tras el cual ejecutaremos el metodo noAcerto()
                    	noAcerto();
                    	// Pasaremos los valores del array comparadorBotones a null
                    	Arrays.fill(comparadorBotones, null);
                    	// Y volveremos a habilitar los botones
                    	for (int i = 0; i < arrayTB.length; i++) {
                    		arrayTB[i].setEnabled(true);
                    	}
                    }
                }, 350);
                
            }
            // Sumaremos un intento más al contador
            intentos++;
            // En el caso que tengamos 8 aciertos (Se hayan emparejado todos los colores)
            // Se ejecutará el método endGame()
            if(aciertos==8) {
            	endGame();
            }
        }
    }
	
	// Este método mostrara un JOptionPane indicando que se ha ganado y un recuento total de los intentos realizados
	private void endGame() {
		JOptionPane.showMessageDialog(contentPane, "Felicitaciones! Has ganado!\nTan solo te costó " + intentos + " intentos");
	}

	// Este método deshabilita los dos botones seleccionados
	// Han sido emparejados correctamente y no se necesita volver a interactuar con ellos
    private void acerto() {
        for(int i = 0; i<comparadorBotones.length; i++) {
            comparadorBotones[i].setEnabled(false);
        }
    }
    
    // Este método vuelve a ocultar sus colores
    private void noAcerto() {
        for(int i=0;i<comparadorBotones.length; i++) {
            comparadorBotones[i].setSelected(true);
        }
    }
    
    // Este método asigna un color random a cada botón
	private void randomColor() {
		// El array tiene dos instancias del mismo color, pues estos van por parejas
		ArrayList<Color> colores = new ArrayList<>(Arrays.asList(
                Color.RED,Color.RED, Color.BLUE,Color.BLUE, Color.GREEN,Color.GREEN, Color.ORANGE,Color.ORANGE,
                Color.YELLOW,Color.YELLOW, Color.CYAN,Color.CYAN,  Color.MAGENTA,Color.MAGENTA, Color.PINK, Color.PINK));
		
		// Por cada botón se comprueba que no se le ha sido asignado otro color del array
		for (int i = 0; i < arrayTB.length; i++) {
			if (arrayTB[i].getBackground().getRed() == 0 && arrayTB[i].getBackground().getGreen() == 0 && arrayTB[i].getBackground().getBlue() == 0) {
				
				// Se determina de forma aleatoria un color dentro del array
				int r = getRandomNumber(i);
				// Se le asigna al botón
				arrayTB[i].setBackground(colores.get(r));
				// Y se elimina el color del array
				colores.remove(r);
			}
		}
	}
	
	// Se genera un número aleatorio igual al tamaño del array de colores / botones aún por asignar
	public int getRandomNumber(int i) {
        Random ran = new Random();
        int randomNumber=ran.nextInt(16-i);
        return randomNumber;
    }

}
