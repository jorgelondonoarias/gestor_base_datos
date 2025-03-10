package Modelo;

import Modelo.Sala_reuniones.tiempoReserva;

public class SalaBanquetes {

	
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
	
	
	public SalaBanquetes(int numSala, Modelo.SalaBanquetes.tiempoReserva tiempoReserva) {
		super();
		this.numSala = numSala;
		this.tiempoReserva = tiempoReserva;
	}
	
	public SalaBanquetes() {
		super();
		this.numSala = 0;
		this.tiempoReserva = tiempoReserva;
	}
	
	
}
