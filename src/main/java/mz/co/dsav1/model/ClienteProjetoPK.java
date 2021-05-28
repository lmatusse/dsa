package mz.co.dsav1.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Embeddable
public class ClienteProjetoPK implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_projeto")
	private Projecto projeto;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	public Projecto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projecto projeto) {
		this.projeto = projeto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
