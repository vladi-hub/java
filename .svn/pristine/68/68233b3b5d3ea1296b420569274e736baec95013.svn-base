package com.sf.mail;

import javax.mail.*;
import javax.mail.internet.*;
import javax.naming.*;

public class SFMailer {

	public static void sendMessage(String rec, String from, String subj, String content) throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		Session session = (Session) envCtx.lookup("mail/SFSession");

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		InternetAddress to[] = new InternetAddress[1];
		to[0] = new InternetAddress(rec);
		message.setRecipients(Message.RecipientType.TO, to);
		message.setSubject(subj);
		message.setContent(content, "text/plain");
		Transport.send(message);
	}
}
