package redhat.smartmetervent;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Notification implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String id;
   private java.lang.String emailId;
   private java.lang.String message;

   private java.util.List<redhat.smartmetervent.OutageEvent> outageEvents;

   public Notification()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public java.lang.String getEmailId()
   {
      return this.emailId;
   }

   public void setEmailId(java.lang.String emailId)
   {
      this.emailId = emailId;
   }

   public java.lang.String getMessage()
   {
      return this.message;
   }

   public void setMessage(java.lang.String message)
   {
      this.message = message;
   }


   public java.util.List<redhat.smartmetervent.OutageEvent> getOutageEvents()
   {
      return this.outageEvents;
   }

   public void setOutageEvents(
         java.util.List<redhat.smartmetervent.OutageEvent> outageEvents)
   {
      this.outageEvents = outageEvents;
   }

   public Notification(java.lang.String id, java.lang.String emailId,
         java.lang.String message,
         java.util.List<redhat.smartmetervent.OutageEvent> outageEvents)
   {
      this.id = id;
      this.emailId = emailId;
      this.message = message;
      this.outageEvents = outageEvents;
   }

}