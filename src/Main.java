
public class Main {

	public static void main(String[] args) {
		Conta ccorrente = new ContaCorrente();
		ccorrente.depositar(95.40);
		Conta cpoupanca = new ContaPoupanca();
		ccorrente.transferir(50.12, cpoupanca);
		
		ccorrente.extratodeconta();
		cpoupanca.extratodeconta();
	}

}
