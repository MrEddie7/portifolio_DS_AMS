package javaapplication1;

import javax.swing.JOptionPane;

public class exercicio5 {

    public static void main(String[] args) {
        // Solicita ao usuário que insira as quatro notas
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota:"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4ª nota:"));

        // Calcula a média das quatro notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Declara uma variável para armazenar o conceito
        String conceito;

        // Determina o conceito com base na média calculada
        if (media >= 9) {
            conceito = "Aprovado com conceito A";
        } else if (media >= 7) {
            conceito = "Aprovado com conceito B";
        } else if (media >= 5) {
            conceito = "Aprovado com conceito C";
        } else if (media >= 2.5) {
            conceito = "Reprovado com conceito D";
        } else {
            conceito = "Reprovado com conceito E";
        }

        // Exibe a média e o conceito adquirido
        JOptionPane.showMessageDialog(null, String.format("Média: %.2f\nConceito: %s", media, conceito));
    }
}

