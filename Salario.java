class Salario{
	
	public static void main(String[] arguments){
		//Inicio Programa principal.
		System.out.println("Ingrese el nombre del trabajador: ");
		String nom= System.console().readLine();
		
		//Inicio del metodo calculo.
		cal();

		//Impresion datos de resultado.
		System.out.println("Se debe pagar al trabajador "+ nom +" la suma de "+pago);
		
	}	
	//Metodo calculo.
	public static double cal(double pago){
		System.out.println("Ingrese el el valor del salario: ");
		String s= System.console().readLine();
		double sm= Double.parseDouble(s);
		System.out.println("Ingrese el numero de horas extras laboradas en la semana: ");
		String h= System.console().readLine();				
		double hex= Double.parseDouble(h);
		if (sm <= 8.00) {
			System.out.println("El salario que usted ha ingresado es menor a la base minima de 8.00/h");
		} else if (hex > 60.00 && hex >= 40.00) {
			double pago= sm*1.5*hex;
			return pago;
			} else { 	
			System.out.println("Ha excedido el numero maximo 60 horas extras permitidas.");				
		}	
	}	
}