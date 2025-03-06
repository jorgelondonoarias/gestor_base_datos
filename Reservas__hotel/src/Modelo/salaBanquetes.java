package Modelo;

import Modelo.sala_reuniones.tiempoReserva;

public class salaBanquetes {

	
	private int numSala;
	enum tiempoReserva{
		MANANA,TARDE,DIAENTERO,SINRESERVA
	}
	 private tiempoReserva tiempoReserva;
	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	public tiempoReserva getTiempoReserva() {
		return tiempoReserva;
	}
	public void setTiempoReserva(tiempoReserva tiempoReserva) {
		this.tiempoReserva = tiempoReserva;
	}
	
	
	public salaBanquetes(int numSala, Modelo.salaBanquetes.tiempoReserva tiempoReserva) {
		super();
		this.numSala = numSala;
		this.tiempoReserva = tiempoReserva;
	}
	
	public salaBanquetes() {
		super();
		this.numSala = 0;
		this.tiempoReserva = tiempoReserva;
	}
	
	
}
