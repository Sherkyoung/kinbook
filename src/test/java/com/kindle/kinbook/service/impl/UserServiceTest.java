package com.kindle.kinbook.service.impl;

import com.kindle.kinbook.bean.User;
import com.kindle.kinbook.bean.UserDetail;
import com.kindle.kinbook.bean.UserProperties;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by zhang on 2015/10/19.
 */
public class UserServiceTest extends TestCase {
    public static UserService userService;

    public UserServiceTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService = (UserService) applicationContext.getBean("userService");
    }

    public void testUsernameExists() throws Exception {
        try {
            System.out.println(userService.usernameExists("zhanghao"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testInsertUser() throws Exception {
        User user = new User();
        user.setLogin_name("yangshuai");
        user.setEmail("1029372@qq.com");
        user.setPassword("suiwuyi");
        System.out.println(userService.insertUser(user));
    }

    public void testInsertUserDetail() throws Exception {
        UserDetail userDetail = new UserDetail();
        userDetail.setUser_id(1);
        userDetail.setBirthday(new Date());
        userDetail.setBirthplace("江苏徐州");
        userDetail.setEducation("大学本科");
        userDetail.setGender(1);
        userDetail.setIntro("haha1029");
        userDetail.setJob_position("程序猿");
        userDetail.setLiveplace("江苏南京");
        System.out.println(userService.insertUserDetail(userDetail));
    }

    public void testAddUserToGeneralGroup() throws Exception {
        System.out.println(userService.addUserToGeneralGroup(1));
    }

    public void testAddUserToAdminGroup() throws Exception {
        System.out.println(userService.addUserToAdminGroup(1));
    }

    public void testAddUserToSuperAdminGroup() throws Exception {
//        System.out.println(userService.addUserToSuperAdminGroup(3));
    }

    public void testUpdateUserProperties() throws Exception {
        UserProperties userProperties = new UserProperties();
        userProperties.setUser_id(1);
        userProperties.setCreate_date(new Date());
        userProperties.setLast_login_date(new Date());
        userProperties.setStatus(0);
        userProperties.setWealth(1234567);
        System.out.println(userService.updateUserProperties(userProperties));
    }

    public void testGenerateActivateLinkAndSendMail() throws Exception {
        userService.generateActivateLinkAndSendMail(190,"1029372607@qq.com");
    }

    public void testIdentifyUserPassword() throws Exception {
        System.out.println(userService.identifyUserPassword("1029372607@qq.com", "zhanghaoshiSB"));
    }

    public void testFirstLoginToday() throws Exception {
        System.out.println(userService.firstLoginToday(1));
    }

    public void testAddUserWealth() throws Exception {
        userService.addUserWealth(1,20);
    }
}