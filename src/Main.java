import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println("task 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums3 = new ArrayList<>();
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 == 0) {
                nums3.add(nums2.get(i));
            }
        }
        System.out.println(nums3.stream().distinct().toList());

        System.out.println("task 3");
        List<String> nums4 = new ArrayList<>(List.of("one", "one", "two", "three", "one", "four", "five", "five", "six", "seven"));
        Set<String> setValue = new HashSet<>();
        for (String s : nums4) {
            setValue.add(s);
        }
        System.out.println(setValue);

        System.out.println("task 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> strings1 = new HashMap<>();
        for (String string : strings) {
            if (!strings1.containsKey(string)) {
                strings1.put(string, 1);
            } else {
                strings1.put(string, strings1.get(string) + 1);
            }

        }
        System.out.println(strings1.values());
    }
}
