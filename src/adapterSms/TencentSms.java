package adapterSms;

public class TencentSms implements Sms{
    @Override
    public void senSingle(String phone, String content) {
        System.out.println(phone + ":" + content + ":发送短信");
    }
}
