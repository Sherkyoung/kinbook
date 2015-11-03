package com.kindle.kinbook.service.impl;

import com.kindle.kinbook.dao.BookCategoryMapper;
import com.kindle.kinbook.dao.BookCoverMapperMapper;
import com.kindle.kinbook.dao.BookMapper;
import com.kindle.kinbook.dao.EbookResourcesMapper;
import com.kindle.kinbook.pojo.BookInfoBasic;
import com.kindle.kinbook.pojo.BookInfoDetail;
import com.kindle.kinbook.pojo.QueryConditionItem1;
import com.kindle.kinbook.service.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhang on 2015/10/19.
 */
@Service
@Transactional
public class BookService implements IBookService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookCategoryMapper bookCategoryMapper;
    @Autowired
    private BookCoverMapperMapper bookCoverMapperMapper;
    @Autowired
    private EbookResourcesMapper ebookResourcesMapper;

    public BookInfoDetail getBookInfoDetailById(int id) throws Exception {
        BookInfoDetail bookInfoDetail = bookMapper.getBookInfoDetailById(id);
        if (bookInfoDetail != null){
            return bookInfoDetail;
        }
        return null;
    }

    public BookInfoBasic getBookInfoBasicById(int id) throws Exception {
        BookInfoBasic bookInfoBasic = bookMapper.getBookInfoBasicById(id);
        if (bookInfoBasic != null){
            return bookInfoBasic;
        }
        return null;
    }


    public List<BookInfoBasic> getBasicBookInfoByCategoryRatingAsce(int startIndex, int length, String category) {
        QueryConditionItem1 queryConditionItem1 = new QueryConditionItem1(startIndex,length,category);
        List<BookInfoBasic> books = bookMapper.getBasicBookInfoByCategoryAsce(queryConditionItem1);
        if (books != null && books.size() > 0){
            return books;
        }
        return null;
    }

    public List<BookInfoBasic> getBasicBookInfoByCategoryRatingDesc(int startIndex, int length, String category) {
        QueryConditionItem1 queryConditionItem1 = new QueryConditionItem1(startIndex,length,category);
        List<BookInfoBasic> books = bookMapper.getBasicBookInfoByCategoryDesc(queryConditionItem1);
        if (books != null && books.size() > 0){
            return books;
        }
        return null;
    }

    public List<BookInfoBasic> getBasicBookInfoByRatingAsce(int startIndex, int length) {
        QueryConditionItem1 queryConditionItem1 = new QueryConditionItem1(startIndex,length,"");
        List<BookInfoBasic> books = bookMapper.getBasicBookInfoByRatingAsce(queryConditionItem1);
        if (books != null && books.size() > 0){
            return books;
        }
        return null;
    }

    public List<BookInfoBasic> getBasicBookInfoByRatingDesc(int startIndex, int length) {
        QueryConditionItem1 queryConditionItem1 = new QueryConditionItem1(startIndex,length,"");
        List<BookInfoBasic> books = bookMapper.getBasicBookInfoByRatingDesc(queryConditionItem1);
        if (books != null && books.size() > 0){
            return books;
        }
        return null;
    }

    public List<BookInfoBasic> getBasicBookInfoRealtedToAuthorByRatingDesc(String author) {
        List<BookInfoBasic> books = bookMapper.getBasicBookInfoRealtedToAuthorByRatingDesc(author);
        if (books != null && books.size() > 0){
            return books;
        }
        return null;
    }

    public List<BookInfoBasic> getBasicBookInfoRandomWithRatingGreater(float rating_num, int length) {
        return null;
    }
}
