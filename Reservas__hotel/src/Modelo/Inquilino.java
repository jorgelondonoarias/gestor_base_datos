package Modelo;

public class Inquilino {
	private int dni;
	private String letraDni;
	private int edad;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private int codPostal;
	private String ciudad;
	private String correo;	
	private int numTelefono;
	private boolean alergias;
	private boolean discapacidad;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getLetraDni() {
		return letraDni;
	}
	public void setLetraDni(String letraDni) {
		this.letraDni = letraDni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}
	public boolean isAlergias() {
		return alergias;
	}
	public void setAlergias(boolean alergias) {
		this.alergias = alergias;
	}
	public boolean isDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(boolean discapacidad) {
		this.discapacidad = discapacidad;
	}
	
	public Inquilino(int dni, String letraDni, int edad, String nombre, String apellido1, String apellido2,
			String direccion, int codPostal, String ciudad, String correo, int numTelefono, boolean alergias,
			boolean discapacidad) {
		super();
		this.dni = dni;
		this.letraDni = letraDni;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.correo = correo;
		this.numTelefono = numTelefono;
		this.alergias = alergias;
		this.discapacidad = discapacidad;
	}
	
	public Inquilino() {
		super();
		this.dni = 00000000;
		this.letraDni = null;
		this.edad = 0;
		this.nombre = null;
		this.apellido1 = null;
		this.apellido2 = null;
		this.direccion = null;
		this.codPostal = 00000;
		this.ciudad = null;
		this.correo = null;
		this.numTelefono = 000000000;
		this.alergias = false;
		this.discapacidad = false;
	}
	
}
