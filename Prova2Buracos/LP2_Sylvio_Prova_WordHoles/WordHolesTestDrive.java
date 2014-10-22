public class WordHolesTestDrive {
    public static void main(String[] args){
    	WordHoles prova = new WordHoles();
		System.out.println("Deve ser 0: ");
    	System.out.println(prova.holesCount(""));
    	System.out.println("Deve ser 0: ");
    	System.out.println(prova.holesCount(" "));
    	System.out.println("Deve ser 1: ");
    	System.out.println(prova.holesCount("A"));
    	System.out.println("Deve ser 2: ");
    	System.out.println(prova.holesCount("B"));
    	System.out.println("Deve ser 0: ");
    	System.out.println(prova.holesCount("C"));
    	System.out.println("Deve ser 3: ");
    	System.out.println(prova.holesCount("ABC"));
    	System.out.println("Deve ser 9: ");
    	System.out.println(prova.holesCount("O GATO SUBIU NO TELHADO"));

    	System.out.println("Deve ser 4: ");
    	System.out.println(prova.holesCount("banana"));
    	System.out.println("Deve ser 10: ");
    	System.out.println(prova.holesCount("O Brasil e Bobo"));
    	System.out.println("Deve ser 10: ");
    	System.out.println(prova.holesCount("O buraco e mais embaixo"));
    }
}