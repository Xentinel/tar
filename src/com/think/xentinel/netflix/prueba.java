package com.think.xentinel.netflix;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula arregloPeliculas [] = new Pelicula [5];
		arregloPeliculas[0] = new Pelicula("Buscando a nemo", "pixar", "animacion", 2000, "90 minutos");
		arregloPeliculas[1] = new Pelicula("El padrino", "Mario Puzo", "violenta", 1975, "3h 22 min");
		arregloPeliculas[2] = new Pelicula("Harry el sucio", "Clint Eastwood", "Accion", 1971, "1h 42min");
		arregloPeliculas[3] = new Pelicula("rocky", "stalone", "aventuras", 1976, "1h 59m");
		arregloPeliculas[4] = new Pelicula("Sword Of Destiny", "Netflix", "peleas", 2016, "1h 40m");
		
		Serie series []= new Serie[5];
		series[0] = new Serie("Dr house", "David Shoore", "Doctores", 2000,"45m",8);
		series[1] = new Serie("House of Cards", "netflix", "politica", 2015, "50m", 4);
		series[2] = new Serie("Los Simpsons","Mat Groening","animacion",1989,"22m",27);
		series[3] = new Serie("Gossip Girl", "Stephanie Savage", "Drama", 2012,"45m", 6);
		series[4] = new Serie("Breaking Bad", "Vince Gilligan", "Realista", 2013, "1h", 5);
		
		arregloPeliculas[0].setTiempoVisto("1 hora");
		arregloPeliculas[1].setTiempoVisto("25 minutos");
		series[0].setTiempoVisto("1 hora 45 minutos");
		series[3].setTiempoVisto("2 horas 23 minutos");
		
		arregloPeliculas[1].marcarVisto();
		arregloPeliculas[0].marcarVisto();
		series[3].marcarVisto();
		series[0].marcarVisto();
		
		
		System.out.println("Peliculas y Series Vistas: ");
		for (int i = 0; i < arregloPeliculas.length; i++) {
			if(arregloPeliculas[i].esVisto()) {
				System.out.println(arregloPeliculas[i].toString());
				System.out.println();
			}
			
			if (series[i].esVisto()) {
				System.out.println(series[i].toString());
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("Serie con mas temporadas");
		Serie serieMasTemporadas;
		serieMasTemporadas=series[0];
		for (int i = 1; i < series.length; i++) {
			if (series[i].getTemporadas()>serieMasTemporadas.getTemporadas()) {
				serieMasTemporadas=series[i];
			}
		}
		System.out.println(serieMasTemporadas.toString());
		
		
		System.out.println();
		System.out.println("Pelicula mas reciente");
		Pelicula peliculaMasReciente;
		peliculaMasReciente = arregloPeliculas[0];
		for (int i = 1; i < arregloPeliculas.length; i++) {
			if (arregloPeliculas[i].getAnio()>peliculaMasReciente.getAnio()) {
				peliculaMasReciente=arregloPeliculas[i];
			}			
		}
		System.out.println(peliculaMasReciente.toString());
		

	}

}
