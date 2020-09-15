import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Result {

	public String generateOutput(String input) {
		
		/*Generate the map with character as a key and number of occurrences as frequencies*/
		Map<Character, Integer> freq = new HashMap<>();
		int len = input.length();
		for(int i = 0; i < len; i++) {
			char c = input.charAt(i);
			c = Character.toLowerCase(c);
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		
		/* Take the values from the HashMap and create a list and sort it */
		Set<Integer> set = new HashSet<>(freq.values());
		List<Integer> values = new ArrayList<>(set);
		Collections.sort(values);
		
		/* Create a new Map orderMap with integer as a key and String Builder as a value
		 * Update the Map such that all the character with same frequencies list together
		 * Final values in map will be such that integer as a key and string builder as a value which contains same frequencies character in order
		 */
		Map<Integer, StringBuilder> orderMap = new HashMap<>();
		for(int i = 0; i < len; i++) {
			char chr = input.charAt(i);
			char cl = Character.toLowerCase(chr);
			int key = freq.get(cl);
			if(!orderMap.containsKey(key))
				orderMap.put(key, new StringBuilder());
			orderMap.get(key).append(chr);
		}
		
		/*
		 * Iterate on the values list
		 * Start from the first character and get the value from the orderMap
		 * Append it in the sb String Builder
		 */
		StringBuilder sb = new StringBuilder();
		for(int v: values) {
			sb.append(orderMap.get(v).toString());
		}
		
		/*Return the string*/
		return sb.toString();
		
	}

}
