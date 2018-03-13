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
@Table(name="T_CORRIDA")
@SequenceGenerator(name = "corrida", sequenceName="SQ_T_CORRIDA", allocationSize=1)
public class Corrida {
	
	
	@Id
	@Column(name="cd_passageiro")
	@GeneratedValue(generator="corrida",strategy=GenerationType.SEQUENCE)
	private Integer codigocorrida;
	
	@Column(name="ds_origem", nullable=false)
	private String origem;
	
	@Column(name="destino", nullable=false)
	private String destino;
	
	@Column(name="dt_corrida")
	private Calendar datacorida;
	
	@Column(name="vl_corrida")
	private float datacorrida;

	public Corrida() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Corrida(Integer codigocorrida, String origem, String destino, Calendar datacorida, float datacorrida) {
		super();
		this.codigocorrida = codigocorrida;
		this.origem = origem;
		this.destino = destino;
		this.datacorida = datacorida;
		this.datacorrida = datacorrida;
	}

	public Integer getCodigocorrida() {
		return codigocorrida;
	}

	public void setCodigocorrida(Integer codigocorrida) {
		this.codigocorrida = codigocorrida;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDatacorida() {
		return datacorida;
	}

	public void setDatacorida(Calendar datacorida) {
		this.datacorida = datacorida;
	}

	public float getDatacorrida() {
		return datacorrida;
	}

	public void setDatacorrida(float datacorrida) {
		this.datacorrida = datacorrida;
	}
	
	
	
	

}
