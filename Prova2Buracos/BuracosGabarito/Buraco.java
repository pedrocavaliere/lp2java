import java.lang.*;

public class Buraco {
  public int contaBuracos(String palavra){
    int contadorDeBuracos = 0;

    for(int i = 0; i < palavra.length(); i++){
      char letra = palavra.charAt(i);

      if (temUmBuraco(letra)){
        contadorDeBuracos++;
      }
      else if (temDoisBuracos(letra)) {
        contadorDeBuracos = contadorDeBuracos + 2;
      }
    }
    return contadorDeBuracos;
  }

  public boolean temUmBuraco(char c){
    String letras = "ADOPQRabdegopq";
    return letras.contains(Character.toString(c));
  }

  public boolean temDoisBuracos(char c){
    return c == 'B';
  }
}
