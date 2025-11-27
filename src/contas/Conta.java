package contas;
import interfaces.IImprimivel;

public abstract class Conta implements IImprimivel {
    // atributos
    private int numero;
    private String titular;
    protected double saldo;

    // construtor
    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    // getters e setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // métodos própios
    public void depositar(double valor){
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    @Override
    public void mostrarDados() {
        System.out.println(
            "Número: " + numero +
            " | Titular: " + titular +
            " | Saldo: " + saldo
        );
    }

}
