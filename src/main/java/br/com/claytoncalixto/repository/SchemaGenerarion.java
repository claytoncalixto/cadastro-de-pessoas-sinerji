package br.com.claytoncalixto.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.claytoncalixto.model.Pessoa;

public class SchemaGenerarion {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
		
		EntityManager em = emf.createEntityManager();
		
		List<Pessoa> lista = em.createQuery("FROM Pessoa", Pessoa.class).getResultList();
		
		System.out.println(lista);
		
		em.close();
		emf.close();
	}

}
