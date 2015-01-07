package facade;

public class Envelope {

    private String post_address;
    private String post_name;
    private String zip_code;
    private String write_name;
    private String write_address;
    public String getPost_address() {
        return post_address;
    }
    public void setPost_address(String post_address) {
        this.post_address = post_address;
    }
    public String getPost_name() {
        return post_name;
    }
    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }
    public String getZip_code() {
        return zip_code;
    }
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
    public String getWrite_name() {
        return write_name;
    }
    public void setWrite_name(String write_name) {
        this.write_name = write_name;
    }
    public String getWrite_address() {
        return write_address;
    }
    public void setWrite_address(String write_address) {
        this.write_address = write_address;
    }
    public Envelope(String post_address, String post_name, String zip_code,
            String write_name, String write_address) {
        this.post_address = post_address;
        this.post_name = post_name;
        this.zip_code = zip_code;
        this.write_name = write_name;
        this.write_address = write_address;
    }
    public Envelope() {
    }
    
}
