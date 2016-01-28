package br.com.filme.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Filme{ 
	
	@Id @GeneratedValue
	private Long id;
	
	private String titulo;
	private String sinopse;
	private String diretor;
	private String dtLancamento;
	private String elenco;
	private String genero;
	private String local;
	
	public Filme() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(String dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", sinopse=" + sinopse + ", diretor=" + diretor
				+ ", dtLancamento=" + dtLancamento + ", elenco=" + elenco + ", genero=" + genero + ", local=" + local
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diretor == null) ? 0 : diretor.hashCode());
		result = prime * result + ((dtLancamento == null) ? 0 : dtLancamento.hashCode());
		result = prime * result + ((elenco == null) ? 0 : elenco.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((sinopse == null) ? 0 : sinopse.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Filme other = (Filme) obj;
		if (diretor == null) {
			if (other.diretor != null)
				return false;
		} else if (!diretor.equals(other.diretor))
			return false;
		if (dtLancamento == null) {
			if (other.dtLancamento != null)
				return false;
		} else if (!dtLancamento.equals(other.dtLancamento))
			return false;
		if (elenco == null) {
			if (other.elenco != null)
				return false;
		} else if (!elenco.equals(other.elenco))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (sinopse == null) {
			if (other.sinopse != null)
				return false;
		} else if (!sinopse.equals(other.sinopse))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	
	
	
}
