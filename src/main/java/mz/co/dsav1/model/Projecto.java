package mz.co.dsav1.model;

import java.sql.Date;
import java.time.LocalDate;
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
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Projecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 60)
	private String designacao;
	
	@Column(nullable = false, length = 250)
	private String descricao;
	
	
	@Column(name= "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate data_entrada;
	
	@Column(name = "prazo", nullable = false, columnDefinition = "DATE")
	private Date prazo;
	@OneToMany(mappedBy = "projecto", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Cliente> clientes;
	@OneToMany(mappedBy = "projecto", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Modulo> modulo;

	/*public Projecto(String designacao, String descricao, LocalDate prazo, LocalDate data_entrada) {
		this.designacao = designacao;
		this.descricao = descricao;
		this.prazo = prazo;
		this.data_entrada = data_entrada;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public LocalDate getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(LocalDate data_entrada) {
		this.data_entrada = data_entrada;
	}

}
