package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="T_MEDICO")
@SecondaryTable(name="T_MEDICO_FINANCEIRO") //Mapeia a tabela secund�ria do m�dico
public class Medico {

	@Id
	@Column(name="nr_crm")
	private int crm;
	
	@Column(name="nm_medico",length=100)
	private String nome;
	
	@Column(name="vl_salario", table="T_MEDICO_FINANCEIRO")
	private float salario;
	
	@Column(name="nr_conta", table="T_MEDICO_FINANCEIRO")
	private int conta;
	
	
	//Construtores
	public Medico() {
		super();
	}

	
	
	
	public Medico(int crm, String nome, float salario, int conta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.conta = conta;
	}




	//Get Set
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	
	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
