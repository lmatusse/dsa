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
public class Sector {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, nullable = false , length = 60)
	private String nome;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_departamento")
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Departamento departamento;
	public Sector(String nome, Departamento departamento) {
		super();
		this.nome = nome;
		this.departamento = departamento;
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
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
