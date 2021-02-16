package com.qa.utilities;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmailWithReport {
	
	
	public void SendEmail()
	{
		ReadConfig readConfig = new ReadConfig();
		
		Reporting extreoprt  = new Reporting();	
		
		System.out.println(extreoprt.getDateOfReport());
		
		 final String smtpname = readConfig.getSmtp();
	     final String smtpportnum =readConfig.getSmtpPort();
		
		
		
		String to1 = "dineshkumbhare94@gmail.com";
		String to2 = "punit.kumbhare@harriersys.com";
		String from = "dharriersys1@gmail.com";


		Properties properties = new Properties();

		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		properties.put("mail.smtp.host", smtpname);
		properties.put("mail.smtp.port", smtpportnum);


		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("dharriersys1@gmail.com","Mydog@333");
		}
		});


		try
		{
		MimeMessage msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress(from));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to1));
		msg.addRecipient(Message.RecipientType.CC, new InternetAddress(to2));
		msg.setSubject("Test Automation Report");

		Multipart emailContent = new MimeMultipart();


		//Text body part
		MimeBodyPart textBodyPart = new MimeBodyPart();
		textBodyPart.setText("Please Find Attachment For Testing Result");

		//Attachment body part.
		MimeBodyPart pdfAttachment = new MimeBodyPart();
		
		//System.out.println(extreoprt.repName);
		
		pdfAttachment.attachFile(extreoprt.getDateOfReport());
		
		//pdfAttachment.attachFile("C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\test-output\\Test-Report.html");

		//Attach body parts
		emailContent.addBodyPart(textBodyPart);
		emailContent.addBodyPart(pdfAttachment);

		//Attach multipart to message
		msg.setContent(emailContent);

		Transport.send(msg);
		System.out.println("Email Sent");


		}


		catch (MessagingException e) {
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}











		}

		
		
		
		
		
	}
	
	
	


