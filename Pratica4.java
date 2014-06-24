public class Pratica4 {
    public static void main(String[] args)
    {
        Question[] prova = new Question[11];

        for (int i=1; i<=10; i++){
            prova[i] = new Question();
            prova[i].number = i;
            prova[i].question = "pergunta" + Integer.toString(i);
            prova[i].answer = "resposta" + Integer.toString(i);
        }

        for (int i=10; i>0; i--){
            prova[i].ask();
        }
    }
}
