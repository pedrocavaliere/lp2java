class WordHoles{
	public int holesCount(String phraseTyped){
		int totalHoles = 0;
		int currentChar;
		String lettersWithHoles = "ADOPQRabdegopq";
		for (currentChar = 0; currentChar < phraseTyped.length(); currentChar++){
			if (lettersWithHoles.indexOf(phraseTyped.charAt(currentChar)) != -1){
				totalHoles++;
			}
			else if (phraseTyped.charAt(currentChar) == 'B'){
				totalHoles += 2;
			}
		}
		return totalHoles;
	}
}