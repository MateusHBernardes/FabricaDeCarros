package model;

public class Car {
    private String modelo;
    private String cor;

    // Retorna o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Define o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Retorna a cor do carro
    public String getCor() {
        return cor;
    }

    // Define a cor do carro
    public void setCor(String cor) {
        this.cor = cor;
    }
}