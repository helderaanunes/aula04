package aula04;

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        System.out.println("O sucessor é: "+(numero+1));
        // em python
        // numero = int (input("Digite um número"))
        // print("O sucessor é:"+(numero+1))
    }
    
}
