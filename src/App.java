import java.util.Scanner;

 public class App {
    
    // Início do Programa
    public static void main(String[] args) throws Exception {
        
        // Declaração de Variaveis
     double salario;
     double n1;
     double n2;

     // Solicitação de Dados
     Scanner teclado = new Scanner(System.in);
     System.out.println("Informe quanto você ganha por hora: ");
     n1 = teclado.nextDouble();
     System.out.println("Informe quantas horas você trabalha no mês: ");
     n2 = teclado.nextDouble();
     teclado.close();

     // Calcular Salário
     salario = n1 * n2;

     // Exibir a Resposta para o Usuário
     System.out.println("Seu salario mensal é " + salario);
    }
}


    

