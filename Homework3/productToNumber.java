class productToNumber {

   
    public static void main(String[] args) {

       		 int numero = 8;
        
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