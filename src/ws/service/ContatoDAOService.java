package ws.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import ws.entity.Contato;

public class ContatoDAOService {

	// private ContatoDAO dao;
	
	public ContatoDAOService() {
		// dao = new ContatoDAO();
	}
	
	public String buscaById(Long id) {
		
		Map<Integer, Contato> contatos = new HashMap<>();
		contatos.put(1, new Contato(1, "Luis", "prof.lpjunior@gmail.com", "(21) 96487-5646"));
		contatos.put(2, new Contato(2, "Paulo", "lpjunior@gmail.com", "(21) 96487-5646"));
		
		return contatos.entrySet().stream()
			.filter(contato -> id.equals(contato.getValue().getId()))
			.map(contato->contato.getValue().toJSON())
			.collect(Collectors.joining());
	}
}
