package Model;
// Memo.java
public class Memo {
    private String title;
    private String content;
    private String date;
    private boolean isCompleted;

    public Memo(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}


