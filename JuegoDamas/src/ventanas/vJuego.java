package ventanas;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Tablero;

public class vJuego extends JFrame implements MouseListener{
	JPanel panelCabecera = new JPanel();
	
	JLabel JLnom1 = new JLabel();
	JLabel JLnom2 = new JLabel();
	Tablero t= new Tablero();
	JButton botonGuardar = new JButton("Guardar");
	JButton botonVolver = new JButton("Volver");
	
	public vJuego(Object cargada, String nom1, String nom2){
		
		JLnom1.setText(nom1);
		JLnom2.setText(nom2);
		panelCabecera.setLayout(new GridLayout(2,1));
		panelCabecera.add(JLnom1, BorderLayout.CENTER);
		panelCabecera.add(JLnom2, BorderLayout.CENTER);
		panelCabecera.setSize(400, 50);
		this.add(panelCabecera,BorderLayout.SOUTH);
		
		this.add(t.getPanelTablero(),BorderLayout.CENTER);
		this.setSize(400,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
