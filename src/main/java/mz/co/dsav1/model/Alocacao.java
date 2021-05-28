package mz.co.dsav1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "alocacao")
public class Alocacao 
{
	@EmbeddedId
	private ClienteProjetoPK chaveComposta;
	@Column(nullable = false)
	@Temporal (TemporalType.DATE)
	private Date data;
}
