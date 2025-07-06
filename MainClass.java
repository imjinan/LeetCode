public class MainClass {
    public static void main(String[] args) {
        Communication c1 = new TextMessage();
        Communication c2 = new PushNotification();
        Communication c3 = new Email();
        c1.sendCommunication("text message");
        c2.sendCommunication("push notification");
        c3.sendCommunication("email");
    }
}
