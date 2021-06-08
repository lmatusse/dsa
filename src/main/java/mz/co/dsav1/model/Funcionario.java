package mz.co.dsav1.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
@Entity
public class Funcionario {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(nullable = false, length = 60)
		private String nomeCompleto;
		@Column(nullable = false, length = 13)
		private String contacto;
		@Column(nullable = false, length = 60)
		@ManyToMany(fetch=FetchType.LAZY)
		@JoinTable(name = "tarefa", joinColumns=@JoinColumn(name="id_funcionario"),inverseJoinColumns = @JoinColumn(name="id_actividade"))
		private Collection<Actividade> actividade;
		
		public Funcionario(String nomeCompleto, String contacto, Collection<Actividade> actividade) {
			super();
			this.nomeCompleto = nomeCompleto;
			this.contacto = contacto;
			this.actividade = actividade;
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
			return "Funcionario [id=" + id + ", nomeCompleto=" + nomeCompleto + ", contacto=" + contacto
					+ ", actividade=" + actividade + "]";
		}
		
		
		
		

	}


