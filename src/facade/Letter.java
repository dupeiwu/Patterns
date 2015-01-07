package facade;

public class Letter {

    private String write_name; 
    private String title; 
    private String content; 
    private String date;
    public String getWrite_name() {
        return write_name;
    }
    public void setWrite_name(String write_name) {
        this.write_name = write_name;
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
    public Letter(String write_name, String title, String content, String date) {
        this.write_name = write_name;
        this.title = title;
        this.content = content;
        this.date = date;
    }
    public Letter() {
    }
    
    
}
