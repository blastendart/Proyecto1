package Paquetes;
		
public class Crono{ 
	
		public static int segundos = 0; //se inicializa una variable para los segundos
	
		public static int temporizador(){ //se crea el m�todo static int pues devolver� un entero(segundos)
			
	    for (segundos= 0; segundos < 10; segundos ++) //Un ciclo de crecimiento estandar para segundos
	    {
	    // System.out.println(segundos); //nada 
	    cuentaSegundos(); //el m�todo que estar� dando el tiempo real en el ciclo 
	 
	    }  
		return segundos; //se retorna la variable segundos para ser utilizada en fututos m�todos
	    }
	
	       

	private static void cuentaSegundos(){ //m�todo encargado de calcular el tiempo real
	    try{
	    Thread.sleep(1000); //mediante el conteo de ejecusiones se calcula un segundo
	    }
	    catch(Exception e){} //captura excepciones para evitar errores
		
	}
}
