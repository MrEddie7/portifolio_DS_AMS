package javaapplication1;

import javax.swing.JOptionPane;

public class exercicio4 {

    public static void main(String[] args) {
        // Solicita ao usuário que insira um número entre 1 e 12
        String input = JOptionPane.showInputDialog("Digite um número entre 1 e 12:");
        
        // Converte a entrada do usuário para um número inteiro
        int numero = Integer.parseInt(input);
        
        // Declara uma variável para armazenar o nome do mês
        String mes;
        
        // Determina o nome do mês com base no número digitado
        switch (numero) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Número inválido. Por favor, insira um número entre 1 e 12.";
        }
        
        // Exibe o nome do mês ou a mensagem de número inválido
        JOptionPane.showMessageDialog(null, mes);
    }
}
