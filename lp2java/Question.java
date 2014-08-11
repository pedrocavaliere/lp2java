public class Question {
    int number = 0;
    String question;
    String answer;

    public void ask()
    {
        System.out.println("Pergunta: " + question);
    }

    public boolean checkAnswer(String myAnswer)
    {
    	return myAnswer == answer;
    }
}



// public class Question {
//     String number = 0;

//     public void ask()
//     {
//         System.out.println("Pergunta: " + question);
//     }

//     public void answer(String answer)
//     {
//     }
// }
