package adapterSms;

public class App {
    public static void main(String[] args) {
        SmsAdapter smsAdapter = new SmsAdapter();

        smsAdapter.sendMessage("ali");

        smsAdapter.sendMessage("tencent");
    }
}
