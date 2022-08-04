import javax.swing.*;

public class Exercicio_03_easy {

    static int primeiroValor, segundoValor;
    public static void main (String [] args) {

        primeiroValor= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        segundoValor= Integer.parseInt(JOptionPane.showInputDialog("Digite mais um valor"));
        System.out.println("Primeiro valor digitado foi:" + segundoValor);
        System.out.println("Segundo valor digitado foi:" + primeiroValor);

    }
} //fim algoritmo

