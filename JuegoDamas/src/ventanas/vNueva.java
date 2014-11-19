package ventanas;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class vNueva extends JFrame implements MouseListener
{
	JPanel panelCabecera = new JPanel();
	JPanel panelJugadores = new JPanel();
	JPanel panelBotonera= new JPanel();
	JLabel partidaNueva = new JLabel ("Introduce los nombres de los jugadores");
	JLabel piezaNegra = new JLabel ("Negras:");
	JLabel piezaBlanca = new JLabel ("Blancas:");
	JTextField JTNegras = new JTextField (" ");
	JTextField JTBlancas = new JTextField (" ");
	JButton botonJugar = new JButton ("Jugar");
	JButton botonVolver = new JButton ("Volver");	

	
	public vNueva(){		
		
		panelCabecera.setLayout(new BorderLayout());
		panelCabecera.add(partidaNueva, BorderLayout.CENTER);
		panelCabecera.setSize(400, 30);
		
		panelJugadores.setLayout(new GridLayout(2,2));
		panelJugadores.setSize(400,50);
		panelJugadores.add(piezaBlanca);
		panelJugadores.add(JTBlancas);
		panelJugadores.add(piezaNegra);			
		panelJugadores.add(JTNegras);

		panelBotonera.setLayout(new GridLayout(1,2));
		panelBotonera.setSize(400, 70);
		panelBotonera.add(botonJugar);
		panelBotonera.add(botonVolver);
		
		botonJugar.addMouseListener(this);
		botonVolver.addMouseListener(this);
	
		
		this.setSize(400, 150);
		this.add(panelCabecera,BorderLayout.NORTH);
		this.add(panelJugadores,BorderLayout.CENTER);
		this.add(panelBotonera,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Nueva partida");
		this.setLocationRelativeTo(null);
	}

	

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if( arg0.getSource()==botonJugar){
			this.dispose();
			vJuego juego= new vJuego(null,JTBlancas.getText(),JTNegras.getText());
			juego.setVisible(true);
			
		}
		if(arg0.getSource()==botonVolver)
		{
			this.dispose();
			vInicio inicio= new vInicio();
			inicio.setVisible(true);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
