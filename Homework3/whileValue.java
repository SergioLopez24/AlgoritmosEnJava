import java.util.Scanner;

class whileValue{

   
    public static void main(String[] args) {
      Scanner intro=new Scanner(System.in);
      System.out.println("Ingrese el valor : ");
      	int num=intro.nextInt();
   
   int contador=0;
   System.out.println("valor ingresado "+num);
   System.out.println("valores anteriones al valor ingresado :");

   while(contador<num){
   
       System.out.println("el valor actual es: "+contador);
    contador++;
   }
       
             
      
   }

}