package Modelo;

public class sala_reuniones {
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
	
	public sala_reuniones(int numSala, Modelo.sala_reuniones.tiempoReserva tiempoReserva) {
		super();
		this.numSala = numSala;
		this.tiempoReserva = tiempoReserva;
	}
	
	public sala_reuniones() {
		super();
		this.numSala = 0;
		this.tiempoReserva = tiempoReserva.SINRESERVA;
	}
	 
	 
}
