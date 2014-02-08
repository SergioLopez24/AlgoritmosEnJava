import java.util.Scanner;

class rangeSum{

   
    public static void main(String[] args) {
      Scanner intro=new Scanner(System.in);
      System.out.println("Ingrese el valor del rago");
      	 
           System.out.println("Ingrese el valor inicial del rango : ");
       int inicioRango=intro.nextInt();
            System.out.println("Ingrese el valor final del rango : ");
       int finRango=intro.nextInt();

       
       System.out.print("El rango del intervalo es de: ");

       
       for (int i=inicioRango; i<=finRango; i++){

           
          System.out.print(i+"  "); 

      		 }

                   
	   }

}