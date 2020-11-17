package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import model.Pac1;

@Named      // nao funciona sem as dependencies add no comeco do projeto
@RequestScoped



public class Pac1Controller {
	
	
	private Pac1 entidade;

	public Pac1 getEntidade() {
		return entidade;
	}

	public void setEntidade(Pac1 entidade) {
		this.entidade = entidade;
	}
	
	

}
