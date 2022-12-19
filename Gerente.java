
public class Gerente extends Funcionario {

	private int senha;
	
	public String autentica(int senha) {
		if(this.senha == senha) {
			return "Acesso liberado!";
		}else {
			return "Senha incorreta!";
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificaco() /*assinatura do metodo*/ {
		return super.salario / 2;
	}
	
}
