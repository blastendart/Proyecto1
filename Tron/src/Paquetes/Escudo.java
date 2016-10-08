package Paquetes;

import java.awt.Image;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

import javax.swing.ImageIcon;

public class Escudo {
	
	//Se cargan im�genes de los poderes
	Image escudo = new ImageIcon(getClass().getResource("/Archivos/escudo.png")).getImage();
	Image velocidad = new ImageIcon(getClass().getResource("/Archivos/velocidad.png")).getImage();
	
	//Variables aleatorias para generar la posci�n de los poderes.
	static Random xE = new Random();
	static Random yE = new Random();
	static Random xV = new Random();
	static Random yV = new Random();
 
	static int[] posE = {(int)(xE.nextInt() * 400 + 1), (int)(yE.nextInt() * 600 + 1)}; //posici�n del poder Escudo
	static int[] posV = {(int)(xV.nextInt() * 400 + 1), (int)(yV.nextInt() * 600 + 1)}; //posici�n del poder Velocidad
	static int[] posM1 = {Moto.getposX(), Moto.getposY()}; //posici�n de la moto principal
	static int[] posM2 = {0, 0}; //posici�n del bot 1
	static int[] posM3 = {0, 0}; //posici�n del bot 2
	static int[] posM4 = {0, 0}; //posici�n del bot 3 
	
	
	public static int cogePoder(){ //la clase que determinar� cuando agregar un poder a la pila 
		if (posV == posM1){ //si la posici�n de la moto y el poder escudo coinciden
			return 0; } //retorna un 0 que se interpretar� luego como Escudo en la pila de poderes
		if (posE == posM1){ //si la posici�n de la moto y el poder velocidad coinciden
			return 1; } //retorna un 1 que se interpretar� luego como Velocidad en la pila de poderes
		else{
			return 2; }
	}	
	
	//Getters and Setters de las variables para conectarlos a las diferentes clases del programa
	public static int[] getPosE() {
		return posE;
	}

	public static int[] setPosE(int[] posE) {
		return Escudo.posE = posE;
	}

	public static int[] getPosM1() {
		return posM1;
	}

	public static int[] setPosM1(int[] posM1) {
		return Escudo.posM1 = posM1;
	}				
	
	public static int[] getPosV() {
		return posV;
	}

	public static int[] setPosV(int[] posV) {
		return Escudo.posV = posV;
	}
	
}
		


