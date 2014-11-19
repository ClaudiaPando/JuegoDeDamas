package clases;

public class Jugador 
{	
	private String nombre = null;
	private Colores color = Colores.NEGRO;
	private int puntos = 0;

	Jugador (Colores color)
	{
		if (color == null)
		{
			throw new NullPointerException("El color del jugador no puede ser nulo");
		}
		this.color = color;
	}

	public void setNombre(String nombre)
	{
		if (nombre == null)
		{
			throw new NullPointerException("El nombre del jugador no puede ser nulo.");
		}
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}

	public void setPuntos (int puntos)
	{
		if (puntos < 0)
		{
			throw new IllegalArgumentException("Los puntos no pueden ser negativos.");
		}
		this.puntos = puntos;
	}

	public int getPuntos()
	{
		return puntos;
	}

	public Colores getColor()
	{
		return color;
	}
}


