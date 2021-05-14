package coms.example.epicchatagram.model;

import java.util.HashMap;

public class ContentDTO {
    private String explain;
    private String imageUrl;
    private String uid;
    private String userId;
    private long timestamp;
    private int favoriteCount;
    private HashMap<String,Boolean> favorites;

    public ContentDTO(String explain, String imageUrl, String uid, String userId, long timestamp, int favoriteCount, HashMap<String, Boolean> favorites) {
        this.explain = explain;
        this.imageUrl = imageUrl;
        this.uid = uid;
        this.userId = userId;
        this.timestamp = timestamp;
        this.favoriteCount = favoriteCount;
        this.favorites = favorites;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public HashMap<String, Boolean> getFavorites() {
        return favorites;
    }

    public void setFavorites(HashMap<String, Boolean> favorites) {
        this.favorites = favorites;
    }

    class Comment{
        private String uid;
        private String userId;
        private String comment;
        private long timestamp;

        public Comment(String uid, String userId, String comment, long timestamp) {
            this.uid = uid;
            this.userId = userId;
            this.comment = comment;
            this.timestamp = timestamp;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }
    }
}
