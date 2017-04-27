package knn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataSet {
	
	String irisTreino = "./src/knn/treino.data";
	private double[][] dados = new double[105][4];
	private BufferedReader leitor; 	
	
 	public void importaDados() throws IOException{
 		leitor = new BufferedReader(new FileReader(irisTreino));
 	for(int i=0 ; i < 105 ; i++)
 		{     
 	      String[] atributos = leitor.readLine().split(",");
 	      //System.out.println(atributos[0] + " " + atributos[1] + " " + atributos[2] + " " + atributos[3]);
 	      dados[i][0] = Double.parseDouble(atributos[0]);
 	      dados[i][1] = Double.parseDouble(atributos[1]);
 	      dados[i][2] = Double.parseDouble(atributos[2]);
 	      dados[i][3] = Double.parseDouble(atributos[3]);
 	      //System.out.println(dados[i][0] + "," + dados[i][1] + "," + dados[i][2] + "," + dados[i][3]);
 	     }
 	}	 		

	public DataSet() throws IOException {
		importaDados();
	}

	public double[][] getDados() {
		return dados;
	}
	
	//private double[][] dados = {								
    //{5.1,3.5,1.4,0.2},
	//	{4.9,3.0,1.4,0.2}		
//}

	//public void setDados(double[][] dados) {
	//	this.dados = dados;
	//}

}
