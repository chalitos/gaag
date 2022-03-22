package entidade;
/*Grupo Carlos Eduardo
Antonio*/

public class Cartao {
		
		String numero;
		String senha;
	    String cvv;
	    int vencimento_mes;
	    int vencimento_ano;
	    
	    public Cartao () {
	    	
	    }
	    public Cartao(String numero, String senha, String cvv, int vencimento_mes, int vencimento_ano) {
	    	super();
	    	this.numero = numero;
	    	this.senha = senha;
	    	this.cvv = cvv;
	    	this.vencimento_mes = vencimento_mes;
	    	this.vencimento_ano = vencimento_ano;
	    }
		public String getnumero() {
			return numero;
		}
		public void setnumero(String numero) {
			this.numero = numero;
		}
		public String getsenha() {
			return senha;
		}
		public void setsenha(String senha) {
			this.senha = senha;
		}
		public String getcvv() {
			return cvv;
		}
		public void setcvv(String cvv) {
			this.cvv = cvv;
		}
		public int getvencimento_mes() {
			return vencimento_mes;
		}
		public void setvencimento_mes(int vencimento_mes) {
			this.vencimento_mes = vencimento_mes;
		}
		public int getvencimento_ano() {
			return vencimento_ano;
		}
		public void setvencimento_ano(int vencimento_ano) {
			this.vencimento_ano = vencimento_ano;
		}
		
	    
	}

