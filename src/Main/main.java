package Main;
import java.util.Scanner;
import Servico.cadastrocartaocrug;
import Servico.cadastrocontacrug;
import Servico.Cadastrocrug;
import Util.Utiltela;

	public class main {
		public static void main(String[]args) {

		    
		    System.out.println ( "------------------------------------------------------------------------");
		    System.out.println ( "                  Bem vindo ao Banco inter");
		    System.out.println ( "------------------------------------------------------------------------");
		    System.out.println ( "(1) Sistemas de Usuario                 (2) Sistem de Conta");
		    System.out.println ( "(3) Sistemas de Cart�o                  (4) Limpar Tela                  ");
		    System.out.println ( "(0) Sair");
			System.out.println ( "------------------------------------------------------------------------");
			System.out.println ( "Porfavor escolha uma das op��es acima:" + "\n");
		
				int opcao;
				Scanner numero = new Scanner(System.in);
				opcao = numero.nextInt();
				switch(opcao){
				case 1:
					Cadastrocrug.CadastrarUsuario();
					break;
				
				case 2:
					cadastrocontacrug.CadastrarConta();
					break;
				
				case 3:
					cadastrocartaocrug.CadastrarCartao();
					break;	
				case 4:
					Utiltela.LimpaTela();
					break;
				
				case 0:
					System.out.println ( "Obrigado por nos Escolher!");
					System.exit(0);
					break;
				
				default:
		        	System.out.println("Voc� escreveu uma op��o errada, escreva uma das op��es do menu" + "\n");}
				} 
			 }



