import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfOperations, element;
        String operation;
        Stack stack = new Stack();
        Scanner scan = new Scanner(System.in);


        numberOfOperations = scan.nextInt();

        for (int i = 0; i < numberOfOperations; i++) {
            operation = scan.next();

            /* Bloco que testa cada opção efetuada pelo usuário,
            empilhando ou desempilhando ou imprimindo o topo da pilha.
            Caso haja algum problema, o método chamado lançará uma exceção
            que é tratada no bloco 'catch'*/
            try {
                switch (operation) {
                    case "I":
                        stack.push(scan.nextInt());
                        break;

                    case "R":
                        stack.pop();
                        break;

                    case "P":
                        System.out.println(stack.top());
                }
            }

            /* Tratamento das possiveis excessões provindas do manuseio da Stack */
            catch (EmptyStackException | FullStackException exc) {
                System.out.println(exc.getMessage());
                // Finaliza com operações inválidas de inserção e remoção
                switch (operation) {
                    case "I": case "R":
                        System.exit(0);
                }
            }
        }

    }
}
