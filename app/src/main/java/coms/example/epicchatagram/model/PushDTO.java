package coms.example.epicchatagram.model;


public class PushDTO {
    private String to;
    private Notification notification;

    public PushDTO(String to, Notification notification) {
        this.to = to;
        this.notification = notification;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    class Notification{
        private String body;
        private String title;

        public Notification(String body, String title) {
            this.body = body;
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
