package sendmail;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.activation.*;
 
public class SendEmailTLS {
 
    public static void main(String[] args) {
         
        // change accordingly
        final String username = "norvt@ton-dev.co.kr";   
         
        // change accordingly
        final String password = "plokijuh44";
         
        // or IP address
        final String host = "mail.ton-dev.co.kr"; 
 
        // Get system properties
        Properties props = new Properties();             
         
        // enable authentication
        props.put("mail.smtp.auth", host);               
         
        // enable STARTTLS
        props.put("mail.smtp.starttls.enable", "true");    
         
        // Setup mail server
        props.put("mail.smtp.host", "smtp.gmail.com");     
         
        // TLS Port
        props.put("mail.smtp.port", "587");                
        System.out.println("ll");
        // creating Session instance referenced to 
        // Authenticator object to pass in 
        // Session.getInstance argument
        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            
            //override the getPasswordAuthentication method
            protected PasswordAuthentication 
                           getPasswordAuthentication() {
                                        
                return new PasswordAuthentication(username, 
                                                 password);
            }
          });
        System.out.println("ll1");
        try {
             
            // compose the message
            // javax.mail.internet.MimeMessage class is 
            // mostly used for abstraction.
            Message message = new MimeMessage(session);    
             
            // header field of the header.
            message.setFrom(new InternetAddress("norvt@ton-dev.co.kr")); 
            System.out.println("ll2"); 
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("norvt@ton-dev.co.kr"));
            message.setSubject("hello");
            message.setText("Yo it has been sent");
            System.out.println("ll3");
            Transport.send(message);         //send Message
            System.out.println("ll4");
            System.out.println("Done");
 
        } catch (MessagingException e) {
           /* throw new RuntimeException(e);*/
        	  e.printStackTrace();
        }
    }
}
