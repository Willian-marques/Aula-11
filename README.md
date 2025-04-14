# Sistema de Autenticação com Interface em Java

Este projeto é um exemplo simples de implementação de autenticação usando **interfaces em Java**. Ele demonstra os princípios de **Programação Orientada a Objetos (POO)**, como **polimorfismo**, **encapsulamento** e o uso de **interfaces como contrato**.

## 🧠 Conceitos Aplicados

- **Interface (`Autenticavel`)**: Define um contrato com o método `autenticar` que deve ser implementado por qualquer classe que deseje ser "autenticável".
- **Implementação de Interface**: Classes `Administrador` e `cliente` implementam o método `autenticar`.
- **Polimorfismo**: O sistema manipula os objetos `Administrador` e `cliente` através do tipo da interface `Autenticavel`.
- **Simulação de Login**: O login é simulado com usuários e senhas fixos.

## 🗂 Estrutura do Projeto

```
src/
│
├── Autenticavel.java         # Interface que define o contrato de autenticação
├── Administrador.java        # Classe que implementa a interface Autenticavel
├── cliente.java              # Outra classe que também implementa a interface
└── SistemaLogin.java         # Classe principal que executa o login
```

## 🚀 Como Executar

1. Certifique-se de ter o **Java instalado** (JDK 8 ou superior).
2. Compile os arquivos:
   ```bash
   javac *.java
   ```
3. Execute a classe principal:
   ```bash
   java SistemaLogin
   ```

## 🔐 Usuários e Senhas Fixos

- **Administrador**
  - Usuário: `admin`
  - Senha: `123`

- **Cliente**
  - Usuário: `cliente`
  - Senha: `abc`

## ✍️ Autor

Este projeto foi desenvolvido como exemplo educacional para demonstrar conceitos de orientação a objetos em Java.