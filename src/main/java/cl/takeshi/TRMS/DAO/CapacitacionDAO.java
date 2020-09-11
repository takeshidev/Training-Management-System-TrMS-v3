package cl.takeshi.TRMS.DAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CapacitacionDAO {

	private String SQL ="select * from capacitaciones";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
}
