package com.think.xentinel.netflix;

public class Serie extends Pelicula {
	private int temporadas;
	/*Sus atributos son titulo, no. de temporadas, visto, genero, creador y duracion.*/
	
	/**
	 * Constructor default genera todos los atributos
	 * por default gracias a su clase madre.
	 */
	public Serie() {
		this.temporadas = 1;
		this.setTiempoVisto("0");
	}
	
	/**
	 * Constructor 2 recibe un titulo y un creador, los demas atributos
	 * quedan por default
	 * @param titulo titulo de la serie
	 * @param creador creador de la serie
	 */
	public Serie(String titulo, String creador) {
		super(titulo, creador);
		this.temporadas =1;
		this.setTiempoVisto("0");
	}
	/**
	 * Genera una serie con todos los atributos definidos por el usuario	
	 * @param titulo titulo de la serie
	 * @param creador autor de la serie
	 * @param genero genero de la serie
	 * @param anio año de la serie
	 * @param duracion duracion de la serie
	 * @param temporadas numero de temporadas
	 */	
	public Serie(String titulo, String creador, String genero, int anio, String duracion,int temporadas) {
		super(titulo, creador, genero, anio, duracion);
		this.temporadas=temporadas;
		this.setTiempoVisto("0");
	}
	
	/**
	 * Convierte a un String la informacion de la serie
	 * @return un string con la informacion de la serie
	 */
	public String toString() {
		String mensaje = this.getTitulo()+" Duracion: "+this.getDuracion()+" No de temporadas: "+this.getTemporadas()+"\nCreador: "+this.getCreador()+" Genero: "+this.getGenero()+" Año:"+this.getAnio()+" Visto: "+this.esVisto();
		return mensaje+" Tiempo visto: "+this.tiempoVisto();	
	}
	/**
	 * regresa el numero de temporadas
	 * @return numero de temporadas
	 */
	public int getTemporadas() {
		return temporadas;
	}
	
	/**
	 * define el numero de temporadas
	 * @param temporadas nuevo numero de temporadas
	 */
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

}
