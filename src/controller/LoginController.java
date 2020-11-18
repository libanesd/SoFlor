package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController {

	private String usuario;
	private String senha;
	
	public String entrar() {
		
		if(getUsuario().equals("admin") &&
		   getSenha().equals("12345"))
		{
			return "index.xhtml";
		}
		
		System.out.println("Executou o metodo entrar");
		System.out.println("Usuario: "+usuario);
		System.out.println("Senha: "+senha);
		return "";

	
	}
	public void limpar() {	
	
		System.out.println("Limpar");
	}
	

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getSenha() {
	return senha;
} 

public void setSenha(String senha) {
	this.senha = senha;
}





}