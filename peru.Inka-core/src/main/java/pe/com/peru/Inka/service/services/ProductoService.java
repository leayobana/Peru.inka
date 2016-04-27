package pe.com.peru.Inka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peru.Inka.service.util.Producto;

@Service("productoService")
public class ProductoService {
	
	public static List<Producto> listProducto = new ArrayList<Producto>();
	
	public void saveProducto(Producto producto){
		listProducto.add(producto);
	}
	
	public List<Producto> findAllProducto(){
		return listProducto;
	}
	
	public void updateProducto(Producto productoUpdate){
		List<Producto> listProductoTemp = new ArrayList<Producto>();
		
		for (Producto producto : listProducto) {
			if(productoUpdate.getId().compareTo(producto.getId())==0){
				listProductoTemp.add(productoUpdate);
			}else{
				listProductoTemp.add(producto);
			}
		}
		listProducto = new ArrayList<Producto>();
		listProducto.addAll(listProductoTemp);

	}
	
	public Producto searchProducto(Long id){
		Producto productoReturn = new Producto();
		for (Producto producto : listProducto) {
			if(id.compareTo(producto.getId())==0){
				productoReturn = producto;
				continue;
			}
		}
		return productoReturn;
	}
	
	public void deleteProducto(Long id){
		List<Producto> listProductoTemp = new ArrayList<Producto>();
		
		for (Producto producto : listProducto) {
			if(id.compareTo(producto.getId())!=0){
				listProductoTemp.add(producto);
			}
		}
		listProducto = new ArrayList<Producto>();
		listProducto.addAll(listProductoTemp);
	}

}
