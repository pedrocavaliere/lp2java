import java.util.*;

public class CollatzTestDrive{
	public static void main(String[] args)
    {
    	Collatz teste = new Collatz();

    	System.out.println("\nPara i = 2:");
    	System.out.println(teste.maior(2)); // 2, 1

    	System.out.println("\nPara i = maior:");
    	System.out.println(teste.maior(999999)); // 1

    	System.out.println("\nPara i = 3:");
    	System.out.println(teste.maior(3)); // 3, 10, 5, 16, 8, 4, 2, 1
    }
}