import java.util.Scanner;
public class Info {
    private float n1,n2;
    private char resp='S';

    public void info(){
        System.out.println("\u001B[36m -=-=-=-=-=-=CALCULADORA-=-=-=-=-=-=");
        Scanner leitor = new Scanner(System.in);
  
        while(resp == 'S' || resp=='s'){
        
        System.out.print("Digite o primeiro número: ");
         n1= leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
         n2= leitor.nextFloat();

         System.out.println("");

        System.out.println("Qual operação deseja utilizar? ");
        System.out.println("[1] = Adição || [2] = Subtração || [3] = Multiplicação || [4]= Divisão || [5] = Sair");
        System.out.print("Digite o número desejado para realizar: ");
        String operação= leitor.next();

        switch(operação){
            case "1":
                 Soma soma = new Soma(n1, n2);     
                 System.out.printf("\u001B[32m %.2f + %.2f = %.2f \n", n1,n2,soma.calcular());           
                 break;
           
            case "2":
            
                 Subtracao subtracao = new Subtracao(n1, n2);
                 System.out.printf("\u001B[32m %.2f - %.2f = %.2f \n", n1,n2,subtracao.calcular());
                 break;
           
            case "3":
                 Multiplicacao multiplicacao = new Multiplicacao(n1, n2);
                 System.out.printf("\u001B[32m %.2f x %.2f = %.2f \n", n1,n2,multiplicacao.calcular());
                 break;
            
            case "4":
                 Divisao divisao = new Divisao(n1,n2);
                 System.out.printf("\u001B[32m %.2f / %.2f = %.2f \n ", n1,n2, divisao.calcular());
                 break;
             
            case "5":
                System.out.println("Você saiu da calculadora.");
                break;

            default:
            System.out.println("");
                System.out.println("Não há esta opção para escolher no painel de operações");
                break;
                
                
              
        }
        System.out.print("\u001B[36m Deseja continuar? [S] = sim || [N]= não ---- : ");
        resp=leitor.next().charAt(0);   
      
        
        while(resp!='N' || resp!='n' || resp!='S' || resp!='s'){
            if(resp=='S' || resp=='s'){
                break;
            }else{
                if(resp=='N' || resp=='n'){
                    System.out.println("Fim do Sistema!");
                    break;
            }
         System.out.print("\u001B[36m Não existe está opção, Deseja continuar? [S] = sim || [N]= não ---- : ");
         resp=leitor.next().charAt(0);
            } 
        }
      

        
    
     

   
       

    }
   
    }
    
   

    }

