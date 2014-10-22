public class BuracoTestDrive {
    public static void main(String[] args)
    {
        Buraco teste = new Buraco();
        System.out.println(teste.contaBuracos(""));        
        System.out.println(teste.contaBuracos(" "));
        System.out.println(teste.contaBuracos("A"));
        System.out.println(teste.contaBuracos("B"));
        System.out.println(teste.contaBuracos("C"));
        System.out.println(teste.contaBuracos("ABC"));
        System.out.println(teste.contaBuracos("O GATO SUBIU NO TELHADO"));
        System.out.println(teste.contaBuracos("bGgB"));    


        
    }
}

