public class NumerosFelizesTestDrive {
    public static void main(String[] args)
    {
      NumerosFelizes teste = new NumerosFelizes();
      System.out.println("\nTrue:");
      System.out.println(teste.eFeliz(13));
      System.out.println("\nFalse:");
      System.out.println(teste.eFeliz(3));
      System.out.println("\nTrue:");
      System.out.println(teste.eFeliz(10));

    }
}
