package com.kindle.kinbook.service.common;

import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.util.Properties;

/**
 * Created by zhang on 2015/10/19.
 */
@Service
public class MailService {

    /**
     * 发送不带附件的邮件
     * @param mail_to
     * @param subject
     * @param content
     * @return
     */
    public static boolean sendMailWithoutAttachment(String mail_to, String subject,
                                             String content) {
        Properties properties = new Properties();
        properties.setProperty("mail.host", PublicVariable.MAIL_HOST);
        properties.setProperty("mail.transport.protocol","smtp");
        properties.setProperty("mail.smtp.auth","true");

        //使用JavaMail发送邮件的5个步骤
        //1、创建session
        Session session = Session.getInstance(properties);
        //2、通过session得到transport对象
        Transport ts = null;
        try {
            ts = session.getTransport();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        //3、连上邮件服务器，需要发件人提供邮箱的用户名和密码进行验证
        try {
            ts.connect(PublicVariable.MAIL_HOST, PublicVariable.MAIL_USERNAME, PublicVariable.MAIL_PASSWORD);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        //4、创建邮件
        MimeMessage message = null;
        try {
            //创建邮件对象
            message = new MimeMessage(session);
            //指明邮件的发件人
            message.setFrom(new InternetAddress(PublicVariable.MAIL_FROM));
            //指明邮件的收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(mail_to));
            //邮件的标题
            message.setSubject(subject);
            //邮件的文本内容
            message.setContent(content, "text/html;charset=UTF-8");
            //返回创建好的邮件对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        //5、发送邮件
        try {
            ts.sendMessage(message, message.getAllRecipients());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        try {
            ts.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 发送带有附件的邮件
     * @param mail_to
     * @param subject
     * @param content
     * @param attachment
     * @return
     */
    public static boolean sendMailWidthAttachment(String mail_to, String subject,
                                           String content, File attachment) {
        Properties properties = new Properties();
        properties.setProperty("mail.host", PublicVariable.MAIL_HOST);
        properties.setProperty("mail.transport.protocol","smtp");
        properties.setProperty("mail.smtp.auth","true");

        //使用JavaMail发送邮件的5个步骤
        //1、创建session
        Session session = Session.getInstance(properties);
        //2、通过session得到transport对象
        Transport ts = null;
        try {
            ts = session.getTransport();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        //3、连上邮件服务器，需要发件人提供邮箱的用户名和密码进行验证
        try {
            ts.connect(PublicVariable.MAIL_HOST, PublicVariable.MAIL_USERNAME, PublicVariable.MAIL_PASSWORD);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        //4、创建邮件
        MimeMessage message = null;
        try {
            //创建邮件对象
            message = new MimeMessage(session);
            //指明邮件的发件人
            message.setFrom(new InternetAddress(PublicVariable.MAIL_FROM));
            //指明邮件的收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(mail_to));
            //邮件的标题
            message.setSubject(subject);

            // 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
            Multipart multipart = new MimeMultipart();

            // 添加邮件正文
            BodyPart contentPart = new MimeBodyPart();
            contentPart.setContent(content, "text/html;charset=UTF-8");
            multipart.addBodyPart(contentPart);

            if (attachment != null) {
                BodyPart attachmentBodyPart = new MimeBodyPart();
                DataSource source = new FileDataSource(attachment);
                attachmentBodyPart.setDataHandler(new DataHandler(source));

                // 网上流传的解决文件名乱码的方法，其实用MimeUtility.encodeWord就可以很方便的搞定
                // 这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
                //sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
                //messageBodyPart.setFileName("=?GBK?B?" + enc.encode(attachment.getName().getBytes()) + "?=");

                //MimeUtility.encodeWord可以避免文件名乱码
                attachmentBodyPart.setFileName(MimeUtility.encodeWord(attachment.getName()));
                multipart.addBodyPart(attachmentBodyPart);
            }

            // 将multipart对象放到message中
            message.setContent(multipart);
            // 保存邮件
            message.saveChanges();

            //返回创建好的邮件对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        //5、发送邮件
        try {
            ts.sendMessage(message, message.getAllRecipients());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        try {
            ts.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return true;
    }
}
