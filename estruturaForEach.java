public class estruturaForEach {
    public static void main(String[] args) {
        String alunos [] = {"Stephen", "Gamora", "Tony", "Natasha"};

        for(String aluno : alunos){
            // : quer dizer que a cada interação de alunos o aluno atual do indice vai atualizar aumaticamente a var
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
    
}
