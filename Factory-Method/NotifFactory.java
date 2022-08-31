public class NotifFactory
{
    public Notification createNotification(String channel)
    {
        if(channel == null || channel.isEmpty()) return null;
        else if(channel=="SMS") return new SMS();
        else if(channel=="EMAIL") return new Email();
        else if(channel=="PUSH") return new PushNotification();
        else throw new IllegalArgumentException(channel+" is an unknown channel.");
    }
}