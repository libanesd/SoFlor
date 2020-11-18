package model;

import java.sql.Date;

public class Pac1 {
	
	public Pac1(String nome, String categoria, String origin, String condicoes, Float preco, Date data,
			Especificacoes especificacao) {
		super();
		this.nome = 	 	 nome;
		this.categoria =	 categoria;
		this.origin = 	 	 origin;
		this.condicoes = 	 condicoes;
		this.preco = 	 	 preco;
		this.data = 	 	 data;
		this.especificacao = especificacao;
	}

	private String nome;
	private String categoria;
	private String origin;
	private String condicoes;
	private Float  preco;
	private Date   data;
	
	private Especificacoes especificacao;
	
	public enum Especificacoes{
		
		x1(1,"op 1"), 
		x2(2,"op 2"), 		
		x3(3,"op 3"), 
		x4(4,"op 4");
		
	
		private final int valor;  //final = valor constante nao alteravel
		private final String opcao;
		
		
		
		Especificacoes(int valor, String opcao){  //construtor 

			this.valor = valor;
			this.opcao = opcao;
			
		}

		public int getValor() {    //encapsulamento get set
			
			return this.valor;
		}
		
		public String getOpcao() {
			return opcao;
		}
		
	}

	//gerado via right click>sourve getstetter ......
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Especificacoes getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(Especificacoes especificacao) {
		this.especificacao = especificacao;
	}	
	
	
	

}
