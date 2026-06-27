
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mainn{

    public static void main(String[] args) {

        // Create list of posts
        List<Post> posts = Arrays.asList(

                new Post("Java is powerful",
                        LocalDateTime.of(2024, 5, 20, 10, 30)),

                new Post("Java Stream API is powerful",
                        LocalDateTime.of(2024, 6, 10, 11, 0)),

                new Post("Learn Java Streams",
                        LocalDateTime.of(2024, 7, 5, 9, 15))

        );

        // Filter date
        LocalDateTime filterDate =
                LocalDateTime.of(2024, 6, 1, 0, 0);

        // Count word frequencies
        Map<String, Long> wordFrequency = posts.stream()

                // Filter posts
                .filter(post -> post.getTimestamp().isAfter(filterDate))

                // Map to content
                .map(Post::getContent)

                // Split into words
                .flatMap(content -> Arrays.stream(content.split(" ")))

                // Convert to lowercase
                .map(String::toLowerCase)

                // Count frequency
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        // Display result
        System.out.println("Word Frequencies:");

        wordFrequency.forEach((word, count) ->
                System.out.println(word + " : " + count));

    }
}