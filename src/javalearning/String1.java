package javalearning;

public class String1 {

	public static final String1 INSTANCE = new String1();

	private String1() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String1 tst = String1.INSTANCE;
		String word = tst.withoutX2("xbHello");

		System.out.println(word);
	}

	public String withoutX2(String str){
		if(str.isEmpty())
			return "";
		
		if(str.length()==1){
			if(str.equals("x"))
				return "";
			else
				return str;
		}
		
		if(str.length()==2){
			if(!str.contains("x"))
				return str;
			
			if(str.equals("xx"))
				return "";
			
			
			if(str.substring(0,1).equals("x"))
				return str.substring(1);
			
			if(str.substring(1).equals("x"))
				return str.substring(0, 1);
		}
		
		if(str.substring(0, 2).equals("xx"))
			return str.substring(2);
		
		String firstChar = str.substring(0, 1);
		String secndChar = str.substring(1, 2);
		
		if(firstChar.equals("x") && !secndChar.equals("x"))
			return str.substring(1);
		
		if(!firstChar.equals("x") && secndChar.equals("x"))
			return firstChar + str.substring(2);
		
		
		return str;
	}
	
	public String withoutX(String str){
		if(str.isEmpty() || str.equals("x"))
			return "";
		
		String firstChar = str.substring(0, 1);
		String lastChar = str.substring(str.length()-1);
		
		if(firstChar.equals("x") && lastChar.equals("x")){
			return str.substring(1, str.length()-1);
		}
		
		if(!firstChar.equals("x") && !lastChar.equals("x"))
			return str;
		
		if(firstChar.equals("x") && !lastChar.equals("x"))
			return str.substring(1);
		
		if(!firstChar.equals("x") && lastChar.equals("x"))
			return str.substring(0, str.length()-1);
		
		return str;
	}
	
	public String startWord(String str, String word){
		
		if(word.isEmpty() || str.isEmpty())
			return "";
		
		if(word.length() > str.length())
			return "";

		if(word.length()==1 && str.length()>=word.length())
			return Character.toString(str.charAt(0));
		
		if(str.startsWith(word))
			return word;
		
		String tmpStr = str.substring(1);
		String tmpWord = word.substring(1);
		
		if(tmpStr.startsWith(tmpWord))
			return str.substring(0, word.length());
		
		return "";
	}
	
	
	public String deFront(String str){
		if(str.isEmpty())
			return "";
		
		String firstChar = Character.toString(str.charAt(0));
		if(str.length()==1){
			if(firstChar.equals("a"))
				return "a";
			else
				return "";
		}
		
		String secndChar = Character.toString(str.charAt(1));
		if(str.length()==2){
			String tmp = "";
			if(firstChar.equals("a"))
				tmp +="a";
			
			if(secndChar.equals("b"))
				tmp+="b";
			
			return tmp;
		}
		
		
		
		String tmp = "";
		if(firstChar.equals("a"))
			tmp +="a";
		
		if(secndChar.equals("b"))
			tmp+="b";
		
		return tmp+str.substring(2);
	}
	
	public String without2(String str){
		if(str.isEmpty() || str.length()==1)
			return str;
		
		if(str.length()==2)
			return "";
		
		String beg = str.substring(0, 2);
		String end = str.substring(str.length()-2);

		if(beg.equals(end))
			return str.substring(2);
		
		return str;
	}
	
	public String extraFont(String str){
		if(str.length()<=2)
			return str+str+str;
		
		String substring = str.substring(0, 2);
		
		return substring + substring + substring;
	}
	
	public String minCat(String a, String b) {

		if (a.length() == b.length())
			return a + b;

		if (a.length() > b.length()) {

			return a.substring(a.length() - b.length()) + b;
		} else
			return a + b.substring(b.length() - a.length());
	}

	public boolean frontAgain(String str) {
		if (str.length() < 2)
			return false;

		if (str.length() == 2)
			return true;

		String f2 = str.substring(0, 2);
		String l2 = str.substring(str.length() - 2);

		if (f2.equals(l2))
			return true;

		return false;
	}

	public String seeColor(String str) {

		if (str.startsWith("red"))
			return "red";

		if (str.startsWith("blue"))
			return "blue";

		return "";
	}

	public String lastTwo(String str) {
		if (str.length() < 2)
			return str;

		if (str.length() == 2)
			return Character.toString(str.charAt(1))
					+ Character.toString(str.charAt(0));

		String body = str.substring(0, str.length() - 2);
		String tail = str.substring(str.length() - 2);

		return body + Character.toString(tail.charAt(1))
				+ Character.toString(tail.charAt(0));
	}

	public String conCat(String a, String b) {

		if (a.isEmpty())
			return b;

		if (b.isEmpty())
			return a;

		String as = a.substring(a.length() - 1);
		String bs = Character.toString(b.charAt(0));

		if (as.equals(bs)) {
			return a + b.substring(1);
		}

		return a + b;
	}

	public String lastChars(String a, String b) {

		String a1;
		String b1;

		if (a.isEmpty()) {
			a1 = "@";
		} else {
			a1 = Character.toString(a.charAt(0));
		}

		if (b.isEmpty()) {
			b1 = "@";
		} else {
			b1 = b.substring(b.length() - 1);
		}

		return a1 + b1;
	}

	public String atFirst(String str) {
		if (str.length() >= 2)
			return str.substring(0, 2);

		if (str.isEmpty())
			return "@@";

		return str.charAt(0) + "@";
	}

	public boolean hasBad(String str) {

		int indexOf = str.indexOf("bad");
		if (indexOf == 1 || indexOf == 0)
			return true;

		return false;
	}

	public String middleThree(String str) {
		int mid = str.length() / 2;
		return str.substring(mid - 1, mid + 2);
	}

	public String twoChar(String str, int index) {
		if (index < 0)
			index = 0;

		if (str.length() < 3 || (index + 2) > str.length())
			return str.substring(0, 2);

		return str.substring(index, index + 2);
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

	public boolean endsLy(String str) {
		return str.endsWith("ly");
	}

	public String middleTwo(String str) {
		if (str.length() < 2)
			return str;
		int mid = str.length() / 2;
		return str.substring(mid - 1, mid + 1);
	}

	public String withouEnd2(String str) {

		if (str.length() < 3)
			return "";

		return str.substring(1, str.length() - 1);
	}

	public String theEnd(String str, boolean front) {
		if (str.length() < 1)
			return str;

		if (front) {
			return str.substring(0, 1);
		} else {
			return str.substring(str.length() - 1);
		}
	}

	public String right2(String str) {
		if (str.length() < 2)
			return str;

		return str.substring(str.length() - 2)
				+ str.substring(0, str.length() - 2);
	}

	public String left2(String str) {
		if (str.length() < 2)
			return str;

		return str.substring(2) + str.substring(0, 2);
	}

	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	public String comboString(String a, String b) {
		int sizeA = a.length();
		int sizeB = b.length();

		if (sizeA > sizeB)
			return b + a + b;

		return a + b + a;
	}

	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	public String firstTwo(String str) {
		if (str.length() < 2)
			return str;
		return str.substring(0, 2);
	}

	public String extraEnd(String str) {
		String end = str.substring(str.length() - 2);
		return end + end + end;
	}

	public String makeOutWord(String out, String word) {

		int length = out.length();
		int mid = length / 2;

		String partA = out.substring(0, mid);
		String partB = out.substring(mid);

		return partA + word + partB;
	}

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

}
