import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//pacote importado que escolhe números pseudo-aleatorios
public class processoSeletivo {
    public static void main(String[] args) { 
      String [] candidatosSelecionados = {"Zemo","Sam","Natasha","Peter","Tony"};
      //primeiro um for para selecionar os candidatos
      for(String candidato: candidatosSelecionados) {
        entrandoEmContato(candidato);

        }
    }

    //metodo para entrar em contato com os candidatos selecionados
    static void entrandoEmContato(String candidatoString) {
      //variaveis que sofrem alterações em algum momento
       int tentativasRealizadas = 1;
       //tentou uma vez 
       boolean continuarTentando = true;
       boolean atendeu=false;
       //candidato não atendeu
       do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            //se continuar tentando
                tentativasRealizadas++;
                //soma mais uma tentativa realizada
            else
            //e se o continuar tentando não for falso 
            System.out.println("Contato realizado com sucesso");
        
       }while(continuarTentando && tentativasRealizadas<3);

       if(atendeu)
           System.out.println("Conseguimos contato com " + candidatoString + " na" + tentativasRealizadas + " tentativa.");
        else 
            System.out.println("Não conseguimos contato com" + candidatoString+ ", numero de máximo de tentativas " + tentativasRealizadas + " realizadas.");
    }

    //metodo auxiliar do entrar em contato
    static boolean atender() {
      return new Random().nextInt(3)==1;
    }

    // metodo que imprime a lista dos candidatos selecionados 
    static void imprimirSelecionados() {
      String [] candidatos = {"Natasha","Steve", "Zemo", "Sam" };
      System.out.println("Imprimindo a lista de cadidatos selecionados informando o indice do elemento");
      
      for (int indice=0; indice < candidatos.length;indice++) {
      //o indice começa pelo 0 e tem que ser menor que o array de candidatos
        System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
      }
      

     }

    //metodo para fazer a seleção dos candidatos 
    static void seleçãoCandidatos() {
    //array com a lista dos candidatos 
    String [] candidatos = {"Tony", "Natasha", "Peter", "Bruce", "Steve", "Bucky", "Zemo", "Sam"};
    
    //faz a contagem dos selecionados começando do 0
    int candidatosSelecionados = 0;
    //indice do array que começa em 0 e vai incrementando
    int candidatosAtual=0;
    double salarioBase=2000.0;

    //enquanto os candidatos selecionados forem menor que 5 
    //o algoritmo vai continuar buscando mais candidatos 
    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();
        //retorna o valor do salário pretendido do candidado

        System.out.println("O candidato " + candidato + " solicitou este valor salarial " + salarioPretendido);
        if(salarioBase >= salarioPretendido) {
          //se o salario base for maior ou igual ao salario pretendido do candidato
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            //informe que o candidato foi selecionado
           candidatosSelecionados++;
           // contador que adiciona o candidato na lista de selecionados 
        }

        candidatosAtual++;
        //contador que faz a verificação dos candidatos do array
      
    }          
    } 
    
    //metodo do valorpretendido 
    static double valorPretendido() {
      return ThreadLocalRandom.current().nextDouble(1800, 2200);
      //retorna um valor pretendido aleátorio entre 1800 e 2200 para cada candidato
    }
    
    //metodo para analisar os candidatos 
    static void analisarCandidatos(double salarioPretendido) {
    //o parametro vai ser preenchido pelo usuario e armazenado na variavel salarioPretendido
      double salarioBase = 2000.0;
      //2000 no formato americano 
      if(salarioBase > salarioPretendido) {
        //se o salario base for maior que o pretendido retorna 
        System.out.println("Ligar para o cadidato");
      }else if(salarioBase == salarioPretendido)
      //se o salário  base for igual ao salario pretendido retorna
       System.out.println("Ligar com contra proposta");
      else {
        //se não,retorna
        System.out.println("Aguardando demais candidatos");
      }
    }

  
}
