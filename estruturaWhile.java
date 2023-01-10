import java.util.concurrent.ThreadLocalRandom;

public class estruturaWhile {
    public static void main(String[] args) {
      //Peter Park recebeu R$50,00 de mesada de Tony e foi na loja de lego gastar o dinheiro
      //enquanto o valor não chegar a R$50,00 ele pode ir adicionando o que quiser 
     double mesada = 50.0;
     
     while(mesada>0) {
      //enquanto o valor da mesada dor maior que 0
        double valorlego = valorAleatorio();
        //Peter vai pegar um lego com valor aleatorio
        if(valorlego > mesada)
        //se o valor do lego for maior que a mesada
           valorlego = mesada;
           //automaticamente tornamos o valor do lego igual ao da mesada

        System.out.println("Lego de valor: " + valorlego + "Adiconado no carrinho");
        mesada = mesada - valorlego;
        //subtrai o valor do lego adicionado ao valor da mesada
        //até que o valor da mesada chegue a zero
       }

       System.out.println("Mesada:" + mesada);
       System.out.println("Peter gastou toda a sua mesada");
       

    }
    private static double valorAleatorio() {
      return ThreadLocalRandom.current().nextDouble(2,15);
      //o valor dos legos varia de 2 a 15
    }
}
