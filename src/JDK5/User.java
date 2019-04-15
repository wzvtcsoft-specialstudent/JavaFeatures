package JDK5;

/**
 * @Author: Salexal.fww
 * @Date: 2019/4/12 8:54
 * @Version 1.0
 * @Type
 */
public class User {

    private int id;
    private String password;
    private String name;
    public int status;
    public User() {
    }

    public User(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
