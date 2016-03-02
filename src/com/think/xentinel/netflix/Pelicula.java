package com.think.xentinel.netflix;

public class Pelicula implements IVisualizable {
	private String titulo;
	private String genero;
	private String creador;
	private int anio;
	private String duracion;
	private boolean visto;
	private double tiempoVisto;
	
	public Pelicula() {
		this.titulo = "titulo default";
		this.genero = "desconocido";
		this.creador = "creador default";
		this.anio = 1992;
		this.duracion = "89 minutos";
		this.visto = false;
		this.tiempoVisto=0;
	}
	
	public Pelicula(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero="desconocido";
		this.anio = 1992;
		this.duracion = "89 minutos";
		this.visto = false;
		this.tiempoVisto = 0;
	}
	
	public Pelicula (String titulo, String creador, String genero, int anio, String duracion) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.anio = anio;
		this.duracion = duracion;
		this.visto = false;
		this.tiempoVisto = 0;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	public String toString () {
		String mensaje = this.titulo+" Duracion: "+this.duracion+"\nCreador: "+this.creador+" Genero: "+this.genero+" Año:"+this.anio+" Visto: "+this.visto;
		return mensaje+"tiempo visto: "+this.tiempoVisto;
	}
	public double tiempoVisto() {
		return  this.tiempoVisto;
	}
	public void setTiempoVisto(double tiempo) {
		this.tiempoVisto = tiempo;
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.setVisto(true);
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.isVisto();
	}

}
