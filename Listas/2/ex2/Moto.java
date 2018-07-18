public class Moto extends Veiculo {
    public Moto(double aceleracaoBase) {
        super(aceleracaoBase);
		this.aceleracaoBase*=4.5;
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

	public void moveMoto(char acao, int tempo) {
		movimentar(acao, tempo);
	}
}
