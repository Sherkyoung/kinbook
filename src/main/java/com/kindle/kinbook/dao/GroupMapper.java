package com.kindle.kinbook.dao;

import com.kindle.kinbook.bean.Group;

public interface GroupMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table group
	 * @mbggenerated  Tue Oct 20 22:18:39 CST 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table group
	 * @mbggenerated  Tue Oct 20 22:18:39 CST 2015
	 */
	int insert(Group record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table group
	 * @mbggenerated  Tue Oct 20 22:18:39 CST 2015
	 */
	int insertSelective(Group record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table group
	 * @mbggenerated  Tue Oct 20 22:18:39 CST 2015
	 */
	Group selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table group
	 * @mbggenerated  Tue Oct 20 22:18:39 CST 2015
	 */
	int updateByPrimaryKeySelective(Group record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table group
	 * @mbggenerated  Tue Oct 20 22:18:39 CST 2015
	 */
	int updateByPrimaryKey(Group record);
}