package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PEDIDO")
@SequenceGenerator(name="Pedido", sequenceName = "SQ_T_PEDIDO", allocationSize=1)
public class Pedido {
	
	
	@Id
	@Column(name="cd_codigo", nullable=false)
	@GeneratedValue(generator="Pedido", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_descricao", nullable=false)
	private String descricao;
	
	@Column(name="ds_status")
	@Enumerated(EnumType.STRING)
	private StatusPedido status;

	
	//Se for mapear dos dois lados precisa do mappedBy ou seja indicar q ja foi mapeado !
	@OneToOne(mappedBy= "pedido")
	
	private NotaFiscal nota;
	
		
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	

	public Pedido(String descricao, StatusPedido status) {
		super();
		
		this.descricao = descricao;
		this.status = status;
	}






	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}


	
	
	

}
