import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();
        

        double imc = peso / (altura * altura);
        

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Baixo peso. É recomendado procurar um médico para avaliação criteriosa.";
        } else if (imc < 25) {
            classificacao = "Peso adequado. Avalie outros parâmetros corporais.";
        } else if (imc < 30) {
            classificacao = "Sobrepeso. Consulte um médico e reveja seus hábitos.";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I. Busque orientação médica e nutricional.";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II. Não adie a busca por orientação médica.";
        } else {
            classificacao = "Obesidade grau III. Risco elevado de doenças associadas, procure um médico imediatamente.";
        }
        

        System.out.printf("\nNome: %s\n", nome);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
}
