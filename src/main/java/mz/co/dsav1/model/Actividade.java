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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
public class Actividade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, nullable = false, length = 60)
	private String nome;
	private String estado;
	@Column(nullable = false)
	@Temporal (TemporalType.DATE)
	private Date dataEntrega;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="tarefa", joinColumns = {@JoinColumn(name="id_actividade")}, inverseJoinColumns = {@JoinColumn(name="id_funcionario")})
	private Collection<Funcionario> funcionario;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_modulo")
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Modulo modulo;
	public Actividade(String nome, String estado, Collection<Funcionario> funcionario) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.funcionario = funcionario;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Collection<Funcionario> getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Collection<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	

}
