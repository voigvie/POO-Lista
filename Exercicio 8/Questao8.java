import java.util.*;

public class Questao8 {
    static final int QUANTIDADE_DE_NOTAS = 5;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Qual a quantidade de alunos que serão listados? ");
        int quantidadeDeAlunos = scanner.nextInt();

        ArrayList<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i < quantidadeDeAlunos; i++) {
            alunos.add(getAluno());
            quantidadeDeAlunos--;
        }
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private static Aluno getAluno() {
        System.out.println("Qual o nome do aluno? ");
        scanner.nextLine();
        String nomeCompleto = scanner.nextLine();
        System.out.println("Qual o número de matrícula do aluno? ");
        String numeroDeMatricula = scanner.next();
        ArrayList<Nota> notas = getNotas();
        return new Aluno(nomeCompleto, numeroDeMatricula, notas);
    }

    private static ArrayList<Nota> getNotas() {
        ArrayList<Nota> notas = new ArrayList<>();
        for (int j = 0; j < QUANTIDADE_DE_NOTAS; j++) {
            System.out.println("Qual o nome do assunto? ");
            String nomeDoAssunto = scanner.next();
            System.out.println("Qual o valor da nota? ");
            double valor = scanner.nextDouble();
            notas.add(new Nota(valor, nomeDoAssunto));
        }
        return notas;
    }
}
