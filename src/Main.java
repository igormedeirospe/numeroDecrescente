import javax.swing.*;


public class Main {
    public static void main(String[] args) {

    //declarando variaveis de tipo inteiro
    int num1, num2;

    //armazenar dados nas variaveis
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));

    //laço de repetição if/else
    if (num1 > num2){
        System.out.println(num1 + "\n" + num2);
    }else if (num2 > num1){
        System.out.println(num2 + "\n" + num1);
    }

    }
}