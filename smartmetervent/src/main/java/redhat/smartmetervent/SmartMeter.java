package redhat.smartmetervent;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SmartMeter implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String utility;
   private java.lang.String meterID;
   private java.lang.String amiGUIID;
   private java.lang.String amiMac;
   private java.lang.String type;
   private java.lang.String address;
   private java.lang.String messageID;
   private java.util.Date timestamp;
   private java.lang.String zone;

   public SmartMeter()
   {
   }

   public java.lang.String getUtility()
   {
      return this.utility;
   }

   public void setUtility(java.lang.String utility)
   {
      this.utility = utility;
   }

   public java.lang.String getMeterID()
   {
      return this.meterID;
   }

   public void setMeterID(java.lang.String meterID)
   {
      this.meterID = meterID;
   }

   public java.lang.String getAmiGUIID()
   {
      return this.amiGUIID;
   }

   public void setAmiGUIID(java.lang.String amiGUIID)
   {
      this.amiGUIID = amiGUIID;
   }

   public java.lang.String getAmiMac()
   {
      return this.amiMac;
   }

   public void setAmiMac(java.lang.String amiMac)
   {
      this.amiMac = amiMac;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public java.lang.String getMessageID()
   {
      return this.messageID;
   }

   public void setMessageID(java.lang.String messageID)
   {
      this.messageID = messageID;
   }

   public java.util.Date getTimestamp()
   {
      return this.timestamp;
   }

   public void setTimestamp(java.util.Date timestamp)
   {
      this.timestamp = timestamp;
   }

   public java.lang.String getZone()
   {
      return this.zone;
   }

   public void setZone(java.lang.String zone)
   {
      this.zone = zone;
   }

   public SmartMeter(java.lang.String utility, java.lang.String meterID,
         java.lang.String amiGUIID, java.lang.String amiMac,
         java.lang.String type, java.lang.String address,
         java.lang.String messageID, java.util.Date timestamp,
         java.lang.String zone)
   {
      this.utility = utility;
      this.meterID = meterID;
      this.amiGUIID = amiGUIID;
      this.amiMac = amiMac;
      this.type = type;
      this.address = address;
      this.messageID = messageID;
      this.timestamp = timestamp;
      this.zone = zone;
   }

}