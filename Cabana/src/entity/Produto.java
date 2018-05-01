package entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"Produto\"")
@XmlRootElement
public class Produto implements Serializable{

	private static final long serialVersionUID = 1;
	
	@Id
	@Column(name = "id", nullable=false, insertable=true, updatable=true)
	private String id = UUID.randomUUID().toString().toUpperCase();
	
	@Column(name = "descricao", nullable=true, unique=false, insertable=true, updatable=true)
	private String descrição;
	
	@Column(name = "valor", nullable=true, unique=false, insertable=true, updatable=true)
	private Double valor;
	
	@Column(name = "qtd", nullable=true, unique=false, insertable=true, updatable=true)
	private Integer qtd;

	public String getId() {
		return this.id;
	}

	public Produto setId(String id) {
		this.id = id;
		return this; 
	}

	public String getDescrição() {
		return this.descrição;
	}

	public Produto setDescrição(String descrição) {
		this.descrição = descrição;
		return this;
	}

	public Double getValor() {
		return this.valor;
	}

	public Produto setValor(Double valor) {
		this.valor = valor;
		return this;
	}

	public Integer getQtd() {
		return this.qtd;
	}

	public Produto setQtd(Integer qtd) {
		this.qtd = qtd;
		return this;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrição == null) ? 0 : descrição.hashCode());
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
		Produto other = (Produto) obj;
		if (descrição == null) {
			if (other.descrição != null)
				return false;
		} else if (!descrição.equals(other.descrição))
			return false;
		return true;
	}
	
}
