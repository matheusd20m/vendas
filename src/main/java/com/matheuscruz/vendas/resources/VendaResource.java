package com.matheuscruz.vendas.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matheuscruz.vendas.domain.Venda;

@RestController
@RequestMapping(value = "/vendas")
public class VendaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Venda> listar() {
		
		Venda cat1 = new Venda(1, null, 25.66);
		Venda cat2 = new Venda(2, null, 12.97);
		
		List<Venda> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		
		
		return lista;
	}
	
}
