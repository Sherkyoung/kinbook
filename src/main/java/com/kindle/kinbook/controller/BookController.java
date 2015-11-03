package com.kindle.kinbook.controller;

import com.kindle.kinbook.pojo.BookInfoBasic;
import com.kindle.kinbook.pojo.BookInfoDetail;
import com.kindle.kinbook.service.impl.BookService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by zhanghao3 on 2015/10/23.
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/showBasicBookInfo")
    public @ResponseBody List<BookInfoBasic>  showBatisBookInfo(){
        //按评分降序显示20本书
        List<BookInfoBasic> books = bookService.getBasicBookInfoByRatingDesc(0,20);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("books",books);
//        modelAndView.setViewName("showBasicBookInfo");
        return books;
    }

    @RequestMapping("/showDetailBookInfo")
    public ModelAndView showDetailBookInfo(int id) throws Exception {
        //按评分降序显示20本书
        BookInfoDetail book = bookService.getBookInfoDetailById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("book",book);
        modelAndView.setViewName("showDetailBookInfo");
        return modelAndView;
    }
}
