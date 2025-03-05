package Modelo;

import static Modelo.Hotel.tipoHabitacion.INDIVIDUAL;

public class Hotel {

		private boolean reserva;
		private int n_camas;
		private boolean minibar;
		private int n_piso;
		private boolean desayuno;
		private int dias;
		private boolean sala_reuniones;
		private boolean sala_banquetes;
		private int n_habitacion;
		public enum tipoHabitacion { INDIVIDUAL , MATRIMONIO , FAMILIA , DOBLE , SUIT};
		public tipoHabitacion tipoHabitacion;
		public boolean isReserva() {
			return reserva;
		}
		public void setReserva(boolean reserva) {
			this.reserva = reserva;
		}
		public int getN_camas() {
			return n_camas;
		}
		public void setN_camas(int n_camas) {
			this.n_camas = n_camas;
		}
		public boolean isMinibar() {
			return minibar;
		}
		public void setMinibar(boolean minibar) {
			this.minibar = minibar;
		}
		public int getN_piso() {
			return n_piso;
		}
		public void setN_piso(int n_piso) {
			this.n_piso = n_piso;
		}
		public boolean isDesayuno() {
			return desayuno;
		}
		public void setDesayuno(boolean desayuno) {
			this.desayuno = desayuno;
		}
		public int getDias() {
			return dias;
		}
		public void setDias(int dias) {
			this.dias = dias;
		}
		public boolean isSala_reuniones() {
			return sala_reuniones;
		}
		public void setSala_reuniones(boolean sala_reuniones) {
			this.sala_reuniones = sala_reuniones;
		}
		public boolean isSala_banquetes() {
			return sala_banquetes;
		}
		public void setSala_banquetes(boolean sala_banquetes) {
			this.sala_banquetes = sala_banquetes;
		}
		public int getN_habitacion() {
			return n_habitacion;
		}
		public void setN_habitacion(int n_habitacion) {
			this.n_habitacion = n_habitacion;
		}
		public tipoHabitacion getTipoHabitacion() {
			return tipoHabitacion;
		}
		public void setTipoHabitacion(tipoHabitacion tipoHabitacion) {
			this.tipoHabitacion = tipoHabitacion;
		}
		public Hotel(boolean reserva, int n_camas, boolean minibar, int n_piso, boolean desayuno, int dias,
				 boolean sala_reuniones, boolean sala_banquetes, int n_habitacion,
				Modelo.Hotel.tipoHabitacion tipoHabitacion) {
			super();
			this.reserva = reserva;
			this.n_camas = n_camas;
			this.minibar = minibar;
			this.n_piso = n_piso;
			this.desayuno = desayuno;
			this.dias = dias;
			this.sala_reuniones = sala_reuniones;
			this.sala_banquetes = sala_banquetes;
			this.n_habitacion = n_habitacion;
			this.tipoHabitacion = tipoHabitacion;
		}
		public Hotel (){
			this.reserva = true;
			this.n_camas = 1;
			this.minibar = false;
			this.n_piso = 1;
			this.desayuno = false;
			this.dias = 1;
			this.sala_reuniones = false;
			this.sala_banquetes = false;
			this.n_habitacion= 101;
			this.tipoHabitacion=INDIVIDUAL;
	
		}
		
}
