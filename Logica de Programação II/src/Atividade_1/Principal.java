package Atividade_1;

public class Principal {
	public static void main(String args[]) {
		Cliente cliente_01 = new Cliente();
		String cpf = "02850435902";
		int anoNascimento = 1980;
		String nome = "Marcos da Rocha Souza";
		String email = "mr_souza@gmail.com";

		Conta conta_01 = new Conta();
		int numero = 1521;
		float saldo = (float) 750.63;

		System.out.println(cliente_01.retornaCliente());
	}

}
