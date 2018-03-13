package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PASSAGEIRO")
@SequenceGenerator(name="passageiro", sequenceName="SQ_T_PASSAGEIRO", allocationSize=1)
public class Passageiro {
	
	@Id
	@Column(name="cd_passageiro")
	@GeneratedValue(generator="passageiro",strategy=GenerationType.SEQUENCE)
	private Integer codigopassageiro;
	
	
	@Column(name="nm_passageiro", nullable = false)
	private String nomepassageiro;
	
	@Column(name="dt_nascimento", nullable = false)
	private Calendar datanascimento;
	
	@Column(name="ds_genero")
	private boolean genero;

	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passageiro(Integer codigopassageiro, String nomepassageiro, Calendar datanascimento, boolean genero) {
		super();
		this.codigopassageiro = codigopassageiro;
		this.nomepassageiro = nomepassageiro;
		this.datanascimento = datanascimento;
		this.genero = genero;
	}

	public Integer getCodigopassageiro() {
		return codigopassageiro;
	}

	public void setCodigopassageiro(Integer codigopassageiro) {
		this.codigopassageiro = codigopassageiro;
	}

	public String getNomepassageiro() {
		return nomepassageiro;
	}

	public void setNomepassageiro(String nomepassageiro) {
		this.nomepassageiro = nomepassageiro;
	}

	public Calendar getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Calendar datanascimento) {
		this.datanascimento = datanascimento;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	
	
	
	
}
