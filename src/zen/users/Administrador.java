package zen.users;

import java.util.Scanner;

public class Administrador extends Usuarios {

	public Administrador(int codigoId, String nome, String senha) {
		super();
		this.codigoId = codigoId;
		this.nome = nome;
		this.senha = senha;
		this.tipoUsuario = "adm";
	}
	
	public Administrador() {
		super();
		this.tipoUsuario = "adm";
	}
	
	@Override
	public void cadastrar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("INFORME O NOME: ");
		String nome = sc.next();
		this.setNome(nome);
		
		System.out.print("INFORME A SENHA: ");
		String senha = sc.next();
		this.setSenha(senha);
		
		sc.close();
	}
	
	
}
