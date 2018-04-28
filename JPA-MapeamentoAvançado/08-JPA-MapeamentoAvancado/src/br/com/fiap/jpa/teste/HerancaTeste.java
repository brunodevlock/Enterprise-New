package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.PessoaDAO;
import br.com.fiap.jpa.dao.impl.PessoaDAOImpl;
import br.com.fiap.jpa.entity.Pessoa;
import br.com.fiap.jpa.entity.PessoaFisica;
import br.com.fiap.jpa.entity.PessoaJuridica;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class HerancaTeste {
	
	public static void main(String[] args) {
		
		//Cadastrar uma pessoa, pf e pj
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		Pessoa pessoa = new Pessoa("Thiago", "S�o Paulo");
		
		PessoaFisica pf = new PessoaFisica("Lucas", "Rio", "123.465.5646-98", new GregorianCalendar(
				2014, Calendar.MAY, 5));
				
		PessoaJuridica pj = new PessoaJuridica("FIAP", "Av.Lins",
				"123.333.234/0001-56", new GregorianCalendar(2011, Calendar.APRIL, 3));
		
		try {
			dao.create(pessoa);
			dao.create(pf);
			dao.create(pj);
			dao.commit();
			
		}catch (CommitException e) {
			e.printStackTrace();
		}
		
				
		
		em.close();
		fabrica.close();
		
	}

}
