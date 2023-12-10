package javaAssignments;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Q1_ii_RemDup_Occ_Unique_Dup_MAP_7Dec {
	public static void main(String[] args) {
		int[] a = { 5, 4, 4, 2, 5,5, 4, 2, 1 };

		LinkedHashMap<Integer, Integer> lhmap = new LinkedHashMap<Integer, Integer>();
		// Step 1.Addingto map to remove duplicates
		// Step 2.Taking count as occurence as Values and incrementing in if block
		for (int i = 0; i < a.length; i++) {

			if (lhmap.containsKey(a[i]))
				lhmap.put(a[i], lhmap.get(a[i]) + 1);
			else
				lhmap.put(a[i], 1);

		}
		// Step 3. Printing occurence
		for (Entry<Integer, Integer> map : lhmap.entrySet()) {
			System.out.println(map.getKey() + " occurs " + map.getValue() + " times");
		}

		// Step 4.Printing Unique and Duplicates
		for (Entry<Integer, Integer> map : lhmap.entrySet()) {
			if (map.getValue() > 1)
				System.out.println(map.getKey() + " is duplicated ");
			else
				System.out.println(map.getKey() + " is unique ");
		}

	}

}
