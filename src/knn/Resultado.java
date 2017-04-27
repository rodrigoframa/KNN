package knn;

public class Resultado {
	private double distancia;
	private String nome;
	public Resultado(double distance, String n){
		this.nome = n;
		this.distancia = distance;	    	    
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
