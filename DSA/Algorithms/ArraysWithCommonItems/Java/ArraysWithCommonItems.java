import java.util.HashSet;
import java.util.Set;

public class ArraysWithCommonItems {
    public static void main(String[] args) {
        char[] arrayOne = {'a', 'b', 'f', 'w'};
        char[] arrayTwo = {'c', 'd', 'h', 'w'};
        char[] arrayThree = {'c', 'd', 'h', 'z'};
        System.out.println(findByBruteForceApproach(arrayOne, arrayTwo));
        System.out.println(findByOptimizedApproach(arrayOne, arrayTwo));
        System.out.println(findByBruteForceApproach(arrayOne, arrayThree));
        System.out.println(findByOptimizedApproach(arrayOne, arrayThree));
    }

    public static boolean findByBruteForceApproach(char[] arr1, char[] arr2) {
        for (char c : arr1) {
            for (char value : arr2) {
                if (c == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findByOptimizedApproach(char[] arr1, char[] arr2) {
        Set<Character> set = new HashSet<>();
        for (char c : arr1) {
            set.add(c);
        }

        for (char c : arr2) {
            if (set.contains(c)) {
                return true;
            }
        }
        return false;
    }
}
