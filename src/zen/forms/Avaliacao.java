package zen.forms;

import java.util.Scanner;

public class Avaliacao extends Formulario{
	private String feedback;
	private double nota;
	
	public Avaliacao(int codigoIdPaciente, int codigoIdPsicologo, String feedback, double nota, int idFormulario) {
		super();
		this.codigoIdPaciente = codigoIdPaciente;
		this.codigoIdPsicologo = codigoIdPsicologo;
		this.feedback = feedback;
		this.nota = nota;
		this.idFormulario = idFormulario;
	}
	
	public Avaliacao() {
		super();
		this.tipoFormulario = "avaliacao";
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public void cadastrar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("DIGITE O CODIGO ID DO PACIENTE: ");
		this.setCodigoIdPaciente(sc.nextInt());
		
		System.out.print("DIGITE O CODIGO ID DO PSIC�LOGO: ");
		this.setCodigoIdPsicologo(sc.nextInt());
		
		System.out.print("DIGITE SUA NOTA DE 0 A 5: ");
		this.setNota(sc.nextDouble());
		
		System.out.println("DIGITE SEU FEEDBACK: ");
		System.out.println("-> ");
		this.setFeedback(sc.next());
		
		sc.close();
	}
}