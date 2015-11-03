package com.kindle.kinbook.pojo;

/**
 * 查询条件辅助类
 * Created by zhanghao3 on 2015/10/20.
 */
public class QueryConditionItem2 {
    String author;
    int startIndex;
    int length;

    public QueryConditionItem2(String author, int startIndex, int length){
        this.startIndex = startIndex;
        this.length = length;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "QueryConditionItem2{" +
                "author='" + author + '\'' +
                ", startIndex=" + startIndex +
                ", length=" + length +
                '}';
    }
}
