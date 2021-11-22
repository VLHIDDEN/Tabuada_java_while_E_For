import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
       
        ///taboada da profesora
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        System.out.println("Tabuada de " + tabuada);
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }



        ///essa taboada você digita o valor e ela retorna o resultado
        //while só não é capaz de criar a taboada da prof porque ele só é infinito no..
        //resultado ou seja, digitou ele responde, novamente ele pede para digitar se digitar ele responde....
        //no for ele repete oque tem dentro no while ele excuta e volta pro inicio
        int i = 1;
        while (i <= 10) {
            int a = 1;
            System.out.println("Tabuada: ");
            int tabuadaJS = scan.nextInt();
            System.out.println("Tabuada de " + tabuadaJS);      
            System.out.println(tabuadaJS + " X " + a + " = " + (tabuadaJS * i));     
            i = i + 1;
        }  


       ///Teste isso 
        //*int i = 1;
        while (i <= 10) {
            int a = 1;
            System.out.println("Valor: ");
            int tabuadaJS = scan.nextInt();
         
            System.out.println("Vezes?: ");
            int tabuadaJS2 = scan.nextInt();
            
            System.out.println("Tabuada de " + tabuadaJS);      
            System.out.println(tabuadaJS + " X " + tabuadaJS2 + " = " + (tabuadaJS * tabuadaJS2));     
            i = i + 1;
        }  */



    }
}
