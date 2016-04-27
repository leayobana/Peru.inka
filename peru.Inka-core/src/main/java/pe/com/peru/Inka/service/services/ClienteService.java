package pe.com.peru.Inka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peru.Inka.service.util.Cliente;

@Service("clienteServive")
public class ClienteService {
	
	public static List<Cliente> listCliente = new ArrayList<Cliente>();
	
	public void saveCliente(Cliente cliente){
		listCliente.add(cliente);
	}
	
	public List<Cliente> findAllCliente(){
		return listCliente;
	}
	
	public void updateCliente(Cliente clienteUpdate){
		List<Cliente> listTemp = new ArrayList<Cliente>();
		
		for (Cliente cliente : listCliente) {
			if(clienteUpdate.getId().compareTo(cliente.getId())==0){
				listTemp.add(clienteUpdate);
			}else{
				listTemp.add(cliente);
			}
		}
		listCliente = new ArrayList<Cliente>();
		listCliente.addAll(listTemp);

	}
	
	public Cliente searchCliente(Long id){
		Cliente clienteReturn = new Cliente();
		for (Cliente cliente : listCliente) {
			if(id.compareTo(cliente.getId())==0){
				clienteReturn = cliente;
				continue;
			}
		}
		return clienteReturn;
	}
	
	public void deleteCliente(Long id){
		List<Cliente> listTemp = new ArrayList<Cliente>();
		
		for (Cliente cliente : listCliente) {
			if(id.compareTo(cliente.getId())!=0){
				listTemp.add(cliente);
			}
		}
		listCliente = new ArrayList<Cliente>();
		listCliente.addAll(listTemp);
	}

}
