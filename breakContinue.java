public class breakContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero ++) {
            if(numero==3)
               continue;
               //não executa somente uma instrução especificada mas continua 
               //diferente do break que para toda a execução 

            System.out.println(numero);
        }
    }
    
}
