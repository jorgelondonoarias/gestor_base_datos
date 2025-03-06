package Vista;

import java.util.ArrayList;
import java.util.Scanner;
import Modelo.Hotel;
import Modelo.Reserva;

public class Consola {

	public String pideDato(String texto) {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	public int pideEntero(String texto) {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	public void menu() {
		
	}
	public void registro(){
		Reserva r = new Reserva();
		ArrayList<Reserva> nuevaReserva = new ArrayList<>();
		 
		
	}
	public void guardar_BBDD() {
		
	}
	public void eliminarReserva() {
		
	}
	public void modificarReserva() {
		
	}
	public void consultarReserva() {
		
	}
}
