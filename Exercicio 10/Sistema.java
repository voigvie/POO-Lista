import java.util.*;

public class Sistema {
    ArrayList<Funcionario> funcionarios;

    public Sistema() {
        this.funcionarios = new ArrayList<>();
    }

    void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
