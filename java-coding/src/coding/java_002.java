package coding;

import java.util.HashMap;
import java.util.Map;

public class java_002 {
	/**
	 * �ݺ����� �ʴ� ù ��° ���� ã��
	 * �־��� ���ڿ����� �ݺ����� �ʴ� ù ��° ���ڸ� ��ȯ�ϴ� ���α׷��� �ۼ��϶�.
	 * @param args
	 */
	public static void main(String args[]) {
		
		java_002 java = new java_002();
		
		char ch  = java.findCh("�ȳ��ϼ��俩����������");
		
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
