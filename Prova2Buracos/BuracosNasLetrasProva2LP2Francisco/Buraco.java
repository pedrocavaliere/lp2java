public class Buraco {  
  
  public int contaBuracos(String palavra){
    int contadorDeBuracos = 0;
    
    for(int i = 0; i < palavra.length(); i++){
      if(palavra.charAt(i)== 'a' ||palavra.charAt(i)=='b' || palavra.charAt(i)== 'd' || palavra.charAt(i)== 'e' ||palavra.charAt(i)== 'o'||palavra.charAt(i)== 'p'||palavra.charAt(i)== 'q'||palavra.charAt(i)== 'A'||palavra.charAt(i)== 'D'||palavra.charAt(i)== 'O'||palavra.charAt(i)== 'P'||palavra.charAt(i)== 'Q'||palavra.charAt(i)== 'R'){
        contadorDeBuracos++;
      }
      if (palavra.charAt(i)== 'g'|| palavra.charAt(i)== 'B') {
        contadorDeBuracos = contadorDeBuracos + 2;
      }
      else{
        continue;
        }  
    }      
       return contadorDeBuracos; 
  }    
}
