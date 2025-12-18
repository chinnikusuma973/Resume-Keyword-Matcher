import java.util.HashSet;
import java.util.Scanner;

public class ResumeKeywordMatcher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Resume Text:");
        String resume = sc.nextLine().toLowerCase();

        System.out.println("Enter Job Keywords (comma separated):");
        String jobInput = sc.nextLine().toLowerCase();

        String[] jobKeywords = jobInput.split(",");

        HashSet<String> resumeWords = new HashSet<>();
        for (String word : resume.split(" ")) {
            resumeWords.add(word);
        }

        int matched = 0;
        HashSet<String> missing = new HashSet<>();

        for (String key : jobKeywords) {
            key = key.trim();
            if (resume.contains(key)) {
                matched++;
            } else {
                missing.add(key);
            }
        }

        double matchPercentage = ((double) matched / jobKeywords.length) * 100;

        System.out.println("\nMatch Percentage: " + matchPercentage + "%");
        System.out.println("Matched Keywords: " + matched);
        System.out.println("Missing Keywords: " + missing);

        sc.close();
    }
}