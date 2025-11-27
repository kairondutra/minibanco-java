package banco;

import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {

        // Testes
        ContaCorrente corrente = new ContaCorrente(111, "Kairon");
        ContaPoupanca poupanca = new ContaPoupanca(999, "Dutra");

        corrente.depositar(3000);
        poupanca.depositar(10000);

        corrente.mostrarDados();
        poupanca.mostrarDados();

    }
}
