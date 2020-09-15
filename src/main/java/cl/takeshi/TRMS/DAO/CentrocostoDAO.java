package cl.takeshi.TRMS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.takeshi.TRMS.modelo.Centrocosto;

public class CentrocostoDAO {
	
	private String SQL_TODO ="select * from centrocosto";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	// METODOS
	public List<Centrocosto> buscarTodos(){
		return template.query(SQL_TODO, new CentrocostoMapper());
	}
	
	// ROWMAPPER
	public class CentrocostoMapper implements RowMapper<Centrocosto>{
		public Centrocosto mapRow(ResultSet rs, int rowNum) throws SQLException{
			Centrocosto centrocosto = new Centrocosto();
			
			centrocosto.setIdcentrocosto(rs.getInt("idcentrocosto"));
			centrocosto.setDescripcion(rs.getString("descripcion"));
			centrocosto.setActivo(rs.getInt("activo"));
			
			return centrocosto;
		}
	}
}
