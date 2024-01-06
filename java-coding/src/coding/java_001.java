package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sql.rowset.serial.SQLOutputImpl;

/**
 * @author bangle
 * 문자 개수 세기
 * 주어진 문자열에서 문자 개수를 세는 프로그램을 작성하라.
 */
public class java_001 {
	public static void main(String args[]) {
		String str = "안녕하세요. 제 이름은 이민하입니다. 잘 부탁 드립니다다다다다.";
		
		String str2  = "@#$#$%#$%#$^#^%^";
		
		java_001 java = new java_001();
		
		System.out.println(java.cntStr(str));
		
		System.out.println(java.cntStr(str2));
		
		
		System.out.println(java.countDupplicateCharacters(str));
		
		
		java.test();
		
		System.out.println(java.countDupplicateCharacters2(str2));
	}
	
	
	/**
	 * 셀프 식..
	 * 앞 뒤 문자만 비교해서 카운트한다는 문제..
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
	 * Map의 메서드 compute 특성에 대한 이해가 필요함.
	 * @param str
	 * @return
	 */
	public Map<Character, Integer> countDupplicateCharacters(String str) {
		Map<Character, Integer> result = new HashMap<>();
		
		for(int i=0;i<str.length(); i++) {
			char ch = str.charAt(i);
			
			//ch에 해당되는 key값의 value를 찾아 값을 적용시켜준다.
			//다만 v가 null, 아직 적용된 값이 없을 경우 초기값인 1을 넣어주고,
			//값이 있을 경우에는 그 값에 +1 씩 해준다.
			result.compute(ch, (k, v) -> (v == null)? 1 : ++v);

		}
		return result;
		
	}
	
	
	public void test() {
		Map<String , Integer> result = new HashMap<>();
		
		result.put("변수1", 1000);
		result.put("변수2", 2000);
		
		result.compute("변수1", (k, v) -> v = v + 100);

		System.out.println(result.get("변수1"));
		System.out.println(result.get("변수2"));
	}
	
	public Map<Character, Long> countDupplicateCharacters2(String str){
		Map<Character, Long> result = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		return result;
	}
}
