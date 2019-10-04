package com.tencentyun;

public class Main {
    public static void main(String[] args) {
        long appId = Long.parseLong(args[0]);
        String key = args[1];
        String user = args[2];
        long expire = 24 * 60 * 60 * 1000;
        long time = System.currentTimeMillis();
        System.out.println(time);
        TLSSigAPIv2 api = new TLSSigAPIv2(appId, key);
        String sign = api.genSig(user, expire, time);
        System.out.println(sign);
    }
}
