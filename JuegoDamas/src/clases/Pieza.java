package clases;

import clases.Colores;

public class Pieza
{
	
	private Colores color = Colores.NEGRO;
	private int x = 0;
	private int y = 0;


	public void setLugar(int x, int y)
	{
		if (x < 0 || y < 0)
		{
			throw new IllegalArgumentException("Las coordenadas x(" + x+ ") o y(" + y + ") tienen que ser positivas" +
					"");
		}
		this.x = x;
		this.y = y;
	}

	public final Colores getColor()
	{
		return color;
	}

	public final int getX()
	{
		return x;
	}

	public final int getY()
	{
		return y;
	}

	
}
