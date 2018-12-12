package Entities;


public class Publishers implements java.io.Serializable {


    private Integer id;
    private String name;

    public Publishers() {
    }

    public Publishers(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
