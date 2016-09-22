package _01ejercicios;

public class Hilo extends Thread{

	int milis;
	int [] id;
	
	
	public Hilo(){
		id = new int [5];
	}
	
	
	
	public void run(){
		
		for (int i = 0; i < id.length; i++) {
			milis = (int) (Math.random () * 10000 + 500);
			id[i]=milis;
			System.out.println("Hola soy el hilo "+i+", y voy a dormirme "+milis+" milisegundos");
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			System.out.println("Hola soy el hilo "+i+", y ya he despertado");
			}
	}
}
