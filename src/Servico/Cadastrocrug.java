package Servico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import entidade.Usuario;
import entidade.conta;
import Util.Utilmenu;

public class Cadastrocrug {


		
	public static void CadastrarUsuario(){
			ArrayList <Usuario> arry = new ArrayList <Usuario> (); 
			 while (true) 
			{
				 System.out.println ( "------------------------------------------------------------------------");
				 System.out.println ( "                   Bem vindo ao Banco inter");
				 System.out.println ( "------------------------------------------------------------------------");
				 System.out.println ( "(1) Adicionar Usuario               (2) Listar  Usuarios");
				 System.out.println ( "(3) Modificar um Usuario            (4) Deleter um  Usuario");
				 System.out.println ( "(5) Menu principal                  (6) Fechar Sistema");
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
						 System.out.println ( "Muito obrigado e Volte Sempre");
						System.exit(0);
						break;
				}			
			}
		}
		
		public static int add (ArrayList <Usuario> arry) {
		
			 Scanner num = new Scanner (System.in); 
			 System.out.println ("Digite o nome do Usuario:");
			 String nome = num.nextLine(); 
			 if(nome == ""){
				 System.out.println("Coloque um nome por favor");
				 String nomeU = num.nextLine();
				 nome = nomeU;
			  }
			
			 
			 System.out.println ("Digite o CPF do Usuario:");
			 String cpf = num.nextLine();
			 if(cpf == "") {
				 System.out.println("Coloque um Cpf por favor ");
				 String cpfU = num.nextLine();
				 cpf = cpfU;
			 }
			 
			 Usuario u = new Usuario();
			 
			 u.setNome(nome);
			 u.setCpf(cpf);


			 arry.add(u);
			 
			 System.out.println (" Usuario: "+" "+ u.getNome()+" "+" CPF: "+u.getCpf()+"\n");
			 System.out.println ("Usuario adicionado com sucesso!");
		return 0;
	   }
		
		public static int show (ArrayList <Usuario> arry) {
			 if (arry.size () == 0) {
				 System.out.println ("Nenhum Usuario cadastrado no sistema");
				return 0;
			}
			 
			 for (int i = 0; i <arry.size (); i ++) {
				 Usuario s = arry.get(i);
				 System.out.println (" Usuario: "+" "+ s.getNome() + "  CPF: "+s.getCpf());
				 
	
			 }
				System.out.println ("Todas Informações foram passadas corretamente");
			 
			return 0;
		 }
		
		public static int del (ArrayList <Usuario> arry) {
			 System.out.println ("Coloque o Cpf do Usuario que você deseja deletar: ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			
			if(arry.size() == 0){
				 System.out.println ("Não existe Usuario cadastrado no momento");
				return 0;
			}int flag = -1;
			for(int i = 0; i<arry.size(); i++) {		
				Usuario s = arry.get(i);
				 if (s.getCpf().equals(str)) {
					flag = i;
					System.out.println (" Usuario:"+s.getNome()+" "+" CPF: "+s.getCpf());
				}
			}
			if(flag == -1)
				 System.out.println ("As informações do Usuario não podem ser deletadas no momento");
			else{
				arry.remove(flag);
				 System.out.println ("Deletado com sucesso!");	
			}return 0;
		}
		
		public static int mod (ArrayList <Usuario> arry) {
			System.out.println ("Digite o Cpf do Usuario: ");
			Scanner input = new Scanner(System.in);
			String str;
			str = input.nextLine();
			int flag = -1;
			for(int i = 0;i<arry.size();i++)
			{		
				Usuario s = arry.get(i);
				if(s.getCpf().equals(str)){
					flag = i;
					 System.out.println (" Usuario: "+" "+ s.getNome()+" "+" CPF: "+s.getCpf());
				}
			}
				if(flag == -1)
					 System.out.println ("Não existe nenhum Usuario com essas informações no momento ");
				else{
					System.out.println ("Insira a alteração que você deseja fazer no Nome: ");
					String nm=input.nextLine();
					if(nm == ""){
						 System.out.println("Coloque um nome por favor");
						 String nm1 = input.nextLine();
						 nm = nm1;
					  }
					System.out.println ("Insira a alteração que você deseja fazer no CPF: ");
					String cp=input.nextLine();
					if(cp == ""){
						 System.out.println("Coloque o Cpf por favor ");
						 String cp1 = input.nextLine();
						 cp = cp1;
					  }
					
					Usuario s1 =new Usuario();
					s1.setCpf(cp);
					s1.setNome(nm);
					arry.set(flag, s1);
					 System.out.println ("Informação modificada com sucesso!");	
				}
			return 0;
		}


		}
	


