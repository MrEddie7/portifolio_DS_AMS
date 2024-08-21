package javaapplication1;

import javax.swing.JOptionPane;

public class exercico2 {

    public static void main(String[] args) {
        // Solicita ao usuário que insira seu peso em kg
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg:"));
        
        // Solicita ao usuário que insira sua altura em metros
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));
        
        // Calcula o IMC
        double imc = peso / (altura * altura);
        
        // Declara uma variável para armazenar a classificação
        String classificacao;
        
        // Determina a classificação com base no IMC calculado
        if (imc < 18) {
            classificacao = "Magreza";
        } else if (imc >= 18.0 && imc < 25.0) {
            classificacao = "Saudável";
        } else if (imc >= 25.0 && imc < 30.0) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }
        
        // Exibe o resultado do IMC e a classificação
        JOptionPane.showMessageDialog(null, String.format("Seu IMC é %.2f e sua classificação é: %s", imc, classificacao));
    }
}
