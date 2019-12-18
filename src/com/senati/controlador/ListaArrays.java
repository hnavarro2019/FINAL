package com.senati.controlador;

import com.senati.entidades.Persona;

public class ListaArrays {
	private Persona[] lista;
	private final int MAX =100;
	private int N;
	
	public ListaArrays() {
		lista = new Persona [MAX];
		N = 0;
	}

	public void Add(Persona p) {
		lista [N] = p;
		N =N+1;
	}
	
	public void Edit(Persona p, int pos) {
		lista [pos] = p;
		
	}
	
	public void Delete (int pos) {
	for (int i=pos; i<N-1; i++) {
			lista [i] = lista [i+1];
		
		}
		N= N-1;
	}
	
	public int buscar(String ced) {
		int pos=-1;
		for (int i=0;i<N; i++) {
			if (lista[i].getCedula().contentEquals(ced)) {
				pos =i;
			}
		}
		return pos;
	}
	
	public void ImprimirLista() {
		for (int i=0; i<N;i++) {
			System.out.println(lista[i].toString());
		}
	}
	
	public Persona get_autor (int pos) {
		if (pos>=0 && pos<N) {
			return lista[pos];
		}else {
			return null;
		}
	}
	
	public int Count() {
		return N;
    }
}
