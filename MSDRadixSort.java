import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MSDRadixSort {

    public static void main(String[] args) {
        String[] strs = {"abg", "daf", "rsd", "bab", "wan"};
        List<String> strl = new ArrayList<>();
        for (String str : strs) {
            strl.add(str);
        }
        System.out.println(strl);


    }

    public static List<String> msd(List<String> items) {
        return msd(items, 0);
    }

    private static List<String> msd(java.util.List<String> items, int index) {
        if (index > items.get(0).length() || items.size() <= 1) {
            return items;
        }


        List<String> answer = new ArrayList<>();
        int start = 0;
        stableSort(items, index);

        for (int end = 1; end <= items.size(); end++) {
            if (end == items.size() || items.get(start).charAt(index) != items.get(end).charAt(index)) {
                List<String> subList = items.subList(start, end);
                answer.addAll(msd(subList, index + 1));
                start = end;
            }
        }
        return answer;
    }

    private static void stableSort(java.util.List<String> items, int index) {
        items.sort(Comparator.comparingInt(o -> o.charAt(index)));
    }

}
