package uscs;

public class Empregado {
    private String nome;
    private String endereco;
    private double valorHora;
    private double horasTrab;
    
    public Empregado(){
        
    }
    
    public Empregado(String nome, String endereco, double valorHora, double horasTrab){
        this.nome = nome;
        this.endereco = endereco;
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }
    
    public void ImprimeEmpregado(){
        System.out.println("\nDados do empregado:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Valor da hora: " + valorHora);
        System.out.println("Horas trabalhadas: " + horasTrab);
    }
        
    public void CalculaSalario(){
        double salario = valorHora*horasTrab;
        System.out.println("Salario: R$" + salario);
    }
    
    public void ImprimeSalario(){
        double salario = valorHora*horasTrab;
        System.out.println("\nNome do empregado: " + nome);
        System.out.println("Salario: " + salario);
    }
}
