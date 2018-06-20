package miniproj.hepai.controller;


import miniproj.hepai.beans.Secret;
import miniproj.hepai.signadispatch.Signature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecretConstroller {
    private static final String NONE = null;


    /**
     * 查询所有用户
     *
     * @return
     */
    @RequestMapping(value = "secret", method = RequestMethod.GET)

    public @ResponseBody/*返回json格式的数据*/ Secret secret() {
        String signature=Signature.generateSecret();
        Secret secret =new Secret();
        if(signature!=null) {
            secret.setSecret(signature);
        }
        else {
            secret.setSecret("0");
        }
        return secret;
    }

}
