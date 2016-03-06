package com.think.xentinel.netflix;

import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Pelicula> peliculas = new ArrayList <Pelicula> ();
		
		Pelicula nemo = new Pelicula("Buscando a nemo", "pixar", "animacion", 2000, "90 minutos");
		Pelicula padrino = new Pelicula("El padrino", "Mario Puzo", "violenta", 1975, "3h 22 min");
		Pelicula harry = new Pelicula("Harry el sucio", "Clint Eastwood", "Accion", 1971, "1h 42min");
		Pelicula rocky = new Pelicula("rocky", "stalone", "aventuras", 1976, "1h 59m");
		Pelicula sword = new Pelicula("Sword Of Destiny", "Netflix", "peleas", 2016, "1h 40m");
		
		peliculas.add(nemo);
		peliculas.add(padrino);
		peliculas.add(harry);
		peliculas.add(rocky);
		peliculas.add(sword);
		
		peliculas.get(0).setTiempoVisto("1 hora");
		peliculas.get(1).setTiempoVisto("25 minutos");
		peliculas.get(0).setTiempoVisto("1 hora 45 minutos");
		peliculas.get(3).setTiempoVisto("2 horas 23 minutos");
		peliculas.get(1).marcarVisto();
		peliculas.get(0).marcarVisto();
		
		Serie house = new Serie("Dr house", "David Shoore", "Doctores", 2000,"45m",8);
		Serie cards = new Serie("House of Cards", "netflix", "politica", 2015, "50m", 4);
		Serie simpsons = new Serie("Los Simpsons","Mat Groening","animacion",1989,"22m",27);
		Serie gossip = new Serie("Gossip Girl", "Stephanie Savage", "Drama", 2012,"45m", 6);
		Serie breaking = new Serie("Breaking Bad", "Vince Gilligan", "Realista", 2013, "1h", 5);
		
		ArrayList <Serie> series = new ArrayList <Serie> ();
		series.add(house);
		series.add(cards);
		series.add(simpsons);
		series.add(gossip);
		series.add(breaking);		
		series.get(0).setTiempoVisto("2h");
		series.get(1).setTiempoVisto("45m");
		series.get(0).marcarVisto();
		series.get(1).marcarVisto();
		
		//TODAS LAS PELICULAS
		System.out.println("Todas las series y peliculas: ");
		System.out.println("--------------------------------------------------");
		
		try {
			for (int i = 0; i < series.size()+1; i++) {
				System.out.println(series.get(i).toString());
				System.out.println();
			}
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("\n----------------------------------");
			System.out.println("Error, estas tratando de ingresar a un indice no valido o fuera de los límites");
			System.out.println("----------------------------------\n");
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Inesperado");
			e.printStackTrace();
		}
		
		
		
		try {
			for (int i = 0; i < peliculas.size(); i++) {
				System.out.println(peliculas.get(i).toString());
				System.out.println();
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Error, estas tratando de ingresar a un indice no valido o fuera de los límites");
		}
		
				
		System.out.println("--------------------------------------------------");
		System.out.println("Series Vistas: ");
		
		try {
			for (int i = 0; i < series.size(); i++) {
				if (series.get(i).esVisto()) {
					System.out.println(series.get(i).toString());
					System.out.println();
				}
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Error, estas tratando de ingresar a un indice no valido o fuera de los límites");
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("Peliculas vistas:  ");
		try {
			for (int i = 0; i < peliculas.size(); i++) {
				if (peliculas.get(i).esVisto()) {
					System.out.println(peliculas.get(i).toString());
					System.out.println();
				}
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Error, estas tratando de ingresar a un indice no valido o fuera de los límites");
		}
		
		System.out.println("--------------------------------------------------");		
		System.out.println();
		System.out.println("Serie con mas temporadas");
		Serie serieMasTemporadas;
		serieMasTemporadas=series.get(0);
		try {
			for (int i = 1; i < series.size(); i++) {
				if (series.get(i).getTemporadas()>serieMasTemporadas.getTemporadas()) {
					serieMasTemporadas=series.get(i);
				}
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("\n----------------------------------");
			System.out.println("Error, estas tratando de ingresar a un indice no valido o fuera de los límites");
			System.out.println("----------------------------------\n");
		}
		System.out.println(serieMasTemporadas.toString());
		System.out.println("--------------------------------------------------");
		System.out.println();	
		System.out.println("Pelicula mas reciente");
		Pelicula peliculaMasReciente;
		peliculaMasReciente = peliculas.get(0);
		try {
			for (int i = 1; i < peliculas.size(); i++) {
				if (peliculas.get(i).getAnio()>peliculaMasReciente.getAnio()) {
					peliculaMasReciente=peliculas.get(i);
				}			
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("\n----------------------------------");
			System.out.println("Error, estas tratando de ingresar a un indice no valido o fuera de los límites");
			System.out.println("----------------------------------\n");
		}
		System.out.println(peliculaMasReciente.toString());
		

	}

}
