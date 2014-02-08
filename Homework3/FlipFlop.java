import java.util.Scanner;

	class FlipFlop{

   
    public static void main(String[] args) {
      Scanner intro=new Scanner(System.in);
      System.out.println("Ingrese el numero :");
      	                     
      int numeroActual=intro.nextInt();

         
       		 if(numeroActual%3==0){

       		  System.out.print("Flip");

     }  if(numeroActual%5==0){

      		   System.out.print("Flop");

    	 }else

     {
         if((numeroActual%3==0)&&(numeroActual%5==0)){

       		 System.out.println("FlipFlop");
     }
    	else{

      		  System.out.println(numeroActual);
     		}

   	     }
         }

}

