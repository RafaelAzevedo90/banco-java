
public class ContaPoupanca extends Conta{
	@Override
	public void extrato() {
			System.out.println("Extrato da Conta Poupanca");
			super.extratodeconta();
	}
}
