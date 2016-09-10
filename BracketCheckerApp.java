package Puzzle;

public class BracketCheckerApp {
	public static void main (String args[]){
		String str = "A(B I (k) b (a (b)) c.))";
		System.out.println(str);
		BracketCheckerMap checkBracket = new BracketCheckerMap(str);
		boolean isOK = checkBracket.checkBrackets();
		
		System.out.println(isOK);
		
	}

}
