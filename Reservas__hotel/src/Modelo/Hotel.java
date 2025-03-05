package Modelo;

public class Hotel {

		private boolean reserva;
		private int n_camas;
		private boolean minibar;
		private int n_piso;
		private boolean desayuno;
		private int dias;
		private boolean suit;
		private boolean sala_reuniones;
		private boolean sala_banquetes;
		private int n_habitacion;
		private enum tipoHabitacion { INDIVIDUAL , MATRIMONIO , FAMILIA , DOBLE , SUIT}
		
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
		public boolean isSuit() {
			return suit;
		}
		public void setSuit(boolean suit) {
			this.suit = suit;
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
		};
		
}
