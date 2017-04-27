package knn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import knn.KNN.DistanceComparator;

public class Distancia {
	private int k;
	private List<Iris> iris;
	private double[] irisDesconhecida;

	private List<Resultado> resultados = new ArrayList<Resultado>();


	public Distancia (int k,List<Iris> iris, double[] irisDesconhecida) {
		this.k = k;
		this.iris = iris;
		this.irisDesconhecida = irisDesconhecida;
	}

	public void calcular() {
		// é um foreach que equivale a for(i=0 ; i< iris.lenght; i++) 
		for(Iris iris : iris){
			double dist = 0.0;  
			for(int j = 0; j < iris.getAtributos().length; j++){    	     
				dist += Math.pow(iris.getAtributos()[j] - irisDesconhecida[j], 2) ;
			}
			double distance = Math.sqrt( dist );
			resultados.add(new Resultado(distance,iris.getNome()));
		} 
	}

	public String[][] definirRank() {
		Collections.sort(resultados, new DistanceComparator());
		String[][]lista = new String[k][2];
		for(int x = 0; x < k; x++){
			System.out.println(resultados.get(x).getNome()+ ": " + resultados.get(x).getDistancia());
			lista[x][0] = resultados.get(x).getNome();
			double y = resultados.get(x).getDistancia();
			lista[x][1] = Double.toString(y);
		}
		return lista;
	}
}
