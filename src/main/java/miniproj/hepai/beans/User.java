package miniproj.hepai.beans;

public class User {
    private Integer id;

    private String name;

    private String photo;

    private String sex;

    private String qq;
    private String password;

    public User() {
    }
    public User(String name,String photo,String sex,String qq,String password) {
        this.name = name;
        this.photo = photo;
        this.sex = sex;
        this.qq = qq;
        this.password =password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
