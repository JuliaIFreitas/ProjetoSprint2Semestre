import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nomeUsuario = "fernanda.caramico@sptech.com";
        String senha = "SPtechPI";

        System.out.println("Quer acessar sua página de usuário e acompanhar o monitoramento?");
        System.out.println("Insira aqui seu nome de usuário:");
        nomeUsuario = input.nextLine();
        while (!(nomeUsuario.equals("fernanda.caramico@sptech.com"))) {
                System.out.println("Nome de usuário incorreto. Tente novamente");

            System.out.println();

                System.out.println("Insira aqui seu nome de usuário:");
                nomeUsuario = input.nextLine();
        }

        System.out.println("Insira aqui sua senha:");
        senha = input.nextLine();
        while (!(senha.equals("SPtechPI"))) {
                System.out.println("Senha incorreta. Tente novamente");

            System.out.println();

                System.out.println("Insira aqui sua senha:");
                senha = input.nextLine();
            }

        System.out.println("Você será direcionado à sua página de usuário. Obrigada!");

    }
}