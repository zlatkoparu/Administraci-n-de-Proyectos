package Interfaz;

import javax.swing.*;

import java.awt.*;

public class InterfazPrueba extends JFrame {

	private Dibujo contenedora;
	
	public class Dibujo extends JPanel {

		public void paintComponent(Graphics g) {

			Color c = new Color(105, 105, 105);
			this.repaint();
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(c);
			Toolkit imagen = Toolkit.getDefaultToolkit();
			Image img = imagen.getImage("Imagenes/Fondo1.png");
			g2.drawImage(img, 0, 0, 394,700, this);
			

			this.repaint();

		}

		public Dibujo() {

			this.setLayout(null);
		}
	}

	public InterfazPrueba() {

		this.setUndecorated(true);
		this.setLayout(null);
		contenedora=new Dibujo();
		setSize(394, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		contenedora.setBounds(0,0,394,700);
		add(contenedora);

	}

	public static void main(String[] args) {

		InterfazPrueba b = new InterfazPrueba();
		b.setVisible(true);

	}

}
