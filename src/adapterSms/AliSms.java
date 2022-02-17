package adapterSms;

public class AliSms implements Sms{
    @Override
    public void senSingle(String phone, String content) {
        System.out.println(phone + ":" + content + ":发送短信");
    }
}
