import java.util.*;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CPF e o CNPJ: ");
        PersonIndividual pI = new PersonIndividual(scanner.nextLine());
        PersonLegal pL = new PersonLegal(scanner.nextLine());
        System.out.println(pI.isValid());
        System.out.println(pL.isValid());
        scanner.close();
    }
}
