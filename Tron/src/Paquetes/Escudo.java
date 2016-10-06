package Paquetes;


public class Escudo {

	static int posE = 0; //posici�n del poder Escudo
	static int posV = 0; //posici�n del poder Velocidad
	static int posM1 = 0; //posici�n de la moto principal
	static int posM2 = 0; //posici�n del bot 1
	static int posM3 = 0; //posici�n del bot 2
	static int posM4 = 0; //posici�n del bot 3
	
	
	public static int cogePoder(){ //la clase que determinar� cuando agregar un poder a la pila 
		if (posE == posM1){ //si la posici�n de la moto y el poder escudo coinciden
			return 0; } //retorna un 0 que se interpretar� luego como Escudo en la pila de poderes
		if (posV == posM1){ //si la posici�n de la moto y el poder velocidad coinciden
			return 1; } //retorna un 1 que se interpretar� luego como Velocidad en la pila de poderes
		else{
			return 2; }
	}	
	
	//Getters and Setters de las variables para conectarlos a las diferentes clases del programa
	public static int getPosE() {
		return posE;
	}

	public static void setPosE(int posE) {
		Escudo.posE = posE;
	}

	public static int getPosM1() {
		return posM1;
	}

	public static void setPosM1(int posM1) {
		Escudo.posM1 = posM1;
	}				
	
	public static int getPosV() {
		return posV;
	}

	public static void setPosV(int posV) {
		Escudo.posV = posV;
	}
	
	
}
		


