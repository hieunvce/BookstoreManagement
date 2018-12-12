package Entities;

public class Books {

    private Integer id;
    private String title;
    private String authors;
    private String genres;
    private String publishers;
    private String isbn;
    private Integer publicationYear;
    private Integer price;
    private Integer availableQuantity;

    public Books() {
    }

    public Books(String title, String authors, String genres, String publishers,
                 String isbn, Integer publicationYear, Integer price, Integer availableQuantity) {
        this.title = title;
        this.authors = authors;
        this.genres = genres;
        this.publishers = publishers;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthors() {
        return this.authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getGenres() {
        return this.genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getPublishers() {
        return this.publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }


}

