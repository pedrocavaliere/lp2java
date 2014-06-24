public class PedraPapelTesouraTestDrive {
    public static void main(String[] args)
    {
      // primeiro teste:
      // pedra, pedra = empate

      PedraPapelTesoura ppt = new PedraPapelTesoura();
      System.out.println("\nDeve ser empate:");
      System.out.println(ppt.vencedor("pedra", "pedra"));
      System.out.println(ppt.vencedor("papel", "papel"));
      System.out.println(ppt.vencedor("tesoura", "tesoura"));

      System.out.println("\nNão deve ser empate:");
      System.out.println(ppt.vencedor("pedra", "tesoura"));
      System.out.println(ppt.vencedor("tesoura", "pedra"));

      System.out.println(ppt.vencedor("pedra", "papel"));
      System.out.println(ppt.vencedor("papel", "pedra"));

      System.out.println(ppt.vencedor("tesoura", "papel"));
      System.out.println(ppt.vencedor("papel", "tesoura"));

      System.out.println("\nDeve ser pedra:");
      System.out.println(ppt.vencedor("pedra", "tesoura"));
      System.out.println(ppt.vencedor("tesoura", "pedra"));

      System.out.println("\nDeve ser papel:");
      System.out.println(ppt.vencedor("pedra", "papel"));
      System.out.println(ppt.vencedor("papel", "pedra"));

      System.out.println("\nDeve ser tesoura:");
      System.out.println(ppt.vencedor("tesoura", "papel"));
      System.out.println(ppt.vencedor("papel", "tesoura"));


    }
}


class PedraPapelTesoura {
    public String vencedor(String jogada1,String jogada2)
    {
        if(jogada1 == jogada2){
            return("empate");
        }
        if((jogada1 == "tesoura" && jogada2 == "pedra") ||
           (jogada1 == "pedra" && jogada2 == "tesoura") ){

          return("pedra");

        }
        if((jogada1 == "papel" && jogada2 == "pedra") ||
           (jogada1 == "pedra" && jogada2 == "papel") ){

          return("papel");

        }
        if((jogada1 == "papel" && jogada2 == "tesoura") ||
           (jogada1 == "tesoura" && jogada2 == "papel") ){

          return("tesoura");

        }
        return("nada");
    }
}