package pe.com.peru.Inka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peru.Inka.service.services.ProductoService;
import pe.com.peru.Inka.service.util.Producto;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;

	@RequestMapping(value = "home/productos", method = RequestMethod.GET)
	public String dashboardDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listProducto", productoService.findAllProducto());
		return "home/productos";
	}

	@RequestMapping(value = "home/frmProducto", method = RequestMethod.GET)
	public String frmProducto(Model model, HttpServletRequest request) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("opc", "new");
		return "home/frmProducto";
	}
	
	@RequestMapping(value = "home/saveProducto", method = RequestMethod.POST)
	public String saveProducto(Model model, HttpServletRequest request,@ModelAttribute("producto") Producto producto) {

		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			productoService.saveProducto(producto);
		}else{
			productoService.updateProducto(producto);
		}
		
		return "redirect:productos";
	}
	
	@RequestMapping(value = "home/deleteProducto", method = RequestMethod.GET)
	public String deleteProducto(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		productoService.deleteProducto(id);
		return "redirect:productos";
	}
	
	@RequestMapping(value = "home/editProducto", method = RequestMethod.GET)
	public String editProducto(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("producto", productoService.searchProducto(id));
		model.addAttribute("opc", "update");
		return "home/frmProducto";
	}

}
