package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Fabric {
    // Lista de carros
    private final List<Car> carros = new ArrayList<>();

    
    public void adicionarCarro(Car carro) {
        carros.add(carro);
    }

    // Retorna a lista de carros
    public List<Car> obterCarros() {
        return carros;
    }

    // Remove um carro da lista pelo índice
    public void removerCarro(int indice) {
        if (indice >= 0 && indice < carros.size()) {
            carros.remove(indice);
        }
    }

    // Exibe um menu de opções e retorna o índice da opção selecionada
    public static int mostrarOpcoes(String[] opcoes) {
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Escolha uma opção", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }

        public static int perguntarQuantidadeCarros() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos carros deseja inserir? ", "Quantidade de carros", JOptionPane.QUESTION_MESSAGE));
    }   

   
    public static String perguntarModeloCarro() {
        return JOptionPane.showInputDialog(null, "Modelo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
    }

    
    public static String perguntarCorCarro() {
        return JOptionPane.showInputDialog(null, "Cor: ", "Cor do carro", JOptionPane.QUESTION_MESSAGE);
    }

    // Gera uma string com as informações do carro
    public static String gerarInfoCarros(Car carro) {
        return "Modelo: " + carro.getModelo() + ", Cor: " + carro.getCor() + "\n";
    }

    
    public static void mostrarMensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    } 

    
    public static void mostrarInfoCarros(String info) {
        JOptionPane.showMessageDialog(null, info, "Informações dos carros", JOptionPane.INFORMATION_MESSAGE);
    }
}