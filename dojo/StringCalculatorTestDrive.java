public class StringCalculatorTestDrive {
    StringCalculator sc = new StringCalculator();

    // quando mais de 2 numeros são usados, gera erro
    sc.add();

    // quando 2 numeros são usados, não gera erro
    // s.add("1,2");

    // quando um não numérico é usado, gera erro
    // s.add("1,x");
}
