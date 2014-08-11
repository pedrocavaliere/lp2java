public class Question {
    String resposta;

    public void ask()
    {
        System.out.println("Pergunta: " + resposta);
    }

    public void testAnswer(String myAnswer)
    {
    	return (resposta == myAnswer);
    }
}
