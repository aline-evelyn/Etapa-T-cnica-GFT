// Exercício 2

public abstract class Pessoa{
  protected String Nome;
  protected int RG;

  protected Pessoa(String nome){
    Nome = nome;
  }
  public String getNome(){
    return Nome;
  }
  protected Pessoa(int RG){
      RG = RG;
  }
  public int getRG(){
      return RG;
  }
}


public class Funcionario {

	double salario_inicial;
	double percentual;
    double salario_total;
	
	
	public double getSalario_inicial() {
		return salario_inicial;
	}
	public void setSalario_inicia(double salario_inicial) {
		this.salario_inicial = salario_inicial;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = 1.5;
	}
	public String getSalario_final() {
		return salario_inicial * percentual ;
	}
	public void setSalario_final(double setSalario_final) {
		this.setSalario_final = salario_inicial * 1.5;
	}
}