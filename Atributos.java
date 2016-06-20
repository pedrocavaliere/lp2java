import java.util.*;

public class Atributos {
		
	
    public static void main(String [] args){
		
		//int sabedoria, forca, carisma, inteligencia, agilidade, constituicao;
		
		int [] atributos;
		atributos = new int[6];
		
		int[] num;
    	num = new int[4];
    	
    	int sum = 0;
    	int menor = 7;
		        
        Random rand = new Random();
        
        for (int cont=0; cont<6; cont++){        	
            for (int j=0; j<4; j++){
        	
        	    num[j] = rand.nextInt(6)+1;
        	    System.out.println(num[j]);
        	    
            	sum = sum + num[j];
            	        	         	    
            	if (menor > num[j]){
            		menor = num[j];
            	}
            		
            }	

            atributos[cont] = sum-menor;  
        
            System.out.println();
            System.out.println(atributos[cont]);
            System.out.println();  
            
            sum = 0;
            menor = 7;
        }
        
        //sabedoria = atributos[0];
        //forca = atributos[1];
        //carisma = atributos[2];
        //inteligencia = atributos [3];
        //agilidade = atributos [4];
        //constituicao = atributos [5];
        
        //System.out.println(sabedoria);
        //System.out.println(forca);
        //System.out.println(carisma);
        //System.out.println(inteligencia);
        //System.out.println(agilidade);
        //System.out.println(constituicao);
                    	
    }
        
}
