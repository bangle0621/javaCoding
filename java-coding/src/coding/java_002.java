package coding;

import java.util.HashMap;
import java.util.Map;

public class java_002 {
	/**
	 * 반복되지 않는 첫 번째 문자 찾기
	 * 주어진 문자열에서 반복되지 않는 첫 번째 문자를 반환하는 프로그램을 작성하라.
	 * @param args
	 */
	public static void main(String args[]) {
		
		java_002 java = new java_002();
		
		char ch  = java.findCh("안녕하세요여러분하하하");
		
		System.out.println("ch : "+ ch);
	}
	
	public char findCh(String str) {
		
		Map<Character, Integer>  charMap = new HashMap<Character, Integer>();
		char firstChar = 'a';
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			charMap.compute(ch, (k , v) -> (v==null)? 1 : ++v);
			
			if(charMap.get(ch) != 1) {
				System.out.println("i : " + i);
				firstChar = ch;
				break;
			}
		}
		
		return firstChar;
	}
}
