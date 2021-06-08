package mz.co.dsav1.model;

import java.util.Collection;

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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Cliente 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 60)
	private String nomeCompleto;
	@Column(nullable = false, length = 13)
	private String contacto;
	@Column(length = 60)
	private String email;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_projecto")
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Projecto projecto;
	
	public Cliente(String nomeCompleto, String contacto, String email, Projecto projecto) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.contacto = contacto;
		this.email = email;
		this.projecto = projecto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nomeCompleto;
	}
	public void setNome(String nome) {
		this.nomeCompleto = nome;
	}
	
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomeCompleto=" + nomeCompleto + ", contacto=" + contacto + ", email=" + email
				+ ", projecto=" + projecto + "]";
	}
	
	
	
	
	

}
