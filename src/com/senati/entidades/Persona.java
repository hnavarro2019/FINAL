package com.senati.entidades;

public class Persona {
	protected String Cedula;
	private String Nombre;
	private String Apellido;
	private String sexo;
	private int edad;
	public Persona() {
		super();
	}
	public Persona(String cedula, String nombre, String apellido, String sexo, int edad) {
		super();
		Cedula = cedula;
		Nombre = nombre;
		Apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return Cedula + "\t\t" + Nombre + "\t\t\t" + Apellido + "\t\t\t" + sexo
				+ "\t\t" + edad;
	}
	
	
	

}
