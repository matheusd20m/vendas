package com.matheuscruz.vendas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private Integer totalVendas;
	private double mediaVendasDiaria;
	
	@OneToMany(mappedBy = "vendedor")
	private List<Venda> vendas = new ArrayList<>();
	
	public Vendedor() {
		
	}

	public Vendedor(Integer id, String nome, Integer totalVendas, double mediaVendasDiaria) {
		super();
		this.id = id;
		this.nome = nome;
		this.totalVendas = totalVendas;
		this.mediaVendasDiaria = mediaVendasDiaria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(Integer totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getMediaVendasDiaria() {
		return mediaVendasDiaria;
	}

	public void setMediaVendasDiaria(double mediaVendasDiaria) {
		this.mediaVendasDiaria = mediaVendasDiaria;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
