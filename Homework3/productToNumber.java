import java.util.Scanner;

 class productToNumber {

   
    public static void main(String[] args) {
      Scanner intro=new Scanner(System.in);
      System.out.println("Ingrese el numero :");
      	        
 
        int numero = intro.nextInt();
        
        int factorial = 1;
        
    System.out.println("Numero :"+numero);
    System.out.print("Numeros Anteriores: ");
       
    for(int i=1; i<=numero; i++){
            System.out.print(i+" ");
            
        }
       
            
        while(numero != 0)
        {
           
            factorial *= numero;
            numero--; 
           
        }
    
         
        System.out.print("= Factorial: " + factorial); 
    }  

}