package coms.example.epicchatagram.model;

public class AlarmDTO {
    private String destinationUid;
    private String userId;
    private String uid;
    private int kind;
    private String message;
    private long timestamp;

    public AlarmDTO(String destinationUid, String userId, String uid, int kind, String message, long timestamp) {
        this.destinationUid = destinationUid;
        this.userId = userId;
        this.uid = uid;
        this.kind = kind;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getDestinationUid() {
        return destinationUid;
    }

    public void setDestinationUid(String destinationUid) {
        this.destinationUid = destinationUid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
