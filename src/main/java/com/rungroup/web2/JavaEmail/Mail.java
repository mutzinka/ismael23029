//package com.rungroup.web2.JavaEmail;
//
//import com.rungroup.web2.model.User;
//import org.springframework.context.annotation.Bean;
//
//import javax.mail.Session;
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
//public class Mail {
//    private static String USER_NAME = "ganzaismaelmkp";
//    private static String PASSWORD = "ghadcqfsmjedlnvp";
//    private static String RECIPIENT = "ganzaismaelmkp@gmail.com";
////    @Bean
//    public void onApplying(User user){
//        String to [] ={user.getEmail()};
//        String body="Dear User With Id: "+user.getId()+"  \n"+
//                "You have Applied successfully. We really appreciate your commitment and participation to our Platform. " +
//                "\n If this message is not for you Ignore It. \n THANK YOU!";
//
//        String from=USER_NAME;
//        String subject="Primary And Nursary School finding Solution Application";
//        Properties props = System.getProperties();
//        String host = "smtp.gmail.com";
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.user", USER_NAME);
//        props.put("mail.smtp.password", PASSWORD);
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.auth", "true");
//
//        Session session = Session.getDefaultInstance(props);
//        MimeMessage message = new MimeMessage(session);
//
//        try {
//            message.setFrom(new InternetAddress(USER_NAME));
//            InternetAddress[] toAddress = new InternetAddress[to.length];
//
//            // To get the array of addresses
//            for( int i = 0; i < to.length; i++ ) {
//                toAddress[i] = new InternetAddress(to[i]);
//            }
//
//            for( int i = 0; i < toAddress.length; i++) {
//                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
//            }
//
//            message.setSubject(subject);
//            message.setText(body);
//            Transport transport = session.getTransport("smtp");
//            transport.connect(host, USER_NAME, PASSWORD);
//            transport.sendMessage(message, message.getAllRecipients());
//            transport.close();
//        }
//        catch (AddressException ae) {
//            ae.printStackTrace();
//        }
//        catch (MessagingException me) {
//            me.printStackTrace();
//        }
//    }
//
//}
