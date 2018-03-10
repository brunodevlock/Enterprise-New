package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	//1- Construtor privado
	private EntityManagerFactorySingleton() {}
	
	//2- Atributo privado estatico unico 
	private static EntityManagerFactory fabrica;
	
	//3- Método publico estatico
	public static EntityManagerFactory getInstance() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
	

}
