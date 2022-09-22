package uscs;

public class TesteGerente {

    public static void main(String[] args) {
        
        Empregado a = new Empregado("Antonio", "Rua Brasil, 130", 50, 230);
        a.ImprimeEmpregado();
        a.ImprimeSalario();
        
        
        Gerente c = new Gerente("Carlos", "Rua Silvio Torres, 30", 50, 230, "Ana", 2000);
        c.ImprimeGerente();
        c.CalculoSalario();
    }
}
