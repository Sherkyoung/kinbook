package com.kindle.kinbook.pojo;

/**
 * 查询条件辅助类
 * Created by zhanghao3 on 2015/10/20.
 */
public class QueryConditionItem1 {
    int startIndex;
    int length;
    String category;

    public QueryConditionItem1(int startIndex,int length,String category){
        this.startIndex = startIndex;
        this.length = length;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "QueryConditionItem1{" +
                "startIndex=" + startIndex +
                ", length=" + length +
                ", category='" + category + '\'' +
                '}';
    }
}
