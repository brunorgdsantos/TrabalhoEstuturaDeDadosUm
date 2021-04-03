
public class Lista {
	Aluno[] aluno = new Aluno[60];
	int tamanho = 0;
	
	public boolean listaVazia() {
		return (tamanho == 0);
	}
	
	public boolean listaCheia() {
		return (tamanho == aluno.length);
	}
	
	public int tamanhoLista() {
		return tamanho;
	}
	
	public Aluno buscar(int pos) {
		if((pos >= 60) || (pos < 0)) {
			return null;
		}
		else return aluno[pos];
	}
	
	public boolean compara(Aluno c1, Aluno c2) {
		return (c1.rgm.equals(c2.rgm));
	}
	
	public int retornarPosicao(Aluno posicao) {
		for(int i = 0; i < tamanho; i++) {
			if(compara (aluno[i], posicao))
				return i;
		}
			return -1;
	}
	
	public void deslocarDireita(int pos) {
		for(int i = tamanho; i > pos; i--) {
			aluno[i] =  aluno[i - 1];
		}
	}
	
	public boolean inserirAluno(int pos, Aluno c1) {
		if ((listaCheia()) || (pos == tamanho) || (pos < 0)) {
			return false;
		}
		deslocarDireita(pos);
		aluno[pos] = c1;
		tamanho++;
		return true;
	}
	
	public void deslocarEsquerda(int pos) {
		for(int i = pos; i < (tamanho - 1); i++) {
			aluno[i] = aluno[i + 1];
		}
	}
	
	public boolean remover(int pos) {
		if((pos >= tamanho) || (pos < 0)) {
			return false;
		}
		deslocarEsquerda(pos);
		tamanho--;
		return true;
	}
	
	public void exibirLista() {
		for(int i = 0; i < tamanho; i++) {
			System.out.println("RGM: " + aluno[i].rgm);
		}
	}
}
