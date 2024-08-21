package javaapplication1;

import javax.swing.JOptionPane;

public class exercicio6 {

    public static void main(String[] args) {
        // Solicita ao usuário que insira a idade do nadador
        String input = JOptionPane.showInputDialog("Digite a idade do nadador:");
        
        // Converte a entrada do usuário para um número inteiro
        int idade = Integer.parseInt(input);
        
        // Declara uma variável para armazenar a categoria
        String categoria;
        
        // Determina a categoria com base na idade
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Senior";
        } else {
            categoria = "Idade inválida. O nadador deve ter pelo menos 5 anos.";
        }
        
        // Exibe a categoria ou mensagem de idade inválida
        JOptionPane.showMessageDialog(null, "Categoria: " + categoria);
    }
}

