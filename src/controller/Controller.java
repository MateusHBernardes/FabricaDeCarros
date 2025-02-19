package controller;

import model.Car;
import model.Fabric;
import view.InputOutput;

public class Controller {
    // Instância da classe Fabric que gerencia os carros
    Fabric fabrica = new Fabric();

    // Método que inicia a aplicação 
    public void iniciarAplicacao() {
        while (true) {
            // Exibe o menu de opções e obtém a opção selecionada pelo usuário
            int opcao = InputOutput.mostrarOpcoes(new String[] {"Adicionar carros", "Listar carros", "Vender carros", "Sair"});

            switch (opcao) {
                case 0:
                    // Solicita a quantidade de carros a serem adicionados
                    int quantidade = InputOutput.perguntarQuantidadeCarros();
                    while (quantidade <= 0) {
                        // Exibe uma mensagem de erro se a quantidade for inválida
                        InputOutput.mostrarMensagemErro("Quantidade inválida. Tente novamente.");
                        quantidade = InputOutput.perguntarQuantidadeCarros();
                    }

                    // Adiciona os carros à lista
                    for (int i = 0; i < quantidade; i++) {
                        Car carro = new Car();
                        carro.setModelo(InputOutput.perguntarModeloCarro());
                        carro.setCor(InputOutput.perguntarCorCarro());

                        fabrica.adicionarCarro(carro);
                    }
                    break;
                case 1:
                    // Verifica se há carros cadastrados
                    if (fabrica.obterCarros().isEmpty()) {
                        InputOutput.mostrarMensagemErro("Nenhum carro foi cadastrado ainda.");
                        break;
                    }
                    // Gera e exibe as informações dos carros cadastrados
                    String saida = "";
                    for (Car carro : fabrica.obterCarros()) {
                        saida += InputOutput.gerarInfoCarros(carro);
                    }
                    InputOutput.mostrarInfoCarros(saida);
                    break;
                case 2:
                    // Verifica se há carros cadastrados
                    if (fabrica.obterCarros().isEmpty()) {
                        InputOutput.mostrarMensagemErro("Nenhum carro foi cadastrado ainda.");
                        break;
                    }

                    // Exibe as opções de carros para venda
                    String[] opcoes = new String[fabrica.obterCarros().size() + 1];
                    opcoes[0] = "Escolha o carro que deseja vender";
                    for (int i = 0; i < fabrica.obterCarros().size(); i++) {
                        Car carro = fabrica.obterCarros().get(i);
                        opcoes[i + 1] = carro.getModelo() + " - " + carro.getCor();
                    }
                    int indice = InputOutput.mostrarOpcoes(opcoes);

                    // Remove o carro selecionado da lista
                    if (indice != 0) {
                        fabrica.removerCarro(indice - 1);
                    }
                    break;
                case 3:
                    // Encerra a aplicação
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}