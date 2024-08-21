package javaapplication1;

import javax.swing.JOptionPane;

public class exercio3 {

    public static void main(String[] args) {
        // Exibe o menu de opções para o usuário
        String menu = "Escolha uma opção do menu:\n"
                    + "1. BigMac\n"
                    + "2. Quarteirão\n"
                    + "3. MacChicken\n"
                    + "4. Cheddar\n"
                    + "5. Cheese Burger";
        
        // Solicita ao usuário que digite o número da opção
        String opcaoStr = JOptionPane.showInputDialog(menu);
        
        // Converte a entrada do usuário para um número inteiro
        int opcao = Integer.parseInt(opcaoStr);
        
        // Declara uma variável para armazenar o nome do lanche
        String lanche;
        
        // Determina o nome do lanche com base na opção digitada
        switch (opcao) {
            case 1:
                lanche = "BigMac";
                break;
            case 2:
                lanche = "Quarteirão";
                break;
            case 3:
                lanche = "MacChicken";
                break;
            case 4:
                lanche = "Cheddar";
                break;
            case 5:
                lanche = "Cheese Burger";
                break;
            default:
                lanche = "Opção inválida. Por favor, escolha um número entre 1 e 5.";
        }
        
        // Exibe o nome do lanche ou a mensagem de opção inválida
        JOptionPane.showMessageDialog(null, lanche);
    }
}
