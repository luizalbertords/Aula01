package Atividade_1;

public class Cliente {

	public String cpf;
	public int anoNascimento;
	public String nome;
	public String email;
	
	
	public String retornaCliente(){
	return "CPF: "+this.cpf+ ", Ano de nascimento: "+this.anoNascimento+"Nome: "+this.nome+"E-mail: "+this.email;
	}
	
}
