package com.kindle.kinbook.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindle.kinbook.bean.GroupHasUserKey;
import com.kindle.kinbook.bean.User;
import com.kindle.kinbook.bean.UserDetail;
import com.kindle.kinbook.bean.UserProperties;
import com.kindle.kinbook.dao.GroupHasUserMapper;
import com.kindle.kinbook.dao.UserDetailMapper;
import com.kindle.kinbook.dao.UserMapper;
import com.kindle.kinbook.dao.UserPropertiesMapper;
import com.kindle.kinbook.service.IUserService;
import com.kindle.kinbook.service.common.MailService;
import com.kindle.kinbook.service.common.PublicService;

@Service("userService")
public class UserService implements IUserService {

	@Autowired
    UserMapper userMapper;
    @Autowired
    UserDetailMapper userDetailMapper;
    @Autowired
    GroupHasUserMapper groupHasUserMapper;
    @Autowired
    UserPropertiesMapper userPropertiesMapper;



    public boolean usernameExists(String username) throws Exception {
        //判断用户名是否存在
        int count = userMapper.getUserCountByName(username);
        if(count > 0){
            return true;
        }
        return false;
    }

    public int insertUser(User user) throws Exception {
        //添加用户
        userMapper.insert(user);
        return user.getId();
    }

    public int insertUserDetail(UserDetail userDetail) throws Exception {
        //添加用户详细信息
        userDetailMapper.insert(userDetail);
        return userDetail.getId();
    }

    public boolean addUserToGeneralGroup(int userId) throws Exception {
        //添加用户至普通用户组
        GroupHasUserKey groupHasUserKey = new GroupHasUserKey();
        groupHasUserKey.setGroup_id(3);  //普通用户组的ID为3
        groupHasUserKey.setUser_id(userId);
        groupHasUserMapper.insert(groupHasUserKey);
        return true;
    }

    public boolean addUserToAdminGroup(int userId) throws Exception {
        //添加用户至后台管理员组
        GroupHasUserKey groupHasUserKey = new GroupHasUserKey();
        groupHasUserKey.setGroup_id(2);  //后台管理员用户组的ID为2
        groupHasUserKey.setUser_id(userId);
        groupHasUserMapper.insert(groupHasUserKey);
        return true;
    }

    public boolean addUserToSuperAdminGroup(int userId) throws Exception {
        //添加用户至超级管理员组
        GroupHasUserKey groupHasUserKey = new GroupHasUserKey();
        groupHasUserKey.setGroup_id(1);  //超级管理员用户组的ID为1
        groupHasUserKey.setUser_id(userId);
        groupHasUserMapper.insert(groupHasUserKey);
        return true;
    }

    public int updateUserProperties(UserProperties userProperties) throws Exception {
        //更新用户的属性信息
        userPropertiesMapper.insert(userProperties);
        return userProperties.getId();
    }

    public boolean generateActivateLinkAndSendMail(int userId, String email) throws Exception {
        //生成用户的激活链接并发送激活邮件
        String activeLink = PublicService.generateActivateLink(userId);
        MailService.sendMailWithoutAttachment(email, "kinbook用户激活", activeLink);
        return true;
    }

    public boolean identifyUserPassword(String usernameOrEmail, String password) throws Exception {
        //验证用户名密码
        User user = userMapper.getUserByUsernamOrEmail(usernameOrEmail);
        if(user.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public boolean firstLoginToday(int userId) throws Exception {
        //判断用户在几天是否第一次登录
        Date lastLoginDate = userPropertiesMapper.getLastLoginDate(userId);
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String lastLoginDateStr = simpleDateFormat.format(lastLoginDate);
        String todayStr = simpleDateFormat.format(today);
        if(lastLoginDateStr.equals(todayStr)){
            return true;
        }
        return false;
    }

    public void addUserWealth(int userId, int wealth) throws Exception {
        //增加用户的财富值
        int userWealth = userPropertiesMapper.getUserWealth(userId);
        userWealth += wealth;
        UserProperties userProperties = new UserProperties();
        userProperties.setUser_id(userId);
        userProperties.setWealth(userWealth);
        userPropertiesMapper.updateUserWealthByUserId(userProperties);
    }

	public User queryUserById(int uid) {
		return userMapper.selectByPrimaryKey(uid) ;
	}
}
