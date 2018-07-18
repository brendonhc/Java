public class Bike extends Veiculo {
    public Bike(double aceleracaoBase) {
        super(aceleracaoBase);
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

	public void moveBike(char acao, int tempo) {
		movimentar(acao, tempo);
	}
}
