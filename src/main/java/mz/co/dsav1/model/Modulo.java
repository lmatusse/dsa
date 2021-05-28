package mz.co.dsav1.model;



import java.util.Collection;

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
public class Modulo 
{	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
@Column(nullable = false)
	private String nome;
@Column(nullable = false)
private String descricao;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="id_projeto")
@Fetch(FetchMode.JOIN)
@Cascade(CascadeType.SAVE_UPDATE)
private Projecto projeto;
@OneToMany(mappedBy = "modulo", fetch = FetchType.LAZY)
@Cascade(CascadeType.ALL)
private Collection<Funcionalidade> funcionalidade;
@OneToMany(mappedBy = "modulo", fetch = FetchType.LAZY)
@Cascade(CascadeType.ALL)
private Collection<CasoDeUso> casoDeUsos;
public Modulo(String nome, String descricao, Projecto projeto) {
	super();
	this.nome = nome;
	this.descricao = descricao;
	this.projeto = projeto;
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
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Projecto getProjeto() {
	return projeto;
}
public void setProjeto(Projecto projeto) {
	this.projeto = projeto;
}

	

}
