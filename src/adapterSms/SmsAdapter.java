package adapterSms;

public class SmsAdapter {
    
    public void sendMessage(String type){
        if(type.equals("ali")){
            new AliSms().senSingle("ali", "sms");
        }else if (type.equals("tencent")){
            new TencentSms().senSingle("tencent", "sms");
        }
    }
    
}
