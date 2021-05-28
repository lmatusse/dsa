package mz.co.dsav1.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
public class CasoDeUso 
{	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
@Column(nullable = false, unique = true, length = 60)
	private String nome;
	private String prioridade;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_funcionalidade")
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Funcionalidade funcionalidade;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_modulo")
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Modulo modulo;
	
	public CasoDeUso(String nome, String prioridade, Funcionalidade funcionalidade, Modulo modulo) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
		this.funcionalidade = funcionalidade;
		this.modulo = modulo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public Funcionalidade getRequisitoFuncional() {
		return funcionalidade;
	}
	public void setRequisitoFuncional(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}
	public Modulo getModulo() {
		return modulo;
	}
	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}
	
}
