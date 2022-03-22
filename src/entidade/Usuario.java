package entidade;
/*Grupo Carlos Eduardo
Antonio*/

public class Usuario{
	
	int idade;
	String nome;
	String cpf;

		public Usuario () {
			
		}
		public Usuario(int idade, String nome,String cpf) {
			super();
			this.cpf = cpf;
			this.idade = idade;
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
}

