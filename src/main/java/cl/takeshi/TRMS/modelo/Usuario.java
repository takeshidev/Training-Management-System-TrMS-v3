package cl.takeshi.TRMS.modelo;

public class Usuario {
	private int id;
	private String nombre;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void accion1() {
		System.out.println("Usuario");
	}
}
