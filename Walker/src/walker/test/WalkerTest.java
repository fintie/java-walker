package walker.test;


import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import walker.entity.Job;
import walker.entity.Walker;
import walker.repository.JobRepository;
import walker.repository.WalkerRepository;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;


public class WalkerTest {

	private ApplicationContext ctx = null;
	private WalkerRepository walkerRepository;
	private JobRepository jobRepository;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		walkerRepository = ctx.getBean(WalkerRepository.class);
		jobRepository = ctx.getBean(JobRepository.class);
	}
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	@Test 
	public void testWalkerUserName(){
		String userName = "william";
		String password="Qing136641";
		Walker walker = walkerRepository.getByUsernameAndPassword(userName, password);
		System.out.println(walker.getEmail());
	}
	
	@Test
	public void testInsertData(){
		Walker walker1 = new Walker();
		Walker walker2 = new Walker();
		Walker walker3 = new Walker();
		walker1.setUsername("william");
		walker1.setEmail("yibo.wei6@gmail.com");
		walker1.setPassword("a");
		walker1.setRole("Admin");
		
		walker2.setUsername("Yuvia");
		walker2.setEmail("yibo.wei6@gmail.com");
		walker2.setPassword("a");
		walker2.setRole("Client");
		
		walker3.setUsername("Tom");
		walker3.setEmail("948764415@qq.com");
		walker3.setPassword("a");
		walker3.setRole("Walker");
		
		walkerRepository.save(walker1);
		walkerRepository.save(walker2);
		walkerRepository.save(walker3);
	}
	
	@Test
	public void testNotFinish(){
		Walker walker3 = walkerRepository.findOne(3);
		System.out.println(walker3.getUsername());
		
		
		List<Job> jobs = jobRepository.getAll("Pending");
		System.out.println(jobs.size());
		
		
		jobs = jobRepository.getNotFinish("Taken", walker3);
		
		System.out.println(jobs.size());
	}
	
	@Test
	public void testEmail(){
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
	                InternetAddress.parse("948764415@qq.com"));
	            message.setSubject("Testing Subject");
	            message.setText("Dear Mail Crawler,"
	                + "\n\n No spam to my email, please!");

	            Transport.send(message);

	            System.out.println("Done");

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	}
	


	
	
































}
