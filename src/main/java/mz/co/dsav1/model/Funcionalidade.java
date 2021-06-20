package mz.co.dsav1.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
public class Funcionalidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	@Column(unique = true, nullable = false , length = 60)
private String nome;
	@Column(nullable = false)
private Date data_recolha;
	@Column()
private String prioridade;
private String dependencia;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="id_modulo")
@Fetch(FetchMode.JOIN)
@Cascade(CascadeType.SAVE_UPDATE)
private Modulo modulo;
/*
@OneToMany(mappedBy = "funcionalidade", fetch = FetchType.LAZY)
@Cascade(CascadeType.ALL)
private Collection<CasoDeUso> casoDeUsos;
*/
public Funcionalidade(String nome, Date data_recolha, String prioridade, String dependencia, Modulo modulo) {
	super();
	this.nome = nome;
	this.data_recolha = data_recolha;
	this.prioridade = prioridade;
	this.dependencia = dependencia;
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
public Date getData_recolha() {
	return data_recolha;
}
public void setData_recolha(Date data_recolha) {
	this.data_recolha = data_recolha;
}
public String getPrioridade() {
	return prioridade;
}
public void setPrioridade(String prioridade) {
	this.prioridade = prioridade;
}
public String getDependencia() {
	return dependencia;
}
public void setDependencia(String dependencia) {
	this.dependencia = dependencia;
}
public Modulo getModulo() {
	return modulo;
}
public void setModulo(Modulo modulo) {
	this.modulo = modulo;
}

}
