package knn;

import java.io.IOException;
import java.util.*;

class KNN {

	public static void main(String args[]) throws IOException{ 

		DataSet dataset = new DataSet();

		int k = 5; 
		//lista para manter os dados da cidade
		List<Iris> instiris = new ArrayList<Iris>();
		for(int j = 0 ; j < 105 ; j++ ){
			if(j < 35){
				instiris.add(new Iris(dataset.getDados()[j],"setosa"));
			}else if(j > 34 && j< 70){
				instiris.add(new Iris(dataset.getDados()[j],"versicolor"));
			}else {
				instiris.add(new Iris(dataset.getDados()[j],"virginica"));
			}		
		}

		//iris a ser classificada
		//5 conjuntos de testes , para mais acessar arquivo iris-teste.data
		//{5.0,3.2,1.2,0.2} = Iris-setosa
		//{5.5,3.5,1.3,0.2} = Iris-setosa
		//{6.0,3.4,4.5,1.6} = Iris-versicolor
		//{6.7,3.1,4.7,1.5} = Iris-versicolor
		//{7.7,3.0,6.1,2.3} = Iris-virginica
		//{6.3,3.4,5.6,2.4} = Iris-virginica
		
		
		double[] irisDesconhecida = {5.5,3.5,1.3,0.2};
		
		Distancia dist = new Distancia(k, instiris, irisDesconhecida);

		dist.calcular();
		
		String[][] lista = dist.definirRank();
								
		Votos votos = new Votos(lista); 
		String newClasse = votos.contarVotos();
		System.out.println("A classe da nova instancia é: "+newClasse); 
		
		
		
	} 

	static class DistanceComparator implements Comparator<Resultado> {
		public int compare(Resultado a, Resultado b) {
			return a.getDistancia()<b.getDistancia() ? -1 : a.getDistancia() == b.getDistancia() ? 0 : 1;
		}
	}

}