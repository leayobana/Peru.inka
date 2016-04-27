package pe.com.peru.Inka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peru.Inka.service.services.ClienteService;
import pe.com.peru.Inka.service.util.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value = "home/clientes", method = RequestMethod.GET)
	public String dashboardDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listCliente", clienteService.findAllCliente());
		return "home/clientes";
	}

	@RequestMapping(value = "home/frmCliente", method = RequestMethod.GET)
	public String frmCliente(Model model, HttpServletRequest request) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("opc", "new");
		return "home/frmCliente";
	}
	
	@RequestMapping(value = "home/saveCliente", method = RequestMethod.POST)
	public String saveCliente(Model model, HttpServletRequest request,@ModelAttribute("cliente") Cliente cliente) {

		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			clienteService.saveCliente(cliente);
		}else{
			clienteService.updateCliente(cliente);
		}
		
		return "redirect:clientes";
	}
	
	@RequestMapping(value = "home/deleteCliente", method = RequestMethod.GET)
	public String deleteCliente(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		clienteService.deleteCliente(id);
		return "redirect:clientes";
	}
	
	@RequestMapping(value = "home/editCliente", method = RequestMethod.GET)
	public String editCliente(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("cliente", clienteService.searchCliente(id));
		model.addAttribute("opc", "update");
		return "home/frmCliente";
	}

}
