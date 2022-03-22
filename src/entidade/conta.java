package entidade;
/*Grupo Carlos Eduardo
Antonio*/

public class conta {
	
	String id;
	String senha;
	float saldo;
	
	public conta() {
		
	}
	public conta(String id, float saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public float getsaldo() {
		return saldo;
	}
	public void setsaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getsenha() {
		return senha;
	}
	public void setsenha(String senha) {
		this.senha = senha;
	}
	

}