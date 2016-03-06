package com.think.xentinel.netflix;

public class Pelicula implements IVisualizable {
	
	/*Atributos de la clase pelicula*/
	private String titulo;
	private String genero;
	private String creador;
	private int anio;
	private String duracion;
	private boolean visto;
	private String tiempoVisto;
	
	/*
	 * Este es el metodo constructor por default
	 * instancia un objeto de la clase pelicula
	 * con valores de los atributos por default
	 * */
	public Pelicula() {
		this.titulo = "titulo default";
		this.genero = "desconocido";
		this.creador = "creador default";
		this.anio = 1992;
		this.duracion = "89 minutos";
		this.visto = false;
		this.tiempoVisto="0";
	}
	
	/**
	 * Método constructor con dos argumentos,
	 * instancia el objeto pelicula con los demas
	 * atributos por default.
	 * @param titulo  String: el titulo de la pelicula
	 * @param creador String: el creador o autor de la pelicula
	 * */
	
	public Pelicula(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero="desconocido";
		this.anio = 1992;
		this.duracion = "89 minutos";
		this.visto = false;
		this.tiempoVisto = "0";
	}
	
	/**
	 * Método constructor, instancia un objeto pelicula
	 * con todos los parametros de la pelicula definidos
	 * por el usuario.
	 * @param titulo el titulo de la pelicula
	 * @param creador el autor de la pelicula
	 * @param genero el genero de la pelicula
	 * @param anio el año en que fue creada 
	 * @param duracion duracion es deseable el formato p.ejemplo 1h 23m
	 */
	
	public Pelicula (String titulo, String creador, String genero, int anio, String duracion) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.anio = anio;
		this.duracion = duracion;
		this.visto = false;
		this.tiempoVisto = "0";
	}
	
	/**
	 * Obtener el titulo del objeto
	 * @return String: titulo del objeto
	 */
	
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Cambia el titulo de la objeto
	 * @param titulo titulo a colocar en el objeto
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * obtiene el genero del objeto
	 * @return genero del objeto
	 */
	public String getGenero() {
		return genero;
	}
	
	/**
	 * cambia el genero del objeto
	 * @param genero genero a colocar
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * El creador del objeto
	 * @return nombre del creador
	 */
	public String getCreador() {
		return creador;
	}
	
	/**
	 * define el creador del objeto
	 * @param creador nombre del creador
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	/**
	 * el año de creacion del objeto
	 * @return año de creacion
	 */
	public int getAnio() {
		return anio;
	}
	
	/**
	 * cambia el año de creacion
	 * @param anio nuevo año de creacion
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	/**
	 * la duracion del objeto
	 * @return String: duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	
	/**
	 * Cambia la duracion del objeto
	 * @param duracion duracion nueva
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
		
	/**
	 * convierte en string los datos del objeto
	 * @return String con los datos del objeto 
	 */
	public String toString () {
		String mensaje = this.titulo+" Duracion: "+this.duracion+"\nCreador: "+this.creador+" Genero: "+this.genero+" Año:"+this.anio+" Visto: "+this.visto;
		return mensaje+" tiempo visto: "+this.tiempoVisto;
	}	
	/**
	 * Cambia el tiempo que ha sido visualizado un objeto p ejemplo 1h y 25min
	 * @param tiempo Un string que describa el tiempo 
	 */
	public void setTiempoVisto(String tiempo) {
		this.tiempoVisto = tiempo;
	}
	
	
	///---------------------IMPLEMENTANDO LA INTERFAZ VISUALIZABLE---------------////
	
	/**
	 * cambia el atributo de visto a true.
	 */
	@Override 
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.visto = true;		
	}

	/**
	 * Devuelve el estado del atributo visto.
	 */
	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}
	/**
	 * Devuelve el tiempo en minutos/segundos que se visualizó el video.
	 */
	@Override
	public String tiempoVisto() {
		return this.tiempoVisto;
	}


}
