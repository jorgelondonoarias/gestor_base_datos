package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Inquilino;
import Modelo.Reserva;
import Modelo.SalaBanquetes;
import Modelo.Sala_reuniones;
import Modelo.Terraza;

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
		Inquilino i = new Inquilino();
		Habitacion h = new Habitacion();
		SalaBanquetes sb= new SalaBanquetes();
		Sala_reuniones sr = new Sala_reuniones();
		Terraza t = new Terraza();
		ArrayList<Reserva> nuevaReserva = new ArrayList<>();
		
		i.setNombre(pideDato("Diem el nombre: "));
		i.setApellido1(pideDato("Dime el primer apellido: "));
		i.setApellido2(pideDato("Dide el segundo apellido: "));
		i.setCorreo(pideDato("DEime el correo: "));
		i.setDireccion(pideDato("Dime la dirreccion: "));
		
		
		
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
