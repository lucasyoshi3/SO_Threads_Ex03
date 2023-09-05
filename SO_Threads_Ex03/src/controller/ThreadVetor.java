package controller;

public class ThreadVetor extends Thread {

	private int num;
	private int[]vet=new int[1000];
	
	public ThreadVetor(int num, int[] vetor) {
		this.num=num;
		this.vet=vetor;
	}
	
	public void run() {
		tempo();
	}

	private void tempo() {
		long start;
		long end;
		if(num%2==0) {
			
			start=System.nanoTime();
			for(int i=0;i<vet.length;i++) {}
			end=System.nanoTime();
			
		}else {
			
			start=System.nanoTime();
			for(int i:vet) {}
			end=System.nanoTime();
			
		}
		double time = (double) end-start / 1000000000;
		System.out.println("Tempo: "+(time)+" segundos");
	}
	
	

}
