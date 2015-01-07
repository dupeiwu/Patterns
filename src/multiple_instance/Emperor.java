package multiple_instance;

public class Emperor {

    private int id;
    private String name;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public Emperor(String name)
    {
        this.name=name;
    }
    
    public void printInfo()
    {
        System.out.println(id+":"+name);
    }
    
}
