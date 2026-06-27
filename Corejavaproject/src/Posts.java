import java.time.LocalDateTime;

public class Posts {

    private String content;
    private LocalDateTime timestamp;

    public Posts(String content, LocalDateTime timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}