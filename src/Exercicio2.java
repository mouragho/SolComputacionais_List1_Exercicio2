//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio2 { 

    public static void main (String args[]) {
        Scanner enterScanner = new Scanner(System.in); // Atribui o nome "enterScanner" à entrada do teclado
        double x; // Aloca na memoria um espaço para a variável x
        System.out.println("Digite um número: "); // Imprime na tela a mensagem
        x = enterScanner.nextInt(); //Grava o valor digitado na variável x
        System.out.println("O número digitado foi: " + x); // Imprime na tela a mensagem + o conteúdo de x
        enterScanner.close(); //Encerra as entradas do teclado
    }
}
