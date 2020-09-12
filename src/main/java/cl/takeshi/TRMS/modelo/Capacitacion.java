package cl.takeshi.TRMS.modelo;

import java.util.Calendar;

public class Capacitacion {
	
	private int idCapacitacion;
	private String titulo;
	private String tematica;
	private Calendar fechainicio;
	private Calendar fechatermino;
	private double horas;
	private String añopresupuesto;
	private String status;
	private String modalidad;
	private String proveedor;
	private String instructor;
	private String comentarios;
	private Calendar create_time;
	private Calendar update_time;
	
	/** Constructor vacio
	 * 
	 */
	public Capacitacion() {
		super();
	}
	
	/** Constructor completo
	 * @param idCapacitacion
	 * @param titulo
	 * @param tematica
	 * @param fechainicio
	 * @param fechatermino
	 * @param horas
	 * @param añopresupuesto
	 * @param status
	 * @param modalidad
	 * @param proveedor
	 * @param instructor
	 * @param comentarios
	 * @param create_time
	 * @param update_time
	 */
	public Capacitacion(int idCapacitacion, String titulo, String tematica, Calendar fechainicio, Calendar fechatermino,
			double horas, String añopresupuesto, String status, String modalidad, String proveedor, String instructor,
			String comentarios, Calendar create_time, Calendar update_time) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.titulo = titulo;
		this.tematica = tematica;
		this.fechainicio = fechainicio;
		this.fechatermino = fechatermino;
		this.horas = horas;
		this.añopresupuesto = añopresupuesto;
		this.status = status;
		this.modalidad = modalidad;
		this.proveedor = proveedor;
		this.instructor = instructor;
		this.comentarios = comentarios;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTematica() {
		return tematica;
	}

	public Calendar getFechainicio() {
		return fechainicio;
	}

	public Calendar getFechatermino() {
		return fechatermino;
	}

	public double getHoras() {
		return horas;
	}

	public String getAñopresupuesto() {
		return añopresupuesto;
	}

	public String getStatus() {
		return status;
	}

	public String getModalidad() {
		return modalidad;
	}

	public String getProveedor() {
		return proveedor;
	}

	public String getInstructor() {
		return instructor;
	}

	public String getComentarios() {
		return comentarios;
	}

	public Calendar getCreate_time() {
		return create_time;
	}

	public Calendar getUpdate_time() {
		return update_time;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public void setFechainicio(Calendar fechainicio) {
		this.fechainicio = fechainicio;
	}

	public void setFechatermino(Calendar fechatermino) {
		this.fechatermino = fechatermino;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public void setAñopresupuesto(String añopresupuesto) {
		this.añopresupuesto = añopresupuesto;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public void setCreate_time(Calendar create_time) {
		this.create_time = create_time;
	}

	public void setUpdate_time(Calendar update_time) {
		this.update_time = update_time;
	}
	
	
}
