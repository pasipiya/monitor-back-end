public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("sms".equals(channel)) {
            return new SMSNotification();
        }
        else if ("email".equals(channel)) {
            return new EmailNotification();
        }
        else if ("call".equals(channel)) {
            return new CallNotification();
        }
        return null;
    }
}