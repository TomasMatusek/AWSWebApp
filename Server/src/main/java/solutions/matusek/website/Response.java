package solutions.matusek.website;

import java.util.UUID;

public class Response {

    private final String id;
    private final String message;

    public Response(String message) {
        this.id = UUID.randomUUID().toString();
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
