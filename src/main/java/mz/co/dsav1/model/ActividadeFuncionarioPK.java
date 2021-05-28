package mz.co.dsav1.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Embeddable
public class ActividadeFuncionarioPK  implements Serializable {
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="id_actividade")
private Actividade actividade;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="id_funcionario")
private Funcionario funcionario;
public Actividade getActividade() {
	return actividade;
}
public void setActividade(Actividade actividade) {
	this.actividade = actividade;
}
public Funcionario getFuncionario() {
	return funcionario;
}
public void setFuncionario(Funcionario funcionario) {
	this.funcionario = funcionario;
} 

}
