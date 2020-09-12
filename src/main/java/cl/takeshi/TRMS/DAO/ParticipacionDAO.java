package cl.takeshi.TRMS.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class ParticipacionDAO {

	private String SQL ="select * from participacion";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
//***METODOS
	
//***ROWMAPPER
	
}
