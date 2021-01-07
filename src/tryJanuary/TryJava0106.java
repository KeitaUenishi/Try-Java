package tryJanuary;

import java.util.LinkedHashMap;

public class TryJava0106 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
	    map.put("Kyoko", "B");
	    map.put("Rio", "O");
	    map.put("Tsubame", "AB");
	    map.put("KurodaSensei", "A");
	    map.put("NekoSensei", "A");
	    for (String user : map.keySet()) {
	      String blood = map.get(user);
	      System.out.println(user + " " + blood);
	    }
	}
}
