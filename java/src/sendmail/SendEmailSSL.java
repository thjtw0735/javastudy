package sendmail;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.activation.*;
 
public class SendEmailSSL {
public static void main(String[] args)
    {   
        // change accordingly
        String to = "thjtw0735@gmail.com"; 
         
        // change accordingly
        String from = "norvt@ton-dev.co.kr"; 
        
        // or IP address
        String host = "mail.ton-dev.co.kr"; 
         
        // mail id
        final String username = "norvt@ton-dev.co.kr";
         
        // correct password for gmail id
        final String password = "plokijuh44"; 
 
        System.out.println("TLSEmail Start");
        // Get the session object
         
        // Get system properties
        Properties properties = System.getProperties(); 
         
        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
         
        // SSL Port
        properties.put("mail.smtp.port", "465"); 
         
        // enable authentication
        properties.put("mail.smtp.auth", "true"); 
         
        // SSL Factory
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");  
 
        // creating Session instance referenced to 
        // Authenticator object to pass in 
        // Session.getInstance argument
        System.out.println("kk");
        Session session = Session.getDefaultInstance(properties,
            new javax.mail.Authenticator() {
                 
                // override the getPasswordAuthentication 
                // method
                protected PasswordAuthentication 
                        getPasswordAuthentication() {
                    return new PasswordAuthentication(username,
                                                    password);
                }
            });

        System.out.println("kkk");
        //compose the message
        try {
            // javax.mail.internet.MimeMessage class is mostly 
            // used for abstraction.
            MimeMessage message = new MimeMessage(session); 
             
            // header field of the header.
            message.setFrom(new InternetAddress(from));
            System.out.println("kkkk");
            message.addRecipient(Message.RecipientType.TO, 
                                  new InternetAddress(to));
            
            message.setSubject("subject");
            message.setText("Hello, aas is sending email");
            System.out.println("kkkkk");
         
            // Send message
            Transport.send(message);
            System.out.println("kkkkkk");
            System.out.println("Yo it has been sent..");
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
        
    }
}
