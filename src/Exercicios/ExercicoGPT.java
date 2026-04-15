package Exercicios;

import java.util.Scanner;

public class ExercicoGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals (usuarioCorreto) && senha.equals (senhaCorreta)) { // o erro estava nessalinha pois ele validava se se usuario e usuarioCorreto eram igual, oq precisava saber é se tinha o mesmo valor
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }
    }
}