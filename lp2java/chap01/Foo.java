public class Foo {
    public static void main(String[] args) {
        int hora = 0;
        int minuto = 0;

        while ( hora < 2) {


minuto = minuto + 30;
if (minuto >= 60){
    hora++;
    minuto = 15;
}
System.out.println(hora+"h"+minuto);


        }
    }
}