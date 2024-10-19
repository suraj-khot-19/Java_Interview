import java.util.Arrays;

public class Lambda_to_sort_array_strings {
    public static void main(String[] args) {
        String[] arr={"suraj","sanjay","khot","santosh"};

        Arrays.sort(arr,(s1,s2)->s1.compareTo(s2));

        System.out.println(Arrays.stream(arr).toList());
    }
}
