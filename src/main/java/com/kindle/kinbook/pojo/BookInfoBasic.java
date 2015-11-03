package com.kindle.kinbook.pojo;

/**
 * 存放简单的图书信息的对象,没有任何的外键关系。所有的外键均查询出来，以字符串的形式表现来
 * Created by zhanghao3 on 2015/10/19.
 */
public class BookInfoBasic {
    private Integer id;
    private String book_name;
    private String author;
    private String publisher;
    private String publish_date;
    private String page;
    private String price;
    private String isbn;
    private String rating_num;
    private String category;
    private String book_cover;

    public String getBook_cover() {
        return book_cover;
    }

    public void setBook_cover(String book_cover) {
        this.book_cover = book_cover;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getRating_num() {
        return rating_num;
    }

    public void setRating_num(String rating_num) {
        this.rating_num = rating_num;
    }

    @Override
    public String toString() {
        return "BookInfoBasic{" +
                "id=" + id +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publish_date='" + publish_date + '\'' +
                ", page='" + page + '\'' +
                ", price='" + price + '\'' +
                ", isbn='" + isbn + '\'' +
                ", rating_num='" + rating_num + '\'' +
                ", category='" + category + '\'' +
                ", book_cover='" + book_cover + '\'' +
                '}';
    }
}
