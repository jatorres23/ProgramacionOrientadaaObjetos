class CaidaLibre{
		public static void main(String[] arguments){
		System.out.println("x(t) = 0.5at2 + vit + xi; donde: ");
		System.out.println(" a= Si la caida libre se realiza en la tierra la aceleracion sera la gravedad terrestre cuyo valor es 9,81 m/s^2.");
		System.out.println("La aceleracion de la gravedad es un vector que apunta siempre verticalmente hacia abajo, es decir es negativa.");
		System.out.println(" t= Tiempo, dado en segundos.");
		System.out.println(" vi= Velocidad Inicial.Recuerde que cuando Un objeto se deja caer la velocidad inicial sera siempre igual a cero.");
		System.out.println(" xi= Posicion Inicial.");
		System.out.println("Ingrese el tiempo, para calcular la distancia del objeto, trancurrido durante la caida libre del mismo:");
		String ti= System.console().readLine();
		double t= Double.parseDouble(ti);//Se asigna a la variable t como Real; analiza la cadena ti y nos devuelve un valor real.
		double co=0.5;
		double ace=-9.81;
		double vel_ini=0.0;
		double pos_ini=0.0;
		double dis_rec=(co*(ace*(t*t)))+(vel_ini*t)+pos_ini;
		System.out.println("La Distancia recorrida por el objetos en caida libre es: "+dis_rec+" m");
		}
}