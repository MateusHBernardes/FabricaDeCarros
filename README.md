# Aplicação Java 🚗  

Este repositório contém uma aplicação Java simples para gerenciamento de carros, estruturada em um padrão MVC (Model-View-Controller).  

## 📂 Estrutura do Projeto  

```
.vscode/             # Configurações do VS Code  
  ├── settings.json  

bin/                 # Arquivos compilados  
  ├── App.class  
  ├── controller/Controller.class  
  ├── model/Car.class  
  ├── model/Fabric.class  
  ├── view/InputOutput.class  

src/                 # Código-fonte  
  ├── App.java  
  ├── controller/Controller.java  
  ├── model/Car.java  
  ├── model/Fabric.java  
  ├── view/InputOutput.java  

README.md            # Documentação do projeto  
```  

## 🏗️ Componentes do Projeto  

- **`controller.Controller`**  
  Controla o fluxo da aplicação, gerenciando as interações entre o modelo (`model`) e a visão (`view`).  

- **`model.Car`**  
  Representa um carro, contendo atributos como modelo e cor.  

- **`model.Fabric`**  
  Gerencia uma lista de carros, permitindo adicionar e remover veículos.  

- **`view.InputOutput`**  
  Responsável pela interação com o usuário, utilizando `JOptionPane` para exibir menus e mensagens.  

## 🚀 Como Executar  

### 1️⃣ Pré-requisitos  
- Certifique-se de ter o **Java Development Kit (JDK)** instalado.  

### 2️⃣ Compilar as Classes Java  
Abra um terminal na raiz do projeto e execute:  
```sh
javac -d bin src/**/*.java
```  

### 3️⃣ Executar a Aplicação  
Após a compilação, execute o seguinte comando:  
```sh
java -cp bin App
```  