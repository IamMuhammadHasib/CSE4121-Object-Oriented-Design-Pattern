
public class NotifService
{
    public static void main(String[] args)
    {
        NotifFactory notifFactory = new NotifFactory();
        Notification notif = notifFactory.createNotification("EMAIL");
        notif.notifyUser();
    }
}