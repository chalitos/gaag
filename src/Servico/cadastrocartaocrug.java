package Servico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import entidade.Cartao;
import Main.main;
import Util.Utilmenu;
public class cadastrocartaocrug {

	public static void CadastrarCartao()
	{
		ArrayList <Cartao> arry = new ArrayList <> (); 
		 while (true) 
		{
			 System.out.println ( "------------------------------------------------------------------------");
			 System.out.println ( "                     Bem vindo ao Banco inter ");
			 System.out.println ( "------------------------------------------------------------------------");
			 System.out.println ( "(1) Adicionar Cartão                 (2) Listar Cartões");
			 System.out.println ( "(3) Alterar sua senha                (4) Cancelar Cartão");
			 System.out.println ( "(5) Menu principal                   (6) Fechar Sistema");
			 System.out.println ( "------------------------------------------------------------------------");
			 System.out.println ( "Porfavor escolha uma das opções acima:");
			 Scanner number = new Scanner (System.in);
			 int stu = number.nextInt ();
			 switch(stu){
				case 1:
					add(arry);
					break;
				case 2:
					show(arry);
					break;
				case 3:
					mod(arry);
					break;
				case 4:
					del(arry);
					break;
				case 5:
					Utilmenu.callMenu();
					break;
				case 6:
					 System.out.println ( "Muito Obrigado e Volte Sempre");
					System.exit(0);
					break;
			}			
		}
	}
	
	public static int add (ArrayList <Cartao> arry) {
		
		System.out.println ("O seu CVV sera gerado de forma automática"+"\n");
		 String cvv = String.valueOf(new Random().nextInt(1000));
		 System.out.println ("O numero de seu Cartão sera gerado de forma automática"+"\n");
		 String numb = String.valueOf(new Random().nextInt(1000));
		 
		 Scanner num = new Scanner (System.in); 
		 System.out.println ("Crie sua senha: ");
		 String senha = num.nextLine(); 
		 if(senha == ""){
			 System.out.println("Por favor digite uma senha");
			 String senhac = num.nextLine();
			 senha = senhac;
		  }
		
		 
		 Cartao s=new Cartao();
		 
		 s.setcvv(cvv);
		 s.setnumero(numb);
		 s.setsenha(senha);
		 arry.add(s);
		 System.out.println("Número de Cartão: "+s.getnumero()+" "+" CVV: "+s.getcvv()+" "+" Senha: "+s.getsenha()+"\n");
		 System.out.println("Cartão registrado com sucesso!");
	return 0;
   }
	
	public static int show (ArrayList <Cartao> arry) {
		 if (arry.size () == 0) {
			 System.out.println ("Nenhum Cartão registrado");
			return 0;
		}
		 
		 for (int i = 0; i <arry.size (); i ++) {
			 Cartao s=arry.get(i);
			 System.out.println ("Numero de Cartão: "+s.getnumero() );
		 }
		 	System.out.println ("Todas Informações foram passadas com sucesso");
		return 0;
	 }
	
	public static int del (ArrayList <Cartao> arry) {
		 System.out.println ("Coloque o numero do cartão que você deseja cancelar: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		if(arry.size() == 0){
			 System.out.println ("Não existe cartão cadastrado");
			return 0;
		}int flag = -1;
		for(int i = 0; i<arry.size(); i++) {		
			Cartao s = arry.get(i);
			 if (s.getnumero().equals(str)) {
				flag = i;
				System.out.println ("Cartão: "+s.getnumero());
			}
		}
		if(flag == -1)
			 System.out.println ( "Este cartão não pode ser cancelado");
		else{
			arry.remove(flag);
			 System.out.println ( "Cancelamento do cartão realizado com sucesso!");	
		}return 0;
	}
	
	public static int mod (ArrayList <Cartao> arry) {
		System.out.println ("Digite o número do cartão: ");
		Scanner input = new Scanner(System.in);
		String str;
		str = input.nextLine();
		int flag = -1;
		for(int i = 0; i<arry.size(); i++)
		{		
			Cartao s = arry.get(i);
			if(s.getnumero().equals(str)){
				flag = i;
				 System.out.println("Cartão: "+s.getnumero());
			}
		}
			if(flag == -1)
				 System.out.println( "Não existe cartão cadastrado ");
			else{
				System.out.println( "Modifique a senha deste cartão ");
				String score=input.nextLine();
				if(score == ""){
					 System.out.println("Por favor digite uma senha");
					 String score1 = input.nextLine();
					 score = score1;
				  }
				
				Cartao s1 = new Cartao();
				s1.setnumero(str);
				s1.setsenha(score);
				arry.set(flag, s1);
				 System.out.println ( "Senha modificada com sucesso");	
			}
		return 0;
	}

}


