package cl.takeshi.TRMS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.takeshi.TRMS.DAO.CentrocostoDAO;
import cl.takeshi.TRMS.modelo.Centrocosto;

@Controller
public class CentrocostoController {
	
	@Autowired
	CentrocostoDAO ccDAO;
	
	@RequestMapping(value="/centrocostos", method=RequestMethod.GET)
	public @ResponseBody List<Centrocosto> centrocostoReadAll(){
		List<Centrocosto> listaCentrocosto = ccDAO.buscarTodos();
		return listaCentrocosto;
	}
	
}
