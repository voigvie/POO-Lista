import java.util.Date;

public class Questao10 {
    public static void main(String[] args) {
        Sistema s = new Sistema();
        Outlook h = new Outlook(s);
        
        Funcionario fun1 = new Funcionario("Giovanna", "Designer", "21112709", "gialmv@Outlook.com");
        Funcionario fun2 = new Funcionario("Arthur", "Venda", "25811957", "arthur.v@Outlook.com");

        s.addFuncionario(fun1);
        s.addFuncionario(fun2);

        Email m = new Email("Requisição", "Gostaria de saber como está indo a arte do evento do fim de semana", fun2, fun1, new Date());
        h.sendEmail(m);

        for (Funcionario f : s.funcionarios) {
            System.out.println(f.getName());
            System.out.println(f.getEmail());
            System.out.println("caixa de entrada");
            for(Email emailRecebido : f.getEmailRecebidos()) {
                System.out.println(emailRecebido.getMensagem());
            }
            System.out.println();
            System.out.println("Email enviados: ");
            for(Email emailRecebido : f.getEmailEnviados()) {
                System.out.println(emailRecebido.getMensagem()+"\n");
            }

        }
    }
}
