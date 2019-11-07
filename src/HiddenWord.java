// This file should contain the HiddenWord class, with constructor, instance variable(s) and getHint method
public class HiddenWord {
	private String hiddenWord;

	HiddenWord(String word){
		hiddenWord = word;
	}
	public  String getHint(String guess){
		String retString = "" ;
		if (guess.equals(hiddenWord)){
			return hiddenWord;
		}
		for(int i = 0; i < hiddenWord.length(); i++ ){
			if(hiddenWord.substring(i,i+1).equals(guess.substring(i,i+1))){
				retString += hiddenWord.substring(i,i+1);
			}else if (hiddenWord.indexOf(guess.substring(i,i+1)) != -1){
				retString += "+";
			}else{ 
				retString += "*";
			}
		}
		return retString;

		//System.out.println(hiddenWord.substring(0).indexOf(guess));


	}
	/*public static void main(String[] args){
		HiddenWord word1 = new HiddenWord("HARPS");
		System.out.println(HiddenWord.getHint("HUPLS"));

	}*/
	// DO NOT DELETE THIS METHOD. Run it only when you think your Hidden Word Method is correct.
	public static void runHiddenWordAcceptanceTest(){
		(new HiddenWordTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runHiddenWordAcceptanceTest();

	}

}
