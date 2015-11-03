package com.kindle.kinbook.service.impl;

import com.kindle.kinbook.pojo.BookInfoBasic;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by zhanghao3 on 2015/10/20.
 */
public class BookServiceTest extends TestCase {
    public static BookService bookService;

    public BookServiceTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        bookService = (BookService) applicationContext.getBean("bookService");
    }

    public void testGetBookInfoDetailById() throws Exception {
        System.out.println(bookService.getBookInfoDetailById(30));
    }

    public void testGetBookInfoBasicById() throws Exception {
        System.out.println(bookService.getBookInfoBasicById(30));
    }

    public void testGetBasicBookInfoByCategoryAsce() throws Exception {
        List<BookInfoBasic> books = bookService.getBasicBookInfoByCategoryRatingAsce(1, 20, "小说");
        for (BookInfoBasic temp : books){
            System.out.println(temp);
        }
    }

    public void testGetBasicBookInfoByCategoryRatingDesc() throws Exception {
        List<BookInfoBasic> books = bookService.getBasicBookInfoByCategoryRatingDesc(1, 20, "小说");
        for (BookInfoBasic temp : books){
            System.out.println(temp);
        }
    }

    public void testGetBasicBookInfoByRatingAsce() throws Exception {
        List<BookInfoBasic> books = bookService.getBasicBookInfoByRatingAsce(0,5);
        for (BookInfoBasic temp : books){
            System.out.println(temp);
        }
    }

    public void testGetBasicBookInfoByRatingDesc() throws Exception {
        List<BookInfoBasic> books = bookService.getBasicBookInfoByRatingDesc(0, 5);
        for (BookInfoBasic temp : books){
            System.out.println(temp);
        }
    }

    public void testGetBasicBookInfoRealtedToAuthorByRatingDesc() throws Exception {
        List<BookInfoBasic> books = bookService.getBasicBookInfoRealtedToAuthorByRatingDesc("东野圭吾");
        if(books != null){
	        for (BookInfoBasic temp : books){
	            System.out.println(temp);
	        }
        }
    }

    public void testGetBasicBookInfoRandomWithRatingGreater() throws Exception {

    }
}