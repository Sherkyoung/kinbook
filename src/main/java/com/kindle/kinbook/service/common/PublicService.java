package com.kindle.kinbook.service.common;

import org.apache.commons.lang.RandomStringUtils;

/**
 * Created by zhang on 2015/10/19.
 */
public class PublicService {
    /**
     * 根据userId生成激活链接
     * @param userId
     * @return
     */
    public static String generateActivateLink(int userId){
        String password = "";
        char[] chararr = (userId + "").toCharArray();
        for(Character temp : chararr){
            int num = Integer.parseInt(temp.toString());
            num += 97;
            password += (char)num;
        }
        String activeLink = PublicVariable.ACTIVE_LINK_BASE + RandomStringUtils.randomAlphanumeric(20) + password;
        return activeLink;
    }
}
