public class DecoratorPatternExample {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier smsEmail = new SMSNotifierDecorator(email);
        Notifier slackSmsEmail = new SlackNotifierDecorator(smsEmail);
        slackSmsEmail.send("System Update at 9 PM");
    }
}
interface Notifier {
    void send(String message);
}
class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappee;
    public NotifierDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }
    public void send(String message) {
        wrappee.send(message);
    }
}
class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        super.send(message);
        System.out.println("SMS: " + message);
    }
}
class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        super.send(message);
        System.out.println("Slack: " + message);
    }
}
