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

	public String pideCadena(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(texto);
		return teclado.nextLine();
	}
	public int pideEntero(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(texto);
		return teclado.nextInt();
	}
	public void menu() {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Pixel Resort");
			System.out.println("1. Reservas);
			System.out.println("2. Consultar reservas");
			System.out.println("3. Modificar reservas");
			System.out.println("4. Eliminar reservas");
			System.out.println("0. Bloquear");
			opcion = teclado.nextInt();

			switch(opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					System.out.println("Nos vemos pronto");
					break;
				default:
				System.out.println("Opcion invalida, prueba con otra");	
					break;
			}
			
		} while (opcion <5 || >=0);
	}
	public void registro(){
		Reserva r = new Reserva();
		Inquilino i = new Inquilino();
		Habitacion h = new Habitacion();
		SalaBanquetes sb= new SalaBanquetes();
		Sala_reuniones sr = new Sala_reuniones();
		Terraza t = new Terraza();
		ArrayList<Reserva> nuevaReserva = new ArrayList<>();
		
		i.setNombre(pideCadena("Nombre: "));
		i.setApellido1(pideCadena("Primer apellido: "));
		i.setApellido2(pideCadena("Segundo apellido: "));
		i.setCorreo(pideCadena("Correo electronico: "));
		i.setDireccion(pideCadena("Direccion: "));
		
		
		
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
