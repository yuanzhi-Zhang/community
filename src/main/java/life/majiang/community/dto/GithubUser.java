package life.majiang.community.dto;

/**
 * @Author: yuanzhi...
 * @Description:
 * @Date: created in  2019/9/21 9:25
 * @Modified By:
 */
public class GithubUser {
    private String name;
    private Long id;
    String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
