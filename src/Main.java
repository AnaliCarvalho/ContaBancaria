import java.util.ArrayList;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(444544, 7800.12);
        ContaBancaria conta2 = new ContaBancaria(458871, 4500.12);
        ContaBancaria conta3 = new ContaBancaria(100041, 7500.15);
        ContaBancaria conta4 = new ContaBancaria(225874, 120.25);
        ContaBancaria conta5 = new ContaBancaria(100548, 28054.10);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);
        listaContas.add(conta5);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        ContaBancaria contaMenorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() < contaMenorSaldo.getSaldo()) {
                contaMenorSaldo = conta;
            }
        }

        System.out.println("**** CONTA COM O MAIOR SALDO ****\n");
        System.out.println("Número: " + contaMaiorSaldo.getNumeroDaConta() + "\nSaldo: R$ " + contaMaiorSaldo.getSaldo());
        System.out.println("\n**** CONTA COM O MENOR SALDO ****\n");
        System.out.println("Número da menor conta: " + contaMenorSaldo.getNumeroDaConta() + "\nSaldo: R$ " + contaMenorSaldo.getSaldo());




    }
}