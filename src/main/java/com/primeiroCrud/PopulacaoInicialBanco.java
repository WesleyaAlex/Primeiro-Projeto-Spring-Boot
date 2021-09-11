package com.primeiroCrud;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.primeiroCrud.rh.dominio.Pessoa;
import com.primeiroCrud.rh.dominio.PessoaRepositorio;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepositorio pessoaRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa("Joao");
		p1.setDataNascimento(LocalDate.of(1990, 4, 1));
		p1.setEmail("joao@gmail.com");
		p1.setCpf("867.842.350-10");
		p1.setTelefone("11 987878779");
		Pessoa p2 = new Pessoa("Maria");
		p2.setDataNascimento(LocalDate.of(2090, 4, 1));
		p2.setEmail("maria@gmail.com");
		p2.setCpf("085.477.260-04");
		p2.setTelefone("11 909891890");
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
	}
}