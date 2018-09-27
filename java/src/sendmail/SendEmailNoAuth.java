package sendmail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.activation.*;

public class SendEmailNoAuth {

	  public static void main(String[] args)
	    {
	        // change below lines accordingly
	        String to = "thjtw0735@gmail.com"; 
	        String from = "norvt@ton-dev.co.kr"; 
	        String host = "mail.ton-dev.co.kr"; // or IP address
	 
	        // Get the session object
	        // Get system properties
	        Properties properties = System.getProperties(); 
	 
	        // Setup mail server
	        properties.setProperty("mail.smtp.host", host); 
	 
	        // Get the default Session object
	        Session session = Session.getDefaultInstance(properties); 
	 
	        // compose the message
	        try {
	 
	            // javax.mail.internet.MimeMessage class 
	            // is mostly used for abstraction.
	            MimeMessage message = new MimeMessage(session); 
	 
	            // header field of the header.
	            message.setFrom(new InternetAddress(from)); 
	            message.addRecipient(Message.RecipientType.TO, 
	                                new InternetAddress(to));
	            message.setSubject("subject");
	            message.setText("Hello, aas is sending email ");
	 
	            // Send message
	            Transport.send(message);
	            System.out.println("Yo it has been sent..");
	        }
	        catch (MessagingException mex) {
	            mex.printStackTrace();
	        }
	    }

}
