
 package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1

//exercicio 1:
{

    public static void main(String[] args) {
        // Solicita ao usuário que insira o horário do turno
        double h = Double.parseDouble(JOptionPane.showInputDialog("Digite o horário do seu turno (em formato 24h):"));

        // Verifica em qual turno o horário fornecido se encaixa
        if (h >= 5 && h < 13) {
            // Horário entre 00:00 e 11:59 é considerado turno da manhã
            JOptionPane.showMessageDialog(null, "Seu turno é a manhã");
        } else if (h >= 13 && h < 21) {
            // Horário entre 12:00 e 17:59 é considerado turno da tarde
            JOptionPane.showMessageDialog(null, "Seu turno é a tarde");
        } else if (h >= 21 && h < 5) {
            // Horário entre 18:00 e 23:59 é considerado turno da noite
            JOptionPane.showMessageDialog(null, "Seu turno é a noite");
        } else {
            // Caso o usuário insira um horário fora do intervalo esperado
            JOptionPane.showMessageDialog(null, "Horário inválido. Por favor, insira um horário no formato 24h (0-23).");
        }
    }
}
        
    
       
       
               
               
               
    
    

