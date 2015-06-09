package chap05;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs)
    {
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess) {

        int guess = -1;

         try {

            int guess = Integer.parseInt(stringGuess);

         } catch (Exception e) {
           System.out.println("Erro no numero, use um inteiro");
           return "miss";
        }

        String result = "miss";
        for (int cell: locationCells)
        {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
