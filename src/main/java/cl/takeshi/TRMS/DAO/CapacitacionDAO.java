package cl.takeshi.TRMS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.takeshi.TRMS.modelo.Capacitacion;

public class CapacitacionDAO {

	private String SQL ="select * from capacitacion";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
//***METODOS	
	public List<Capacitacion> buscarTodos(){
		return template.query(SQL, new CapacitacionMapper());
	}
	
		
// ROWMAPPER
	public class CapacitacionMapper implements RowMapper<Capacitacion>{
		public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException{
			Capacitacion capacitacion = new Capacitacion();
			capacitacion.setIdCapacitacion(rs.getInt("idcapacitacion"));
			capacitacion.setTitulo(rs.getString("titulo"));
			capacitacion.setTematica(rs.getString("tematica"));
			//capacitacion.setFechainicio(fechainicio);
			//capacitacion.setFechatermino(fechatermino) ;
			//capacitacion.setHoras(rs.getDouble("horas")); ;
			capacitacion.setAñopresupuesto(rs.getString("añopresupuesto")); ;
			capacitacion.setStatus(rs.getString("status")); ;
			capacitacion.setModalidad(rs.getString("modalidad")); ;
			capacitacion.setProveedor(rs.getString("proveedor"));
			capacitacion.setInstructor(rs.getString("instructor"));
			capacitacion.setComentarios(rs.getString("comentarios"));
			//capacitacion.setCreate_time(create_time);
			//capacitacion.setUpdate_time(update_time);;
			return capacitacion;
		}
	}

}
