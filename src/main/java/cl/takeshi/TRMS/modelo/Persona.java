package cl.takeshi.TRMS.modelo;

import java.util.Calendar;

public class Persona {

	private int idusuario;
	private String mail;
	private String password;
	private String rol;
	private String status;
	private String nombres;
	private String apellidos;
	private String equipos;
	private String subequipo;
	private String vinculacion;
	private Calendar create_time;
	private Calendar update_time;
	
	/**
	 *  Constructor Vacio
	 */
	public Persona() {
		super();
	}

	/** Constructor completo
	 * @param idusuario
	 * @param mail
	 * @param password
	 * @param rol
	 * @param status
	 * @param nombres
	 * @param apellidos
	 * @param equipos
	 * @param subequipo
	 * @param vinculacion
	 * @param create_time
	 * @param update_time
	 */
	public Persona(int idusuario, String mail, String password, String rol, String status, String nombres,
			String apellidos, String equipos, String subequipo, String vinculacion, Calendar create_time,
			Calendar update_time) {
		super();
		this.idusuario = idusuario;
		this.mail = mail;
		this.password = password;
		this.rol = rol;
		this.status = status;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.equipos = equipos;
		this.subequipo = subequipo;
		this.vinculacion = vinculacion;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public String getMail() {
		return mail;
	}

	public String getPassword() {
		return password;
	}

	public String getRol() {
		return rol;
	}

	public String getStatus() {
		return status;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getEquipos() {
		return equipos;
	}

	public String getSubequipo() {
		return subequipo;
	}

	public String getVinculacion() {
		return vinculacion;
	}

	public Calendar getCreate_time() {
		return create_time;
	}

	public Calendar getUpdate_time() {
		return update_time;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEquipos(String equipos) {
		this.equipos = equipos;
	}

	public void setSubequipo(String subequipo) {
		this.subequipo = subequipo;
	}

	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}

	public void setCreate_time(Calendar create_time) {
		this.create_time = create_time;
	}

	public void setUpdate_time(Calendar update_time) {
		this.update_time = update_time;
	}
	
	
}
