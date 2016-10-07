package Paquetes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Moto extends JPanel{
 
	public Rectangle moto;
 
	public int tamY = 25;
	public int tamX = 25;
 
	public boolean derecha = false;
	public boolean izquierda = false;
	public boolean arriba = false;
	public boolean abajo = false;
	
	private Image img;

	public Moto(Manejador Ventana, Objetos O){
		moto = new Rectangle(200, 200, tamX, tamY);
  
		Ventana.addKeyListener(new KeyAdapter(){
   
	public void keyPressed(KeyEvent e){
	   if(e.getKeyCode() == KeyEvent.VK_D){
		   derecha = true;
	   }
	   if(e.getKeyCode() == KeyEvent.VK_A){
		   izquierda = true;
	   }
	   if(e.getKeyCode() == KeyEvent.VK_W){
		   arriba = true;
       	}
	   if(e.getKeyCode() == KeyEvent.VK_S){
		   abajo = true;
	   }
	}
  
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_D){
			derecha = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			izquierda = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_W){
			arriba = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			abajo = false;
		}
	}
  });  
  
 }
	
	public void paintComponent (Graphics g){
	 
		Image img11 = new ImageIcon(getClass().getResource("/Archivos/moto1.1.png")).getImage();
		Image img12 = new ImageIcon(getClass().getResource("/Archivos/moto1.2.png")).getImage();
		Image img13 = new ImageIcon(getClass().getResource("/Archivos/moto1.3.png")).getImage();
		Image img14 = new ImageIcon(getClass().getResource("/Archivos/moto1.4.png")).getImage();
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		//g.setColor(Color.BLACK);
		//g.fillRect(character.x, character.y, character.width, character.height);
		g.drawImage(img, moto.x, moto.y, this);
		
	if(derecha){
		img = img13;
		//g.drawImage(img13, character.x, character.y, this);
		moto.x += 1;
	}
	if(izquierda){
		img = img14;
		//g.drawImage(img14, character.x, character.y, this);
		moto.x -= 1;
	}
	if(arriba){
		img = img11;
		//g.drawImage(img11, character.x, character.y, this);
		moto.y -= 1;
	}
	if(abajo){
		img = img12;  
		//g.drawImage(img12, character.x, character.y, this);
		moto.y += 1;
	}
	repaint();
 }


}