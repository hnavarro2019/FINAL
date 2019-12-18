package com.senati.vistas;

import com.senati.controlador.*;
import com.senati.entidades.*;
import java.util.Scanner;

public class AppPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer =new Scanner (System.in);
		ListaArrays ListaPersona = new ListaArrays();
		Persona Op;
		int pos;
		String ced,nom,ape;
		String sexo;
		int edad;
		int op;
		
		do {
			System.out.println("\n Menu");
			System.out.print("\n 1. Ingresar datos");
			System.out.print("\n 2. Modificar datos");
			System.out.print("\n 3. Eliminar datos");
			System.out.print("\n 4. Buscar datos");
			System.out.print("\n 5. Imprimir Lista");
			System.out.print("\n 6. Salida");
			System.out.print("\n Escoja una opcion: ");
			op =leer.nextInt();
			
			switch(op) {
			case 1:
				Op = new Persona();
				System.out.println("Ingrese la Cedula :");
				ced = leer.next();
				System.out.println("Ingrese el nombre :");
				nom = leer.next();
				
				System.out.println("Ingrese el apellido :");
				ape = leer.next();
				
				System.out.println("Ingrese el sexo :");
				sexo = leer.next();
				
				System.out.println("Ingrese el edad :");
				edad = leer.nextInt();
				
				//---------------------
				Op.setCedula(ced);
				Op.setNombre(nom);
				Op.setApellido(ape);
				Op.setSexo(sexo);
				Op.setEdad(edad);
				
				ListaPersona.Add(Op);
				break;
			case 2:
				if(ListaPersona.Count()>0) {
					Op = new Persona();
					System.out.println("Posicion a modificar" + " 0 -"+(ListaPersona.Count()-1));
					pos= leer.nextInt();
					System.out.println("Ingrese la cedula ");
					ced = leer.next();
					System.out.println("Ingrese el nombre :");
					nom = leer.next();
					System.out.println("Ingrese el apellido :");
					ape = leer.next();
					
					System.out.println("Ingrese el sexo :");
					sexo = leer.next();
					
					System.out.println("Ingrese el edad :");
					edad = leer.nextInt();
					
					Op.setCedula(ced);
					Op.setNombre(nom);
					Op.setApellido(ape);
					Op.setSexo(sexo);
					Op.setEdad(edad);
					
					ListaPersona.Edit(Op,pos);
				}else {
					System.out.print("Lista vacia");
				}
				break;
			case 3:
				if (ListaPersona.Count()>0) {
					System.out.println("Posicion a eliminar" + "0 -"+(ListaPersona.Count()-1));
					pos=leer.nextInt();
					ListaPersona.Delete(pos);
				}else {
					System.out.print("Lista vacia");
				}
				break;
			case 4:
				if (ListaPersona.Count()>0) {
					System.out.println("Cedula a buscar ");
					ced=leer.next();
					pos =ListaPersona.buscar(ced);
					if (pos >=0);
						System.out.println("Autor encontrado en la posicion " + pos);
						System.out.println(ListaPersona.get_autor(pos).toString());
					}else {
					System.out.print("Lista vacia");
				}
				break;
			case 5:
				System.out.println("Cedula \t \t Nombre \t \t Apellido \t \t Sexo \t \t Edad ");
				System.out.println("=============================================================================================");
				ListaPersona.ImprimirLista();
				break;
			case 6:
				System.out.println("Gracias por participar");
				break;
			}
		}while(op!=6);
	}

	}
