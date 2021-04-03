import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Lista listaAlunos = new Lista();
		String name = "Sim";
		int tamanho2 = 60; 
		int k = 0;
		String rgmDigitado;
		
		while((name.equals("Sim")) || (name.equals("sim"))) {
			
			System.out.println("Digite um RGM: ");
			Scanner input = new Scanner(System.in); 
			rgmDigitado = input.next();
			
			Aluno[] cuser = new Aluno[tamanho2];
			cuser[k] = new Aluno();
			cuser[k].setRGM(rgmDigitado);
			System.out.println("------Cuser: " + cuser[k].rgm);
			
			listaAlunos.inserirAluno(k, cuser[k].rgm);
			k++;
			
			System.out.println("continuar? ");
			name = input.next();
		}
		listaAlunos.exibirLista();
	}
}