package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RadixSort {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("abc");
		arr.add("tes");
		arr.add("abg");
		arr.add("gdf");
		arr.add("dfa");
		arr = msd(arr);

		for(String str : arr) {
			System.out.println(str);
		}

	}


	public static List<String> msd(List<String> items) {
		return msd(items, 0);
	}

	private static List<String> msd(List<String> items, int index) {
		if (items.size() <= 1 || index >= items.get(0).length()) {
			return items;
		}
		List<String> answer = new ArrayList<>();
		int start = 0;
		stableSort(items, index);

		// boxing 
		for (int end = 1; end <= items.size(); end++) {
			if (end == items.size() || items.get(start).charAt(index) != items.get(end).charAt(index)) {
				List<String> subList = items.subList(start, end);
				answer.addAll(msd(subList, index + 1));
				start = end;
			}
		}
		return answer;
	}

	private static void stableSort(List<String> items, int index) {
		items.sort(Comparator.comparingInt(o -> o.charAt(index)));
	}


}
