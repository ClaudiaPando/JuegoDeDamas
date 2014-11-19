package ventanas;

import javax.swing.JFrame;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.EventObject;

public class vInicio extends JFrame implements ActionListener
{
	JPanel panelBotones= new JPanel();
	JButton botonIniciar= new JButton("Iniciar Partida");
	JButton botonCargar=new JButton("Cargar Partida");
	JButton botonSalir= new JButton("Salir");

	
	public vInicio()
	{
		panelBotones.setLayout(new BorderLayout());
		
		panelBotones.add(botonIniciar,BorderLayout.NORTH);
		panelBotones.add(botonCargar,BorderLayout.CENTER);
		panelBotones.add(botonSalir, BorderLayout.SOUTH);
		
		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.CENTER);
		this.setSize(300, 150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Juego de Damas");
		this.setLocationRelativeTo(null);
				
		botonIniciar.addActionListener(this);
		botonCargar.addActionListener(this);
		botonSalir.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//EventObject e = null;
		JButton botonPulsado=(JButton)arg0.getSource();
		
		if(botonPulsado==botonIniciar)
		{
			this.dispose();
			vNueva nueva = new vNueva();
			nueva.setVisible(true);
		}
		if(botonPulsado==botonCargar)
		{
			this.dispose();
			vCargar cargar = new vCargar();
			cargar.setVisible(true);
			
		}
		if(botonPulsado==botonSalir)
		{
			this.dispose();
		}
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		new vInicio();
	}


	
}
