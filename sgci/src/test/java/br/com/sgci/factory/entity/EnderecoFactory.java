package br.com.sgci.factory.entity;

import br.com.sgci.controller.schema.EnderecoReq;
import br.com.sgci.controller.schema.EnderecoUpd;
import br.com.sgci.model.Endereco;

public class EnderecoFactory {
	
	
	public static EnderecoReq getEnderecoReq() {
		return new EnderecoReq("96033250", "SC", "Pomerode", "Rua Henrique Afonso", "Testo Salto", 205);
	}

	public static Endereco getEndereco() {
		return new Endereco("96033250", "SC", "Pomerode", "Rua Henrique Afonso", "Testo Salto", 205);
	}
	
	public static EnderecoUpd getEnderecoUpd() {
		return new EnderecoUpd("12345678", "SP", "São Paulo", "Rua Benedito Novo", "Cotia", 99);
	}
	
}
