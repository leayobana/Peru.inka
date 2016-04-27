package pe.com.peru.Inka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peru.Inka.service.services.SucursalService;
import pe.com.peru.Inka.service.util.Sucursal;

@Controller
public class SucursalController {
	
	@Autowired
	private SucursalService sucursalService;

	@RequestMapping(value = "home/sucursales", method = RequestMethod.GET)
	public String dashboardDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listSucursal", sucursalService.findAllSucursal());
		return "home/sucursales";
	}

	@RequestMapping(value = "home/frmSucursal", method = RequestMethod.GET)
	public String frmSucursal(Model model, HttpServletRequest request) {
		model.addAttribute("sucursal", new Sucursal());
		model.addAttribute("opc", "new");
		return "home/frmSucursal";
	}
	
	@RequestMapping(value = "home/saveSucursal", method = RequestMethod.POST)
	public String saveSucursal(Model model, HttpServletRequest request,@ModelAttribute("sucursal") Sucursal sucursal) {

		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			sucursalService.saveSucursal(sucursal);
		}else{
			sucursalService.updateSucursal(sucursal);
		}
		
		return "redirect:sucursales";
	}
	
	@RequestMapping(value = "home/deleteSucursal", method = RequestMethod.GET)
	public String deleteSucursal(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		sucursalService.deleteSucursal(id);
		return "redirect:sucursales";
	}
	
	@RequestMapping(value = "home/editSucursal", method = RequestMethod.GET)
	public String editSucursal(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("sucursal", sucursalService.searchSucursal(id));
		model.addAttribute("opc", "update");
		return "home/frmSucursal";
	}

}
