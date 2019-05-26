package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);

		System.out.println(conta.saldo);

		boolean conesguiuRetirar = conta.saca(30);
		System.out.println(conesguiuRetirar);
		System.out.println(conta.saldo);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, conta);
		
		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "Eduardo Andrade";
		System.out.println(conta.titular);
	}
}
