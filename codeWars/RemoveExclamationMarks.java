package codeWars;

public class RemoveExclamationMarks {

	public static void main(String[] args) {
		
		String s = "hello!how!are!you!around!!!";
		
		RemoveExclamationMarks marks = new RemoveExclamationMarks();
		System.out.println(RemoveExclamationMarks.removeExam(s));
		System.out.println(RemoveExclamationMarks.removeExclamationMarks(s));
	}
	
	
	
	//my original solution
	static public String removeExam(String s){
		
		String[] removeMarks = s.split("!");
		String newWord = "";
		
		for(String i: removeMarks) { newWord += i;}
		return newWord;
	}
	
	
	
	//refactored solution
	static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

}
