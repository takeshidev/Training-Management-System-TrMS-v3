package cl.takeshi.TRMS.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonaDAO {
private String SQL ="select * from persona";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
//***METODOS
	
//***ROWMAPPER
	
	
	
	
}
