package _01ejercicios;

public class Fin extends Thread{
	
	String n;
	
	public Fin(String n){
		this.n=n;
	}
	
	@Override
	public void run(){
		System.out.println("Fin del "+n);
	}

	public static void main(String[] args) {
		
		Thread hilo1 = new Fin("Hilo 1");
		Thread hilo2 = new Fin("Hilo 2");
		
		hilo1.start();
		hilo2.start();
		
		try {
			hilo1.join();
			hilo2.join();
			
			System.out.println("Todos los hilos han acabado");
		}
		catch (InterruptedException e) {}
		
		
		
	}

}
