package Modelo;

public class Terraza {
	private int n_terraza;
	enum tiempoReserva{
		MANANA,TARDE,DIAENTERO,SINRESERVA
	}
	private tiempoReserva tiempoReserva;
	public int getN_terraza() {
		return n_terraza;
	}
	public void setN_terraza(int n_terraza) {
		this.n_terraza = n_terraza;
	}
	public tiempoReserva getTiempoReserva() {
		return tiempoReserva;
	}
	public void setTiempoReserva(tiempoReserva tiempoReserva) {
		this.tiempoReserva = tiempoReserva;
	}
	
	public Terraza(int n_terraza, Modelo.Terraza.tiempoReserva tiempoReserva) {
		super();
		this.n_terraza = n_terraza;
		this.tiempoReserva = tiempoReserva;
	}
	
	public Terraza() {
		super();
		this.n_terraza = 0;
		this.tiempoReserva = tiempoReserva.SINRESERVA;
	}
	
	
}
