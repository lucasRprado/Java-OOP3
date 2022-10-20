package uscs;

public class Gerente extends Empregado{
    private String secretaria;
    private double bonus;
    
    
    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
        
    public Gerente(){
        
    }
    
    public Gerente(String nome, String endereco, double valorHora, double horasTrab, String secretaria, double bonus){
        super(nome, endereco, valorHora, horasTrab);
        this.secretaria = secretaria;
        this.bonus = bonus;
    }  
    
    public void ImprimeGerente(){
        super.ImprimeEmpregado();
        System.out.println("\nSecretaria: " + secretaria);
        System.out.println("Bonus salarial: R$" + bonus);
    }
    
    public void CalculoSalario(){
         double salarioFinal;
         double salario = super.getHorasTrab()*super.getValorHora();
        salarioFinal = salario + bonus;
        System.out.println("\nSalario final: R$" + salarioFinal);
    }
    
}
