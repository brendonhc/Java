public abstract class Veiculo {

    double velocidadeAtual;
    double aceleracaoBase;
    double distanciaPercorrida;
    boolean ligado;

    Veiculo(double aceleracaoBase) {
        this.aceleracaoBase = aceleracaoBase;
        ligado = true;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    abstract void acelerar(int tempo);

    abstract void freiar(int tempo);

    private void movimentoConstante(int tempo) {
        distanciaPercorrida += velocidadeAtual*tempo;
    }

    public void movimentar(char acao, int tempo) {

        switch (acao) {
            case 'A':
                acelerar(tempo);
                break;

            case 'F':
                freiar(tempo);
                break;

            case 'C':
                movimentoConstante(tempo);
                break;
        }
    }

    public double getPos() {
        return distanciaPercorrida;
    }
}
