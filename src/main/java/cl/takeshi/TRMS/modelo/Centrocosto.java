package cl.takeshi.TRMS.modelo;

public class Centrocosto {

	private int idcentrocosto;
	private String descripcion;
	private int activo;
	
	public Centrocosto() {
		super();
	}

	public int getIdcentrocosto() {
		return idcentrocosto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getActivo() {
		return activo;
	}

	public void setIdcentrocosto(int idcentrocosto) {
		this.idcentrocosto = idcentrocosto;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	
}
