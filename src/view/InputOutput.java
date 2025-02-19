package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Car;

public class InputOutput {

    // Exibe um menu de opções e retorna o índice da opção selecionada
    public static int mostrarOpcoes(String[] opcoes) {
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Escolha uma opção", JOptionPane.OK_CANCEL_OPTION);

        return menu.getSelectedIndex();
    }

    // Solicita ao usuário a quantidade de carros a serem inseridos
    public static int perguntarQuantidadeCarros() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos carros deseja inserir? ", "Quantidade de carros", JOptionPane.QUESTION_MESSAGE));
    }   

    // Solicita ao usuário o modelo do carro
    public static String perguntarModeloCarro() {
        return JOptionPane.showInputDialog(null, "Modelo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
    }

    // Solicita ao usuário a cor do carro
    public static String perguntarCorCarro() {
        return JOptionPane.showInputDialog(null, "Cor: ", "Cor do carro", JOptionPane.QUESTION_MESSAGE);
    }

    // Gera uma string com as informações do carro
    public static String gerarInfoCarros(Car carro) {
        return "Modelo: " + carro.getModelo() + ", Cor: " + carro.getCor() + "\n";
    }

    // Exibe uma mensagem de erro
    public static void mostrarMensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    // Exibe as informações dos carros
    public static void mostrarInfoCarros(String info) {
        JOptionPane.showMessageDialog(null, info, "Informações dos carros", JOptionPane.INFORMATION_MESSAGE);
    }
}   