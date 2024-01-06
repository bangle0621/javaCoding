package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sql.rowset.serial.SQLOutputImpl;

/**
 * @author bangle
 * ���� ���� ����
 * �־��� ���ڿ����� ���� ������ ���� ���α׷��� �ۼ��϶�.
 */
public class java_001 {
	public static void main(String args[]) {
		String str = "�ȳ��ϼ���. �� �̸��� �̹����Դϴ�. �� ��Ź �帳�ϴٴٴٴٴ�.";
		
		String str2  = "@#$#$%#$%#$^#^%^";
		
		java_001 java = new java_001();
		
		System.out.println(java.cntStr(str));
		
		System.out.println(java.cntStr(str2));
		
		
		System.out.println(java.countDupplicateCharacters(str));
		
		
		java.test();
		
		System.out.println(java.countDupplicateCharacters2(str2));
	}
	
	
	/**
	 * ���� ��..
	 * �� �� ���ڸ� ���ؼ� ī��Ʈ�Ѵٴ� ����..
	 * @param str
	 * @return
	 */
	public Map<Character, Integer> cntStr(String str) {
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++) {
			char ch = str.charAt(i);
			char ch2 = str.charAt(i +1);
//			System.out.println("ch :"+ ch + ", ch2 : "+ ch2);
			
			result.put(ch, cnt);
			
//			System.out.println("result"+result);
			if(result.get(ch).equals(ch2)) {
				result.put(ch,  cnt++);
//				System.out.println("result2"+result);
			} else {
				result.put(ch2, 1);
//				System.out.println("result3"+result);
			}
		}
		
		
		return result;
	}
	
	/**
	 * Map�� �޼��� compute Ư���� ���� ���ذ� �ʿ���.
	 * @param str
	 * @return
	 */
	public Map<Character, Integer> countDupplicateCharacters(String str) {
		Map<Character, Integer> result = new HashMap<>();
		
		for(int i=0;i<str.length(); i++) {
			char ch = str.charAt(i);
			
			//ch�� �ش�Ǵ� key���� value�� ã�� ���� ��������ش�.
			//�ٸ� v�� null, ���� ����� ���� ���� ��� �ʱⰪ�� 1�� �־��ְ�,
			//���� ���� ��쿡�� �� ���� +1 �� ���ش�.
			result.compute(ch, (k, v) -> (v == null)? 1 : ++v);

		}
		return result;
		
	}
	
	
	public void test() {
		Map<String , Integer> result = new HashMap<>();
		
		result.put("����1", 1000);
		result.put("����2", 2000);
		
		result.compute("����1", (k, v) -> v = v + 100);

		System.out.println(result.get("����1"));
		System.out.println(result.get("����2"));
	}
	
	public Map<Character, Long> countDupplicateCharacters2(String str){
		Map<Character, Long> result = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		return result;
	}
}
