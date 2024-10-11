package br.com.sgci.factory.entity;

import java.util.Random;

import org.springframework.data.domain.Sort.Direction;

import br.com.sgci.controller.schema.EnderecoReq;
import br.com.sgci.controller.schema.EnderecoUpd;
import br.com.sgci.controller.schema.PessoaFilter;
import br.com.sgci.controller.schema.PessoaReq;
import br.com.sgci.controller.schema.PessoaUpd;
import br.com.sgci.model.Endereco;
import br.com.sgci.model.EstadoCivilEnum;
import br.com.sgci.model.Pessoa;
import br.com.sgci.model.TipoPessoaEnum;

public class PessoaFactory {

	//Para teste do método createPessoa
	public static PessoaReq getPessoaReq(EnderecoReq enderecoReq, String documento) {
		return new PessoaReq("Yan Lorem", enderecoReq, TipoPessoaEnum.PESSOA_FISICA, documento, 
				"Analista de Sistemas", EstadoCivilEnum.CASADO);
	}

	
	//Para teste do método Pessoa getById
	public static Pessoa getPessoa(Endereco endereco) {
		return new Pessoa(endereco, "Yan Lorem", TipoPessoaEnum.PESSOA_FISICA, gerarCpfAleatorio(), 
				"Analista de Sistemas", EstadoCivilEnum.CASADO);
	}
	
	public static PessoaUpd getPessoaUpd(EnderecoUpd enderecoUpd) {
		return new PessoaUpd("Yan Lorem ATUALIZADO", enderecoUpd, TipoPessoaEnum.PESSOA_FISICA, gerarCpfAleatorio(), 
				"Analista de Sistemas", EstadoCivilEnum.CASADO);
	}
	
	
	//Método para gerar um documento de forma aleatória
	private static String gerarCpfAleatorio() {
		
		Random random = new Random();
		int numeroNF = (random.nextInt(90000000) + 10000000);
		return String.valueOf(numeroNF);
	}
	
	
	//Para teste do método findAllPaged
	public static PessoaFilter getPessoaFilter() {
		
		PessoaFilter filtros = new PessoaFilter();
		filtros.setPage(0);
		filtros.setSize(1);
		filtros.setDirection(Direction.ASC);
		filtros.setOrdenarPor("nome");
		
		return filtros;
		
	}
	
	
	
	
	
	
	
}
