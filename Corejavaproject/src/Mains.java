
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Mains {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of posts
        int n = Integer.parseInt(sc.nextLine());

        List<Post> posts = new ArrayList<>();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Read content and timestamp for each post
        for (int i = 0; i < n; i++) {

            String content = sc.nextLine();

            String date = sc.nextLine();

            LocalDateTime timestamp =
                    LocalDateTime.parse(date, formatter);

            posts.add(new Post(content, timestamp));
        }

        // Read filter date
        LocalDateTime filterDate =
                LocalDateTime.parse(sc.nextLine(), formatter);

        // Count word frequencies
        Map<String, Long> wordFrequency = posts.stream()

                .filter(post -> !post.getTimestamp().isBefore(filterDate))

                .map(Post::getContent)

                .flatMap(content -> Arrays.stream(content.split("\\s+")))

                .map(String::toLowerCase)

                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

        // Display result
        wordFrequency.forEach((word, count) ->
                System.out.println(word + " " + count));

        sc.close();
    }
}
