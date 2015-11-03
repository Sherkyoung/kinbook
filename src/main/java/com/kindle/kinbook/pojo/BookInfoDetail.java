package com.kindle.kinbook.pojo;

/**
 * 存放详细的图书信息的对象,没有任何的外键关系。所有的外键均查询出来，以字符串的形式表现来
 * 此对象直接用于前台和Service的数据传递
 * Created by zhanghao3 on 2015/10/19.
 */
public class BookInfoDetail {
    private Integer id;
    private String book_name;
    private String author;
    private String publisher;
    private String publish_date;
    private String page;
    private String price;
    private String isbn;
    private String rating_num;
    private String author_intro;
    private String book_intro;
    private String book_category;
    private String book_cover_link;
    private String douban_link;
    private String azw_filename_real;
    private String mobi_filename_real;
    private String word_filename_real;
    private String html_filename_real;
    private String rtf_filename_real;
    private String picture_filename_real;
    private String pdf_filename_real;
    private String zip_filename_real;

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

    public String getAuthor_intro() {
        return author_intro;
    }

    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }

    public String getBook_intro() {
        return book_intro;
    }

    public void setBook_intro(String book_intro) {
        this.book_intro = book_intro;
    }

    public String getBook_category() {
        return book_category;
    }

    public void setBook_category(String book_category) {
        this.book_category = book_category;
    }

    public String getBook_cover_link() {
        return book_cover_link;
    }

    public void setBook_cover_link(String book_cover_link) {
        this.book_cover_link = book_cover_link;
    }

    public String getDouban_link() {
        return douban_link;
    }

    public void setDouban_link(String douban_link) {
        this.douban_link = douban_link;
    }

    public String getAzw_filename_real() {
        return azw_filename_real;
    }

    public void setAzw_filename_real(String azw_filename_real) {
        this.azw_filename_real = azw_filename_real;
    }

    public String getMobi_filename_real() {
        return mobi_filename_real;
    }

    public void setMobi_filename_real(String mobi_filename_real) {
        this.mobi_filename_real = mobi_filename_real;
    }

    public String getWord_filename_real() {
        return word_filename_real;
    }

    public void setWord_filename_real(String word_filename_real) {
        this.word_filename_real = word_filename_real;
    }

    public String getHtml_filename_real() {
        return html_filename_real;
    }

    public void setHtml_filename_real(String html_filename_real) {
        this.html_filename_real = html_filename_real;
    }

    public String getRtf_filename_real() {
        return rtf_filename_real;
    }

    public void setRtf_filename_real(String rtf_filename_real) {
        this.rtf_filename_real = rtf_filename_real;
    }

    public String getPicture_filename_real() {
        return picture_filename_real;
    }

    public void setPicture_filename_real(String picture_filename_real) {
        this.picture_filename_real = picture_filename_real;
    }

    public String getPdf_filename_real() {
        return pdf_filename_real;
    }

    public void setPdf_filename_real(String pdf_filename_real) {
        this.pdf_filename_real = pdf_filename_real;
    }

    public String getZip_filename_real() {
        return zip_filename_real;
    }

    public void setZip_filename_real(String zip_filename_real) {
        this.zip_filename_real = zip_filename_real;
    }

    @Override
    public String toString() {
        return "BookInfoDetail{" +
                "id=" + id +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publish_date='" + publish_date + '\'' +
                ", page='" + page + '\'' +
                ", price='" + price + '\'' +
                ", isbn='" + isbn + '\'' +
                ", rating_num='" + rating_num + '\'' +
                ", author_intro='" + author_intro + '\'' +
                ", book_intro='" + book_intro + '\'' +
                ", book_category='" + book_category + '\'' +
                ", book_cover_link='" + book_cover_link + '\'' +
                ", douban_link='" + douban_link + '\'' +
                ", azw_filename_real='" + azw_filename_real + '\'' +
                ", mobi_filename_real='" + mobi_filename_real + '\'' +
                ", word_filename_real='" + word_filename_real + '\'' +
                ", html_filename_real='" + html_filename_real + '\'' +
                ", rtf_filename_real='" + rtf_filename_real + '\'' +
                ", picture_filename_real='" + picture_filename_real + '\'' +
                ", pdf_filename_real='" + pdf_filename_real + '\'' +
                ", zip_filename_real='" + zip_filename_real + '\'' +
                '}';
    }
}
