package contas;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, String titular){
        super(numero, titular);
    }

    @Override
    public void sacar(double valor){
        double valorTotal = valor + 0.50;

        if(valorTotal > this.saldo){
            System.out.println("Saldo insuficiente para saque + taxa.");
        } else {
            this.saldo -= valorTotal;
            System.out.println("Saque realizado! Taxa de R$0.50 cobrada.");
            System.out.println("Novo saldo: " + this.saldo);
        }
    }
}
