import java.util.*;
public class NotasTestDrive {

  public static void main(String[] args){
    Saque notas = new Saque();
    System.out.println("deve ser 1 nota de 20 e 1 nota de 10");
    System.out.println(Arrays.toString(notas.menosNotas(30)));
     

    System.out.println("deve ser 1 nota de 50 e 1 nota de 20 e 1 nota de 10");
    System.out.println(Arrays.toString(notas.menosNotas(80)));
  // Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.

  }
}