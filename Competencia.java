class Competencia{
	public static void main(String[] arguments){
			
	//Inicio Programa principal.
		System.out.println("Ingrese el numero de competidores de la maraton: ");
		String n= System.console().readLine();
		int nc= Integer.parseInt(n);
		
	//Inicio del metodo muestra.
		muestra();

	//Impresion datos de resultado.
		System.out.println(artiem[0]);	

	//Metodo muestra.
		Public Static Void muestra( int nc,){
		String[] com = new String[nc];
		double[] tiem = new double[nc];		
		for (int i = 0; i < nc; i = i+1);
			System.out.println("Ingrese el nombre de los competidores de la maraton: ");
			String nom= System.console().readLine();
			com[i] = nom; 
			System.out.println("Ingrese el tiempo de los competidores de la maraton: ");
			String t= System.console().readLine();				
			double ti= Double.parseDouble(t);
			tiem[i] = ti; 
 		}	
}
















