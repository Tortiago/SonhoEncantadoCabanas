package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"Festa\"")
@XmlRootElement
public class Festa implements Serializable{

	private static final long serialVersionUI = 1;
	
	@Id
	@Column(name = "id", nullable=false, insertable=true, updatable=true)
	private String id = UUID.randomUUID().toString().toUpperCase();
	
	@Column(name = "dataMontagem", nullable=true, unique=false, insertable=true, updatable=true)
	private Date dataMontagem;
	
	@Column(name = "dataDesmontagem", nullable=true, unique=false, insertable=true, updatable=true)
	private Date dataDesmontagem;
	
	@Column(name = "horaMontagem", nullable=true, unique=false, insertable=true, updatable=true)
	private Timer horaMontagem;
	
	@Column(name = "horaDesmontagem", nullable=true, unique=false, insertable=true, updatable=true)
	private Timer horaDesmontagem;
	
	@Column(name = "tema", nullable=true, unique=false, insertable=true, updatable=true)
	private String tema;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDataMontagem() {
		return dataMontagem;
	}

	public void setDataMontagem(Date dataMontagem) {
		this.dataMontagem = dataMontagem;
	}

	public Date getDataDesmontagem() {
		return dataDesmontagem;
	}

	public void setDataDesmontagem(Date dataDesmontagem) {
		this.dataDesmontagem = dataDesmontagem;
	}

	public Timer getHoraMontagem() {
		return horaMontagem;
	}

	public void setHoraMontagem(Timer horaMontagem) {
		this.horaMontagem = horaMontagem;
	}

	public Timer getHoraDesmontagem() {
		return horaDesmontagem;
	}

	public void setHoraDesmontagem(Timer horaDesmontagem) {
		this.horaDesmontagem = horaDesmontagem;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDesmontagem == null) ? 0 : dataDesmontagem.hashCode());
		result = prime * result + ((dataMontagem == null) ? 0 : dataMontagem.hashCode());
		result = prime * result + ((horaDesmontagem == null) ? 0 : horaDesmontagem.hashCode());
		result = prime * result + ((horaMontagem == null) ? 0 : horaMontagem.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festa other = (Festa) obj;
		if (dataDesmontagem == null) {
			if (other.dataDesmontagem != null)
				return false;
		} else if (!dataDesmontagem.equals(other.dataDesmontagem))
			return false;
		if (dataMontagem == null) {
			if (other.dataMontagem != null)
				return false;
		} else if (!dataMontagem.equals(other.dataMontagem))
			return false;
		if (horaDesmontagem == null) {
			if (other.horaDesmontagem != null)
				return false;
		} else if (!horaDesmontagem.equals(other.horaDesmontagem))
			return false;
		if (horaMontagem == null) {
			if (other.horaMontagem != null)
				return false;
		} else if (!horaMontagem.equals(other.horaMontagem))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}
	

	
}

