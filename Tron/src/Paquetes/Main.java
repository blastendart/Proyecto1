package Paquetes;

import javax.swing.JFrame;

public class Main {
 public static display f = new display();
 public static int w = 600;
 public static int h = 400;
 public static void  main(String args[]){
  f.setSize(w, h);
  f.setResizable(true);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setTitle("Prueba 2D");
  f.setLocationRelativeTo(null);
  f.setAlwaysOnTop(true);
 }

} 