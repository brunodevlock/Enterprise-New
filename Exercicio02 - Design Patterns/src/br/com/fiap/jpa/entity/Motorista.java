package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {
	
	@Id
	@Column(name="nr_carteira", nullable = false, length=20)
	private Integer carteira;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="datanascimento", nullable = false)
	private Calendar datanascimento;
	
	@Column(name="fl_carteira")
	@Lob
	private byte[] fotocarteira;
	
	@Column(name="ds_genero")
	private boolean genero;

	public Motorista() {
		super();
		
	}

	public Motorista(Integer carteira, String nome, Calendar datanascimento, byte[] fotocarteira, boolean genero) {
		super();
		this.carteira = carteira;
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.fotocarteira = fotocarteira;
		this.genero = genero;
	}

	public Integer getCarteira() {
		return carteira;
	}

	public void setCarteira(Integer carteira) {
		this.carteira = carteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Calendar datanascimento) {
		this.datanascimento = datanascimento;
	}

	public byte[] getFotocarteira() {
		return fotocarteira;
	}

	public void setFotocarteira(byte[] fotocarteira) {
		this.fotocarteira = fotocarteira;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	
	
	
}
