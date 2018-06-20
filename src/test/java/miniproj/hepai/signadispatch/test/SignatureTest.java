package miniproj.hepai.signadispatch.test;

import miniproj.hepai.signadispatch.Signature;

import java.util.Random;

public class SignatureTest {
    public static void main(String[] args) {
        Signature sign = new Signature();
        sign.setSecretId("AKIDf9ON7bYtgFZgaFQqmUxFJCrJXVEhBshG");//secret id
        sign.setSecretKey("SfdMq56rRs53nJcgWBcolU6VfbJlywf8");//secret key
        sign.setCurrentTime(System.currentTimeMillis() / 1000);
        sign.setRandom(new Random().nextInt(java.lang.Integer.MAX_VALUE));
        sign.setSignValidDuration(3600 * 24 * 2);

        try {
            String signature = sign.getUploadSignature();
            System.out.println("signature : " + signature);
        } catch (Exception e) {
            System.out.print("获取签名失败");
            e.printStackTrace();
        }
    }
}
