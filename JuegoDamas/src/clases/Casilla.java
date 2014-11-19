package clases;

import java.awt.*;
import javax.swing.*;

public class Casilla extends JPanel
{

	private Image imagenCasilla=null;
	private EstadoCasilla estadoCasilla=EstadoCasilla.NORMAL;
	
	public Casilla (boolean color){
		if(color)
			setBackground(Color.BLACK);
		else
			setBackground(Color.WHITE);

		this.setSize(400/8,400/8);
	}

		public Image getImagenCasilla() {
		return imagenCasilla;
	}

	public void setImagenCasilla(Image imagenCasilla) {
		this.imagenCasilla = imagenCasilla;
	}

	public EstadoCasilla getEstadoCasilla() {
		return estadoCasilla;
	}
	
	public void setEstadoCasilla(EstadoCasilla estadoCasilla) {
		this.estadoCasilla = estadoCasilla;
	}

	
	
	
	

}
