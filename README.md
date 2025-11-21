# MiniBanco Digital – Projeto Capstone em Java

Um sistema bancário simples feito no console, criado para consolidar os fundamentos essenciais de Java e Programação Orientada a Objetos.  
Aqui se unem abstração, herança, polimorfismo, interfaces, exceções e estrutura de dados — tudo em um único projeto.

---

## Enunciado Oficial do Desafio

Crie um sistema bancário em Java que funcione totalmente pelo console.  
Este projeto deve demonstrar domínio sólido dos pilares fundamentais da linguagem.

---

## Requisitos Técnicos

### **1. Classe Abstrata – Conta**
- Atributos:
  - `numero`
  - `titular`
  - `saldo` (protegido)
- Métodos:
  - `depositar(double valor)`
  - `sacar(double valor)` — polimórfico
- Construtor adequado

---

### **2. Herança**
Crie duas subclasses:

#### **ContaCorrente**
- Cobra uma taxa fixa por saque (ex.: R$0,50)

#### **ContaPoupanca**
- Saque normal, sem taxa

---

### **3. Interface – IImprimivel**
Método obrigatório:

```java
void mostrarDados();
````

As contas devem implementar essa interface para exibir número, titular e saldo.

---

### **4. Classe Banco (main)**

Use `ArrayList<Conta>` para armazenar as contas.
O menu deve conter:

```
1. Criar Conta
2. Depositar
3. Sacar
4. Listar Contas
5. Sair
```

---

### **5. Tratamento de Erros**

* Impedir saque maior que o saldo
* Impedir entradas inválidas (ex.: letras no menu)
* (Opcional) Criar exceções customizadas

---

## Estrutura do Projeto

```
src/
  banco/
      Banco.java
  contas/
      Conta.java
      ContaCorrente.java
      ContaPoupanca.java
  interfaces/
      IImprimivel.java

bin/   (ignorado pelo Git)
```

---

## Como Compilar e Executar

### **Via Terminal (recomendado)**

Compile todos os arquivos:

```bash
javac -d bin src/**/*.java
```

Execute o programa:

```bash
java -cp bin banco.Banco
```

---

## Objetivo do Projeto

Este capstone reforça:

* Estruturação correta de pacotes
* Abstração, herança e polimorfismo
* Encapsulamento
* Interfaces
* ArrayList
* Menus interativos
* Tratamento de exceções
* Organização e boas práticas de Java

Completar este projeto é o passo final para afirmar com confiança:
**“Eu domino o básico de Java.”**

---

## 📜 Licença

MIT — livre para estudar, modificar e evoluir.
