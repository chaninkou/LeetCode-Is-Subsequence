package leetcode392;

public class Main {
public static void main(String[] args) {
	String s = "abc";
	
	String t = "awfrgdc";
	
	System.out.println("s: " + s + " t: " + t);
	
	CheckIsSubsequence solution = new CheckIsSubsequence();
	
	System.out.println("Solution: " + solution.isSubsequence(s, t));
}
}
