public class estruturaForArray {
    public static void main(String[] args) {
        String alunos [] = {"Stephen", "Gamora", "Tony", "Natasha"};
        //cada elemento fica dentro das chaves separdo por uma virgula

        for (int x=0; x<alunos.length; x++) {
            //criação de variavel x que se inicializa em 0 e adiciona 1 a cada vez 
            //length diz que enquanto a var x for menor que o numero de alunos existentes no sistema,o x é incrementado 
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
            //informa ao usuario o numero do indice em que cada aluno está 
        }
    }
}