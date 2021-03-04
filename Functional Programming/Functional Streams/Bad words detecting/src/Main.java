import java.util.*;
import java.util.stream.*;

import static java.util.Comparator.naturalOrder;

class BadWordsDetector {

    private static Stream<String> createBadWordsDetectingStream(String text,
                                                                List<String> badWords) {
        List<String> detector = Arrays.asList(text.split("\\s")).stream()
                .filter(n -> badWords.contains(n))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        detector.sort(naturalOrder());
        return detector.stream();
        // write your code here
//        return Stream.of(detector.toString());
    }


    /* Do not change the code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(";");

        // the first part is a text
        String text = parts[0];

        // the second part is a bad words dictionary
        List<String> dict = parts.length > 1 ?
                Arrays.asList(parts[1].split(" ")) :
                Collections.singletonList("");

        System.out.println(createBadWordsDetectingStream(text, dict).collect(Collectors.toList()));
    }

}
