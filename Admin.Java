
public class admin extends user {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public admin(String name, String userid, String password) {
        super(userid, password);
        this.name = name;
    }

    public admin(String name) {
        this.name = name;
    }

    public String admin(){
        String adminProp = "User Name : "+ this.getName() + " ,User Id : " + this.getUserid() + " ,Password : " +this.getPassword();
        return adminProp;
    }
    

    public admin() {
        super();
    }
    
    
}