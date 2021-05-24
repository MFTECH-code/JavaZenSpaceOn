package zen.teste;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Classe TESTE
		Controller ctrl = new Controller();

		ctrl.menu();
		Scanner sc = new Scanner(System.in);
		System.out.print("DIGITE A OPÇÃO: ");
		int op = sc.nextInt();
		ctrl.execute(op);
		
		sc.close();			
	
		ctrl.mostrarUsuarios();
		ctrl.mostrarFormularios();
	}
}
