package com.think.xentinel.netflix;

public class Serie extends Pelicula implements IVisualizable {
	private int temporadas;
	
	public Serie() {
		this.temporadas = 1;
		this.setTiempoVisto(0);
	}
	
	public Serie(String titulo, String creador) {
		super(titulo, creador);
		this.temporadas =1;
		this.setTiempoVisto(0);
	}
	
	public Serie(String titulo, String creador, String genero, int anio, String duracion,int temporadas) {
		super(titulo, creador, genero, anio, duracion);
		this.temporadas=temporadas;
		this.setTiempoVisto(0);
	}
	
	public String toString() {
		String mensaje = this.getTitulo()+" Duracion: "+this.getDuracion()+" No de temporadas: "+this.getTemporadas()+"\nCreador: "+this.getCreador()+" Genero: "+this.getGenero()+" Año:"+this.getAnio()+" Visto: "+this.isVisto();
		return mensaje+" Tiempo visto: "+this.tiempoVisto();	
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
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
	@Override
	public double tiempoVisto() {
		return this.tiempoVisto();		
	}
}
