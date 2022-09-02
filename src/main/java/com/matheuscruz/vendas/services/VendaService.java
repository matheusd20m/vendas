package com.matheuscruz.vendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheuscruz.vendas.domain.Venda;
import com.matheuscruz.vendas.repositories.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	public Venda find(Integer id) {
		
		Optional<Venda> obj = vendaRepository.findById(id);
		return obj.orElse(null);
		
	}

}
