package cl.takeshi.TRMS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.takeshi.TRMS.DAO.CapacitacionDAO;
import cl.takeshi.TRMS.modelo.Capacitacion;


@Controller
public class CapacitacionController {

	@Autowired
	CapacitacionDAO capDAO;
	
	@RequestMapping(value="/capacitaciones", method = RequestMethod.GET)
	public @ResponseBody List<Capacitacion> capacitacionesReadAll(){
		List<Capacitacion> listaCapacitaciones = capDAO.buscarTodos();
		return listaCapacitaciones;
	}
	
	
}
