package tryJanuary;

import java.util.LinkedHashMap;
import java.util.Map;

public class TryJava0106 {

	public static void main(String[] args) {
		// 連想配列

		Map<String, String> hashMap = new LinkedHashMap<String, String>();
		hashMap.put("Kyoko", "A");
		hashMap.put("Rio", "O");
		hashMap.put("Tsubame", "AB");
		hashMap.put("KurodaSensei", "A");
		hashMap.put("NekoSensei", "A");
		
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}
