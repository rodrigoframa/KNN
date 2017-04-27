package knn;

public class Iris {
	private double[] atributos;
	private String nome;
	
	public Iris(double[] a, String n){
		this.nome = n;
		this.atributos = a;	    	    
	}
	
	public double[] getAtributos() {
		return atributos;
	}
	public void setAtributos(double[] atributos) {
		this.atributos = atributos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
