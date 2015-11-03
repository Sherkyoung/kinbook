package com.kindle.kinbook.service;

import com.kindle.kinbook.bean.User;
import com.kindle.kinbook.bean.UserDetail;
import com.kindle.kinbook.bean.UserProperties;

public interface IUserService {
    /**
     * 判断用户名是否存在
     * @param username
     * @return
     */
    boolean usernameExists(String username) throws Exception;

    /**
     * 插入用户的基本信息，获取该用户的ID
     * @return
     */
    int insertUser(User user) throws Exception;

    /**
     * 插入用户的详细信息，返回该条记录的ID
     * @param userDetail
     * @return
     */
    int insertUserDetail(UserDetail userDetail) throws Exception;

    /**
     * 将用户添加到普通用户组
     * @param userId
     * @return
     */
    boolean addUserToGeneralGroup(int userId) throws Exception;

    /**
     * 将用户添加到后台管理员组
     * @param userId
     * @return
     * @throws Exception
     */
    boolean addUserToAdminGroup(int userId) throws Exception;

    /**
     * 将用户添加到超级管理员组
     * @param userId
     * @return
     * @throws Exception
     */
    boolean addUserToSuperAdminGroup(int userId) throws Exception;

    /**
     * 修改用户属性，返回用户属性记录的ID
     * @param userProperties
     * @return
     * @throws Exception
     */
    int updateUserProperties(UserProperties userProperties) throws Exception;

    /**
     * 根据user_id生成用户的激活链接，并发送到用户邮箱
     * @param userId
     * @return
     */
    boolean generateActivateLinkAndSendMail(int userId, String email) throws Exception;

    /**
     * 验证用户名密码或者邮箱密码的正确性
     * @param usernameOrEmail
     * @param password
     * @return
     * @throws Exception
     */
    boolean identifyUserPassword(String usernameOrEmail,String password) throws Exception;

    /**
     * 判断用户上次登录时间是不是今天
     * @param userId
     * @return
     * @throws Exception
     */
    boolean firstLoginToday(int userId) throws Exception;

    /**
     * 增加用户的财富值
     * @param userId
     * @param wealth
     * @throws Exception
     */
    void addUserWealth(int userId, int wealth) throws Exception;
    
    /**
     * 根据用户id查询用户
     * @param userId
     * @return User
     */
    User queryUserById(int uid) ;
}
