package redhat.smartmetervent;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class EmailNotificationService implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public EmailNotificationService() {
    }

    public static void sendEmailNotification(redhat.smartmetervent.Notification notification){
    
        java.util.List msg = new java.util.ArrayList();
        java.lang.String body = notification.getMessage();
      
		String v1 = val.replace("#1", notification.getId);
		String v2 = v1.replace("#2", notification.getOutageEvents().size());
		
        msg.add(0,notification.getEmailId());
        msg.add(1,notification.getMessage());
        msg.add(2,"Electricity outage notification for " + notification.getId() );
        com.service.email.EmailService.sendEmailNotification(msg);
    }
}