public class Carro extends Veiculo {
	public Carro(double aceleracaoBase) {
        super(aceleracaoBase);
		this.aceleracaoBase*=3;
    }

	void acelerar(int tempo) {
		double velocidadeInicial = velocidadeAtual;
		velocidadeAtual += aceleracaoBase*tempo;
		distanciaPercorrida += (velocidadeInicial*tempo + (aceleracaoBase*tempo*tempo)/2);
	}

	void freiar(int tempo) {
		double velocidadeInicial = velocidadeAtual;
		velocidadeAtual -= aceleracaoBase*tempo;
		distanciaPercorrida += (velocidadeInicial*tempo - (aceleracaoBase*tempo*tempo)/2);
	}

	public void moveCarro(char acao, int tempo) {
		movimentar(acao, tempo);
	}
}
