package com.kindle.kinbook.service;


import java.util.List;

import com.kindle.kinbook.pojo.BookInfoBasic;
import com.kindle.kinbook.pojo.BookInfoDetail;

/**
 * Created by zhang on 2015/10/19.
 */
public interface IBookService {
    /**
     * 根据ID获取图书的详细信息
     * @param id
     * @return
     * @throws Exception
     */
    BookInfoDetail getBookInfoDetailById(int id) throws Exception;

    /**
     * 根据ID获取图书的基本信息
     * @param id
     * @return
     * @throws Exception
     */
    BookInfoBasic getBookInfoBasicById(int id) throws Exception;

    /**
     * 获取指定类别中，根据评分降序(评分从高到低)，得到指定数量的图书的基本信息
     * @param startIndex    指定从哪开始获取
     * @param length        指定获取的长度
     * @param category      图书类别
     * @return
     */
    List<BookInfoBasic> getBasicBookInfoByCategoryRatingAsce(int startIndex,int length,String category);

    /**
     * 获取指定类别中，根据评分降序(评分由低到高)，得到指定数量的图书的基本信息
     * @param startIndex
     * @param length
     * @param category
     * @return
     */
    List<BookInfoBasic> getBasicBookInfoByCategoryRatingDesc(int startIndex,int length,String category);

    /**
     * 不指定类别，按照评分升序查询(评分由低到高)
     * @param startIndex
     * @param length
     * @return
     */
    List<BookInfoBasic> getBasicBookInfoByRatingAsce(int startIndex, int length);

    /**
     * 不指定类别，按照评分降序查询(评分由高到低)
     * @param startIndex
     * @param length
     * @return
     */
    List<BookInfoBasic> getBasicBookInfoByRatingDesc(int startIndex, int length);

    /**
     * 查询指定作者的相关图书(返回结果按照图书的评分 降序)
     * @param author
     * @return
     */
    List<BookInfoBasic> getBasicBookInfoRealtedToAuthorByRatingDesc(String author);

    /**
     * 随机获取图书评分超过rating_num的图书length册
     * @param rating_num
     * @param length
     * @return
     */
    List<BookInfoBasic> getBasicBookInfoRandomWithRatingGreater(float rating_num,int length);
}
