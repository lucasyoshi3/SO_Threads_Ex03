package view;
import java.util.*;
import controller.ThreadVetor;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []vetor=new int[1000];
		System.out.println("Num: ");
		int num=sc.nextInt();
		for(int i=0;i<1000;i++) {
			vetor[i]=(int)(Math.random()*100)+1;
		}
		Thread threadVetor=new ThreadVetor(num,vetor);
		threadVetor.start();
	}
}
