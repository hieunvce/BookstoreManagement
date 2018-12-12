package Entities;

public class Genres implements java.io.Serializable {


    private Integer id;
    private String name;

    public Genres() {
    }

    public Genres(String name) {
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


