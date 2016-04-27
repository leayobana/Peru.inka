package pe.com.peru.Inka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peru.Inka.service.util.Sucursal;

@Service("sucursalService")
public class SucursalService {
	
	public static List<Sucursal> listSucursal = new ArrayList<Sucursal>();
	
	public void saveSucursal(Sucursal sucursal){
		listSucursal.add(sucursal);
	}
	
	public List<Sucursal> findAllSucursal(){
		return listSucursal;
	}
	
	public void updateSucursal(Sucursal sucursalUpdate){
		List<Sucursal> listSucursalTemp = new ArrayList<Sucursal>();
		
		for (Sucursal sucursal : listSucursal) {
			if(sucursalUpdate.getId().compareTo(sucursal.getId())==0){
				listSucursalTemp.add(sucursalUpdate);
			}else{
				listSucursalTemp.add(sucursal);
			}
		}
		listSucursal = new ArrayList<Sucursal>();
		listSucursal.addAll(listSucursalTemp);

	}
	
	public Sucursal searchSucursal(Long id){
		Sucursal sucursalReturn = new Sucursal();
		for (Sucursal sucursal : listSucursal) {
			if(id.compareTo(sucursal.getId())==0){
				sucursalReturn = sucursal;
				continue;
			}
		}
		return sucursalReturn;
	}
	
	public void deleteSucursal(Long id){
		List<Sucursal> listSucursalTemp = new ArrayList<Sucursal>();
		
		for (Sucursal sucursal : listSucursal) {
			if(id.compareTo(sucursal.getId())!=0){
				listSucursalTemp.add(sucursal);
			}
		}
		listSucursal = new ArrayList<Sucursal>();
		listSucursal.addAll(listSucursalTemp);
	}

}
