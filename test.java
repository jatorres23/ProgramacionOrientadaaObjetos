class test{
	public static void main(String[] arguments){
	String s= System.console().readLine();// Solicita la usuario el ingreso de una expresion y lo asigna a la variable s de tipo Caracter.
	String t= System.console().readLine();// Solicita la usuario el ingreso de una expresion y lo asigna a la variable t de tipo caracter.
	int i= Integer.parseInt(s);//Se asigna a la variable i como Entero; analiza la cadena s y nos devuelve un valor entero.
	double j= Double.parseDouble(t);//Se asigna a la variable j como Real; analiza la cadena j y nos devuelve un valor real.
	System.out.println(s+t);//Imprime el resultado de la concatenacion de las variables s(string) y t(string), resultando=String.
	System.out.println(i+j);//Imprime el resultado de la suma de las variables i(entero) y j(double)=, resultado=Double.
	System.out.println(s+j);//Imprime el resultado de la concatenación de las variables s(entero) y j(double)=, resultado=Double.
	System.out.println(i+t);//Imprime el resultado de la concatenacion de las variables i(string) y t(string), resultando=String.
	System.out.println(j+s);//Imprime el resultado de la concatenacion de las variables j(string) y s(string), resultando=Double.
	System.out.println(t+i);// Imprime el resultado de la concatenacion de las variables t(string) y i(string), resultando=String.
	}
}