package Modelo;

import Modelo.Hotel.tipoHabitacion;

public class Habitacion {

	private int n_habitacion;
	private boolean miniBar;
	private int n_camas;
	public enum tipoHabitacion { INDIVIDUAL , MATRIMONIO , FAMILIA , DOBLE , SUIT};
	public tipoHabitacion tipoHabitacion;
}
