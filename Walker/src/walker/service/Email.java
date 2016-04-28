package walker.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Email {
	public Email (String To, String link, String description, String name){
		final String username = "yibo.wei6@gmail.com";
		 final String password = "weiyibo8810";
		 Properties props = new Properties();
	     props.put("mail.smtp.starttls.enable", "true");
	     props.put("mail.smtp.auth", "true");
	     props.put("mail.smtp.host", "smtp.gmail.com");
	     props.put("mail.smtp.port", "587");
	     Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(username, password);
					}
				});
		 try {

	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("yibo.wei6@gmail.com"));
	            message.setRecipients(Message.RecipientType.TO,
	                InternetAddress.parse(To));
	            message.setSubject("New Job");
	            String content = "Dear Mail " + name + ",<br/><br/>"
		                + "Get new job links: " + link + "<br/><br/>Description:<br/>" + description;
		                
	            message.setContent(content, "text/html");
	            Transport.send(message);

	            System.out.println("Done");

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	}
}
