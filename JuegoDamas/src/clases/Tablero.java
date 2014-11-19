package clases;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Tablero {
	JPanel panelTablero = new JPanel();
	ArrayList<Casilla> casillas = new ArrayList<Casilla>();
	int TAMANYO=8;
	public Tablero(){
		panelTablero.setLayout(new GridLayout(TAMANYO,TAMANYO));
		
		
		crearTablero();
		
	panelTablero.setSize(400,400);
	
	//panelTablero.setBackground(Color.BLUE);
	}
	public JPanel getPanelTablero() {
		return panelTablero;
	}
	
	/*private class Casilla
	{
		public Colores color = null;
		public Pieza pie = null;
		public EstadoCasilla estado = EstadoCasilla.NORMAL;
		
		public Colores getColor()
		{
			return color;
		}
		public void setColor(Colores color)
		{
			this.color = color;
		}
		public Pieza getPieza()
		{
			return pie;
		}
		public void setPieza(Pieza pie)
		{
			this.pie = pie;
		}
		public EstadoCasilla getEstado()
		{
			return estado;
		}
		public void setEstadoCasilla(EstadoCasilla estado)
		{
			this.estado = estado;
		}
	}*/
	
	
private void crearTablero(){
	Casilla c;
	for(int fila=0;fila<TAMANYO;fila++){
		for(int columna=0;columna<TAMANYO;columna++){
			if (fila %2 ==0){
				if (columna %2==0){
					c= new Casilla(false);
					casillas.add(c);
					panelTablero.add(c);
				}else{
					c= new Casilla(true);
					casillas.add(c);// casilla negra es true
					panelTablero.add(c);	
				}
			}else{
				if (columna %2!=0){
					c= new Casilla(false);
					casillas.add(c);
					panelTablero.add(c);
				}else{
					c= new Casilla(true);
					casillas.add(c);// casilla negra es true
					panelTablero.add(c);	
				}
			}
		}
	}
	/*
	for(int i=0;i<8;i++){
	
	if(i%2==1 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}
for(int i=8;i<16;i++){
	
	if(i%2==0 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}
for(int i=16;i<24;i++){
	
	if(i%2==1 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}
for(int i=24;i<32;i++){
	
	if(i%2==0 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}
for(int i=32;i<40;i++){
	
	if(i%2==1 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}
for(int i=40;i<48;i++){
	
	if(i%2==0 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}
for(int i=48;i<56;i++){
	
	if(i%2==1 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}
for(int i=56;i<64;i++){
	
	if(i%2==0 ){
			c= new Casilla(true);
				casillas.add(c);// casilla negra es true
				panelTablero.add(c);	
	}else{
		c= new Casilla(false);
		casillas.add(c);
		panelTablero.add(c);
	}
}*/
}
}
