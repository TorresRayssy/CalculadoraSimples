package calculadora;
    import java.util.Scanner;
    //Desenvolver uma calculadora aritmética para realizar as quatro operações básicas.
    
public class Calculadora {
        
  public static void main(String[] args) {
    float n1, n2,r;
    String OP;
    char op;
    Scanner teclado = new Scanner(System.in);

    while(true){
        System.out.println("[+] - Adição\n[-] - Subtração\n"
        + "[*] - Multiplicação\n[/] - Divisão\n[s] - sair");
        System.out.print("Digitar a operação desejada <-");
        OP=teclado.next();//Recebe String
        op=OP.charAt(0);//Conversão de String para char

    switch(op){
   
      case '+':
       System.out.println("Digite dois números");
       n1 = teclado.nextFloat();
       n2 = teclado.nextFloat();
       r = n1 + n2;
       System.out.println("Resultado: " + r);
       break;       

      case '-':
       System.out.println("Digite dois números");
       n1 = teclado.nextFloat();
       n2 = teclado.nextFloat();
       r = n1 - n2;
       System.out.println("Resultado: " + r);
       break;
      
      case '*':
       System.out.println("Digite dois números");
       n1 = teclado.nextFloat();
       n2 = teclado.nextFloat();
       r = n1 * n2;
       System.out.println("Resultado: " + r);
       break;
    
      case '/':
       System.out.println("Digite dois números");
       n1 = teclado.nextFloat();
       n2 = teclado.nextFloat();

       if(n2==0){
         System.out.println("Divisão por zero");
       }else{
         r = n1 / n2;
         System.out.println("Resultado: " + r);
       }

       break;
    
      case 's':
          System.out.println("Aplicativo encerrado");
          System.exit(0);//Parar o programa
          break;
       
      default:
       System.out.println("Operação inválida!");
      
    }
   }
  }

}