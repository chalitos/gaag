package Servico;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import entidade.conta;
import Main.main;
import Util.Utilmenu;


public class cadastrocontacrug {

		
		public static void CadastrarConta()
		{
			ArrayList <conta> arry = new ArrayList <> (); 
			 while (true) 
			{
				 System.out.println ( "----------------------------------------------------------------");
				 System.out.println ( "               Bem vindo ao Banco inter ");
				 System.out.println ( "----------------------------------------------------------------");
				 System.out.println ( "(1) Adicionar Conta             (2) Listar Contas");
				 System.out.println ( "(3) Alterar senha               (4) Deleter uma conta");
				 System.out.println ( "(5) Menu principal              (6) Fechar o Sistema");
				 System.out.println ( "----------------------------------------------------------------");
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
						 System.out.println ("Muito obrigado e Volte Sempre");
						System.exit(0);
						break;
				}				
			}
		}
		
		public static int add (ArrayList <conta> arry) {
			
			System.out.println ("O ID da Conta será gerado de forma aleatória: "+"\n");
			 String id = String.valueOf(new Random().nextInt(1000)); 
			
			 Scanner num = new Scanner (System.in); 
			 System.out.println ("Crie sua senha");
			 String senha = num.nextLine ();
			 if(senha == ""){
				 System.out.println("Por favor digite uma senha");
				 String senha1 = num.nextLine();
				 senha = senha1;
			  }
			
			 
			 
			 conta s=new conta();
			 s.setsenha(senha);
			 s.setid(id);
			 arry.add(s); 
			 System.out.println("id: "+ s.getid() + "senha: "+ s.getsenha());
			 System.out.println("Conta adicionada com sucesso");
		return 0;
	    }
		
		public static int show(ArrayList <conta> arry) {
			 if (arry.size () == 0) {
				 System.out.println ("Nenhuma Conta foi adicionada");
				return 0;
			}
			 
			 for (int i = 0; i <arry.size (); i ++) {
				conta s=arry.get(i);
				 System.out.println ("ID: "+s.getid());
			 }
			 	System.out.println ("Todas Informações foram passadas corretamente");
			return 0;
		 }
		
		public static int del (ArrayList <conta> arry) {
			 System.out.println ("Coloque o ID do Conta que será deletada: ");
			Scanner input=new Scanner(System.in);
			String str=input.nextLine();
			
			if(arry.size()==0){
				 System.out.println("As informações da Conta não podem ser deletadas");
				return 0;
			}int flag=-1;
			for(int i=0;i<arry.size();i++) {		
				conta s=arry.get(i);
				 if (s.getid().equals(str)) {
					flag=i;
					System.out.println( "ID: "+s.getid());
				}
			}
			if(flag==-1)
				 System.out.println("As informações da Conta não podem ser deletadas");
			else{
				arry.remove(flag);
				 System.out.println("Deletado com sucesso");	
			}return 0;
		}
		
		public static int mod (ArrayList <conta> arry) {
			System.out.println ("Digite o ID da Conta: ");
			Scanner input = new Scanner(System.in);
			String str;
			str=input.nextLine();
			int flag=-1;
			for(int i=0;i<arry.size();i++)
			{		
				conta s=arry.get(i);
				if(s.getid().equals(str)){
					flag = i;
					 System.out.println (" ID: "+s.getid());
				}
			}
				if(flag == -1)
					 System.out.println ("Nenhuma Conta encontrada");
				else{
					System.out.println ("Digite a nova senha: ");
					String score = input.nextLine();
					if(score == ""){
						 System.out.println("Coloque uma senha por favor");
						 String score1 = input.nextLine();
						 score = score1;
					  }
					conta s1 = new conta();
					s1.setid(str);
					s1.setsenha(score);
					arry.set(flag, s1);
					 System.out.println ("Senha alterada com sucesso!");	
				}
			return 0;
		}
		
	}



