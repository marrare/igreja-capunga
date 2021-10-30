package br.ifpe.model;

import java.util.Date;
import java.util.List;

public class Pessoa {

	private String nome;
	private Date nascimento;
	private EstadoCivil estadoCivil;
	private Genero genero;
	private String nomePai;
	private String nomeMae;
	private String naturalidade;
	private String nacionalidade;
	private String cpf;
	private String rg;
	private GrauEscolaridade escolaridade;
	private String email;
	private String enderecoPessoal;
	private String bairroPessoal;
	private String cidadePessoal;
	private String estadoPessoal;
	private String cepPessoal;
	private Telefone telefone;
	private Profissao profissao;
	private PessoaIgreja pessoaIgreja;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public GrauEscolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(GrauEscolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnderecoPessoal() {
		return enderecoPessoal;
	}
	public void setEnderecoPessoal(String enderecoPessoal) {
		this.enderecoPessoal = enderecoPessoal;
	}
	public String getBairroPessoal() {
		return bairroPessoal;
	}
	public void setBairroPessoal(String bairroPessoal) {
		this.bairroPessoal = bairroPessoal;
	}
	public String getCidadePessoal() {
		return cidadePessoal;
	}
	public void setCidadePessoal(String cidadePessoal) {
		this.cidadePessoal = cidadePessoal;
	}
	public String getEstadoPessoal() {
		return estadoPessoal;
	}
	public void setEstadoPessoal(String estadoPessoal) {
		this.estadoPessoal = estadoPessoal;
	}
	public String getCepPessoal() {
		return cepPessoal;
	}
	public void setCepPessoal(String cepPessoal) {
		this.cepPessoal = cepPessoal;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	public PessoaIgreja getPessoaIgreja() {
		return pessoaIgreja;
	}
	public void setPessoaIgreja(PessoaIgreja pessoaIgreja) {
		this.pessoaIgreja = pessoaIgreja;
	}
	
}
