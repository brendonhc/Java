import java.util.Scanner;
import java.util.Locale;

class Teste{
	public static void main(String[] args){

		/* Tem que mudar a localização para o Scanner reconhecer double com .
		e não com virgulas*/
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);


		double baseaccel = sc.nextDouble();

		Carro carro1 = new Carro(baseaccel);
		Moto moto1 = new Moto(baseaccel);
		Bike bike1 = new Bike(baseaccel);

		int nroAcao;
		nroAcao = sc.nextInt();
		char acao;
		int tempo;
		for(int i=0;i<nroAcao;i++){
			acao = sc.next().charAt(0);
			tempo = sc.nextInt();
			carro1.moveCarro(acao, tempo);
		}
		for(int i=0;i<nroAcao;i++){
			acao = sc.next().charAt(0);
			tempo = sc.nextInt();
			moto1.moveMoto(acao, tempo);
		}
		for(int i=0;i<nroAcao;i++){
			acao = sc.next().charAt(0);
			tempo = sc.nextInt();
			bike1.moveBike(acao, tempo);

		}
		System.out.println(carro1.getPos() + " " + moto1.getPos() + " " + bike1.getPos());
	}
}
