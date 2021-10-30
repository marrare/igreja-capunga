package br.ifpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.model.Pessoa;
import br.ifpe.model.PessoaIgreja;
import br.ifpe.model.Profissao;
import br.ifpe.model.Telefone;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/cad_pessoa")
	public String exibirTelaPessoa() {
		return "pessoa";
	}
	
	@PostMapping("/salvar_pessoa")
	public String salvarPessoa(Pessoa pessoa, Telefone telefone, Profissao profissao, PessoaIgreja pessoaIgreja) {
		pessoa.setTelefone(telefone);
		pessoa.setPessoaIgreja(pessoaIgreja);
		pessoa.setProfissao(profissao);
		return "pessoa";
	}
}
