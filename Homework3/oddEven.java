import java.util.Scanner;

 	class oddEven{

   
    public static void main(String[] args) {
      Scanner intro=new Scanner(System.in);
      System.out.println("Ingrese el numero :");
      	              
      	  int numero=intro.nextInt();
      
      if(numero%2==0){
   		
                System.out.println("numero es par");

      }else{
   		
                System.out.println("numero es impar");

 		  }

 	  }

}