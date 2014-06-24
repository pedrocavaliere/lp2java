public class QuestionTestDrive {
    public static void main(String[] args)
    {
        Question one = new Question();
        one.number = 1;
        one.question = "Quanto e 2 + 2 na base 4?";
        one.answer = "10";
        one.ask();
        System.out.println(one.checkAnswer("4")); // deve ser falso

        Question two = new Question();
        two.number = 2;
        two.question = "Quem gosta de Java?";
        two.answer = "Eu";
        two.ask();
        System.out.println(two.checkAnswer("Eu")); // deve ser verdadeiro
    }
}

