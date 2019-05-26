// Contrato autenticavel
// quem assina o contrato, precisa implementar os metodos
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
