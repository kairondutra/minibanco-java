package contas;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular){
        super(numero, titular);
    }

    @Override
    public void sacar(double valor) {
        if(valor > this.saldo){
            System.out.println("Não é possivel fazer o saque, valor indisponivel.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado! ");
            System.out.println("Novo saldo: " + this.saldo);
        }
    }
}
