package controller;

import model.Car;
import model.Fabric;
import view.InputOutput;

public class Controller {
    
    Fabric fabrica = new Fabric();

    
    public void iniciarAplicacao() {
        while (true) {
            
            int opcao = InputOutput.mostrarOpcoes(new String[] {"Adicionar carros", "Listar carros", "Vender carros", "Sair"});

            switch (opcao) {
                case 0 -> {
                    // Solicita a quantidade de carros a serem adicionados
                    int quantidade = InputOutput.perguntarQuantidadeCarros();
                    while (quantidade <= 0) {
                        
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
                }
                case 1 -> {
                    
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
                }
                case 2 -> {
                    
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

                    
                    if (indice != 0) {
                        fabrica.removerCarro(indice - 1);
                    }
                }
                case 3 ->
                    System.exit(0);
                default -> {
                }
            }
        }
    }
}