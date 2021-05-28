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

@Entity
public class Cliente 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 60)
	private String nome;
	@Column(nullable = false, length = 40)
	private String apelido;
	@Column(nullable = false, length = 13)
	private String contacto;
	@Column(nullable = false, length = 60)
	private String cidade;
	@Column(length = 60)
	private String bairo;
	
	private int num_casa;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "alocacao", joinColumns=@JoinColumn(name="id_cliente"),inverseJoinColumns = @JoinColumn(name="id_projeto")
	
			)
	private Collection<Projecto> projetos;
	public Cliente(String nome, String apelido, String contacto, String cidade, String bairo, int num_casa) {
		this.nome = nome;
		this.apelido = apelido;
		this.contacto = contacto;
		this.cidade = cidade;
		this.bairo = bairo;
		this.num_casa = num_casa;
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
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairo() {
		return bairo;
	}
	public void setBairo(String bairo) {
		this.bairo = bairo;
	}
	public int getNum_casa() {
		return num_casa;
	}
	public void setNum_casa(int num_casa) {
		this.num_casa = num_casa;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", contacto=" + contacto + ", cidade="
				+ cidade + ", bairo=" + bairo + ", num_casa=" + num_casa + "]";
	}
	
	

}
