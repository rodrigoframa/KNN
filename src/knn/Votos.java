package knn;

public class Votos {
	private String[][] lista;
	

	public Votos(String[][] l) {
		this.lista = l;

	}

	public String contarVotos() {
		int[] mc = new int[3];
		double[] soma = new double[3];
		mc[0] = 0;
		mc[1] = 0;
		mc[2] = 0;
		soma[0] = 0;
		soma[1] = 0;
		soma[2] = 0;
 		for(int i = 0 ; i< lista.length; i++){
			if(lista[i][0] == "setosa")
			{
				mc[0]++;
				double valor = Double.parseDouble(lista[i][1]);
				soma[0] = soma[0] + valor; 
			}else if(lista[i][0] == "versicolor"){
				mc[1]++;
				double valor = Double.parseDouble(lista[i][1]);
				soma[1] = soma[1]+ valor;
			}else{
				mc[2]++;
				double valor = Double.parseDouble(lista[i][1]);
				soma[2] = soma[2]+ valor;
			}			
			}
 		//System.out.println(mc[0]);
 		//System.out.println(mc[1]);
 		//System.out.println(mc[2]);		
 		//System.out.println(soma[0]);
 		//System.out.println(soma[1]);
 		//System.out.println(soma[2]);		
		
 		if( mc[0] != mc[1] && mc[0] != mc[2] && mc[1] != mc[2]){
				if(mc[0] > mc[1] && mc[0] > mc[2]){
				//	System.out.println("a");	
            return "setosa";
        } else if(mc[1] > mc[0] && mc[1] > mc[2]){
        	//System.out.println("b");
        	return "versicolor";
        } else{
        //	System.out.println("c");
        	return "virginica";
        }
		}else{
			if(mc[0] == mc[1] && mc[0] == mc[2] && mc[1] == mc[2])
			{
				if(soma[0] < soma[1] && soma[0] < soma[2]){
			//		System.out.println("d");
					return "setosa";
				}else if(soma[1] < soma[0] && soma[1] < soma[2]){
			//		System.out.println("e");
					return "versicolor";
				}else{
			//		System.out.println("f");
					return "virginica";
				}					
			}else if(mc[0] == mc[1] && mc[0] < mc[2])
			{
				return "virginica";
			}else if(mc[0] == mc[2] && mc[0] < mc[1])
			{
				return "versicolor";
			}else
			{
				return "setosa";
			}
			
		}
		
		
		
		
	}

}