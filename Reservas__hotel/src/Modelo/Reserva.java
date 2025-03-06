package Modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Reserva {

	private int idReserva;
	private boolean salaReuniones;
	private int personasReservas;
	private boolean salaBanquetes;
	private boolean boda;
	private boolean terraza;
	private ArrayList <Habitacion> habitacion = new ArrayList<>();
	private ArrayList <Inquilino> inquilino = new ArrayList<>();
	

	
	public int getIdReserva() {
		return idReserva;
	}



	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}



	public boolean isSalaReuniones() {
		return salaReuniones;
	}



	public void setSalaReuniones(boolean salaReuniones) {
		this.salaReuniones = salaReuniones;
	}



	public int getPersonasReservas() {
		return personasReservas;
	}



	public void setPersonasReservas(int personasReservas) {
		this.personasReservas = personasReservas;
	}



	public boolean isSalaBanquetes() {
		return salaBanquetes;
	}



	public void setSalaBanquetes(boolean salaBanquetes) {
		this.salaBanquetes = salaBanquetes;
	}



	public boolean isBoda() {
		return boda;
	}



	public void setBoda(boolean boda) {
		this.boda = boda;
	}



	public boolean isTerraza() {
		return terraza;
	}



	public void setTerraza(boolean terraza) {
		this.terraza = terraza;
	}



	public ArrayList<Habitacion> getHabitacion() {
		return habitacion;
	}



	public void setHabitacion(ArrayList<Habitacion> habitacion) {
		this.habitacion = habitacion;
	}



	public ArrayList<Inquilino> getInquilino() {
		return inquilino;
	}



	public void setInquilino(ArrayList<Inquilino> inquilino) {
		this.inquilino = inquilino;
	}

	

	public Reserva(int idReserva, boolean salaReuniones, int personasReservas, boolean salaBanquetes, boolean boda,
			boolean terraza, ArrayList<Habitacion> habitacion, ArrayList<Inquilino> inquilino) {
		super();
		this.idReserva = idReserva;
		this.salaReuniones = salaReuniones;
		this.personasReservas = personasReservas;
		this.salaBanquetes = salaBanquetes;
		this.boda = boda;
		this.terraza = terraza;
		this.habitacion = habitacion;
		this.inquilino = inquilino;
	}



	public Reserva() {
		super();
		this.idReserva = 000;
		this.salaReuniones = false;
		this.personasReservas = 1;
		this.salaBanquetes = false;
		this.boda = false;
		this.terraza = false;
		this.habitacion = new ArrayList<Habitacion>();
		this.inquilino = new ArrayList<Inquilino>();
	}
	
}
