/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;
import java.io.UnsupportedEncodingException;
import java.util.Properties;    
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;    
import javax.mail.internet.*; 
/**
 *
 * @author Sudip Maiti
 */
class MAIL{  
    public static void send(String to,String sub,String msg){  
         String from = "ezymngshop@gmail.com" ;
         String password = "Sudip@6789";
          Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
                props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
		props.put("mail.smtp.port", "465"); //SMTP Port
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
         //  return new PasswordAuthentication(from,password);  
            return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {   
             

           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
          //  message.addRecipient(Message.RecipientType.CC,new InternetAddress(cc));  
           message.setFrom (new InternetAddress("ezymngshop@gmail.com","ERP_MANAGE"));
           message.setSubject(sub);    
           message.setText(msg);    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);} catch (UnsupportedEncodingException ex) {    
            Logger.getLogger(MAIL.class.getName()).log(Level.SEVERE, null, ex);
        }    
             
    }   
}
