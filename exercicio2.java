import java.util.Scanner;

public class exercicio2{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int i;
    	System.out.print("Digite um numero: ");
    	int n = sc.nextInt();
    	
    	
    	for(i = 0;i < n;i++){
    	    System.out.print(fib(i) + " ");
    	} 
    	
    	System.out.println();
    	System.out.println("O numero " + n + " está na sequencia?" + pertenceFib(n));
    	
        sc.close();
	}
	
	public static int fib(int n){
     if (n <= 1){
         return n;
     } else{
         return fib(n - 1) + fib(n - 2);
     }
    }
    
    public static boolean quadradoPerfeito(int n){
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }
    
    public static boolean pertenceFib(int n){
        return quadradoPerfeito(5*n*n + 4) || quadradoPerfeito(5*n*n - 4);
    }
}