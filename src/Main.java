package src;
public class Main {

    public static void main(String[] args) {
        
        var cliente = new Cliente();
        cliente.setNome("maria");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(400);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
