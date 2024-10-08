import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public static List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute(str, "", permutations);
        return permutations;
    }

    private static void permute(String str, String prefix, List<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i), permutations);
            }
        }
    }

    public static void main(String[] args) {
        String str = "dog";
        List<String> permutations = generatePermutations(str);
        System.out.println("Permutations of " + str + ": " + permutations);
    }
}
