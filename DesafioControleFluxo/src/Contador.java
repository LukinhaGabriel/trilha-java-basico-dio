import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args){
        try{
            Scanner terminal = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = terminal.nextInt();
            System.out.print("Digite o segundo número: ");
            int segundoNumero = terminal.nextInt();

            try{
                contar(primeiroNumero, segundoNumero);
            } catch (ParametrosInvalidosException e){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        }
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if(primeiroNumero > segundoNumero){
            throw new ParametrosInvalidosException();
        } else{
            int contador = segundoNumero - primeiroNumero;

            for(int index = 0; index <= contador; index++){
                System.out.println("Imprimindo o número " + index);
            }
        }

    }
}
