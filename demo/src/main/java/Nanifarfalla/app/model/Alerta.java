package Nanifarfalla.app.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alertas")
public class Alerta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_alerta;
	private String mensaje_alerta;
	private String categoria;
	private Double precio;

	private Date version;
	@JoinColumn(name = "fkcodigo_tipoalerta", referencedColumnName = "codigo_tipoalerta")
	@ManyToOne
	TipoAlerta mTipoAlerta;

	@OneToMany(mappedBy = "mAlerta")
	private Collection<UserAlerta> useralertas = new ArrayList<>();

	// private int fkcodigo_tipoalerta;
	public Alerta() {

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCodigo_alerta() {
		return codigo_alerta;
	}

	public void setCodigo_alerta(int codigo_alerta) {
		this.codigo_alerta = codigo_alerta;
	}

	public String getMensaje_alerta() {
		return mensaje_alerta;
	}

	public void setMensaje_alerta(String mensaje_alerta) {
		this.mensaje_alerta = mensaje_alerta;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
