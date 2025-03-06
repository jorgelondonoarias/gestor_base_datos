package Modelo;

import static Modelo.Hotel.tipoHabitacion.INDIVIDUAL;

public class Hotel {

		private int n_piso;
		private int habitaciones;
		private int sala_reuniones;
		private int sala_banquetes;
		private int terraza;
		public int getN_piso() {
			return n_piso;
		}
		public void setN_piso(int n_piso) {
			this.n_piso = n_piso;
		}
		public int getHabitaciones() {
			return habitaciones;
		}
		public void setHabitaciones(int habitaciones) {
			this.habitaciones = habitaciones;
		}
		public int getSala_reuniones() {
			return sala_reuniones;
		}
		public void setSala_reuniones(int sala_reuniones) {
			this.sala_reuniones = sala_reuniones;
		}
		public int getSala_banquetes() {
			return sala_banquetes;
		}
		public void setSala_banquetes(int sala_banquetes) {
			this.sala_banquetes = sala_banquetes;
		}
		public int getTerraza() {
			return terraza;
		}
		public void setTerraza(int terraza) {
			this.terraza = terraza;
		}
		
		public Hotel(int n_piso, int habitaciones, int sala_reuniones, int sala_banquetes, int terraza) {
			super();
			this.n_piso = n_piso;
			this.habitaciones = habitaciones;
			this.sala_reuniones = sala_reuniones;
			this.sala_banquetes = sala_banquetes;
			this.terraza = terraza;
		}		

		
		
}
