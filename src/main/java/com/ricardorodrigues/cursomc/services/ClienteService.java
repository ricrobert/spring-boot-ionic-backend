package com.ricardorodrigues.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardorodrigues.cursomc.domain.Cliente;
import com.ricardorodrigues.cursomc.repositories.ClienteRepository;
import com.ricardorodrigues.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {

		Cliente obj = repo.findOne(id);
		
		if (obj == null) {
			throw new ObjectNotFoundException ("Objeto não encontrado! Id: "+ id +", Tipo: "+ Cliente.class.getName());
		}
		return obj;
	}
}
