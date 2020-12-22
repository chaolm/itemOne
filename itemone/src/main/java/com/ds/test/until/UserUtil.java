package com.ds.test.until;

import com.ds.test.commonDto.TokenDto;
import com.ds.test.dto.Account;
import com.ds.test.dto.User;
import com.ds.test.exception.ServiceException;
import org.springframework.util.CollectionUtils;

import java.util.Random;
import java.util.Set;


public class UserUtil {

    public static final String USER_TOKEN_KEY_HEADER = "user:session";

    public static final String MANAGE_TOKEN_REQ_KEY = "MANAGE_TOKEN";


    public static final Integer ADMIN_USER_EXPIRE = 1800;

    public static final Integer CUSTOMER_USER_EXPIRE = 15 * 24 * 60 * 60;


    //chao
    public static User currentAdminUser() {
        String token = SessionUtil.getRequest(USER_TOKEN_KEY_HEADER, String.class);
        if (StringUtil.isBlank(token)) {
            return null;
        }
        Set<String> keySet = RedisUtil.INSTANCE.keys(UserUtil.USER_TOKEN_KEY_HEADER + ":*:user:*");
        if (CollectionUtils.isEmpty(keySet)) {
            return null;
        }
        return RedisUtil.INSTANCE.get(token, User.class);
    }

    public static void removeAdminUser(String userCode) {
        if (userCode == null) {
            return;
        }
        Set<String> keySet = RedisUtil.INSTANCE.keys(UserUtil.USER_TOKEN_KEY_HEADER + ":*:user:" + userCode);
        for (String key : keySet) {
            if (RedisUtil.INSTANCE.exists(RedisUtil.INSTANCE.get(key))) {
                RedisUtil.INSTANCE.delete(RedisUtil.INSTANCE.get(key));
            }
            RedisUtil.INSTANCE.delete(key);
        }
    }

///chao


    public static void adminUserExpireReset() {
        String token = SessionUtil.getRequest().getAttribute(USER_TOKEN_KEY_HEADER).toString();
        Set<String> keySet = RedisUtil.INSTANCE.keys(token + ":*");
        keySet.add(token);
        for (String key : keySet) {
            RedisUtil.INSTANCE.expire(key, ADMIN_USER_EXPIRE);
        }
    }


    //chao
    public static TokenDto refreshToken(User user) {
        TokenDto tokenDto = null;
        UserUtil.removeAdminUser(UserUtil.USER_TOKEN_KEY_HEADER + ":*:user:" + user.getUserCode());
        String key = null;
        for (int i = 0; i < 5; i++) {
            key =StringUtil.getUUID();
            if (!RedisUtil.INSTANCE.exists(key)) {
                break;
            }
        }
        if (StringUtil.isBlank(key)) {
            throw new ServiceException("系统繁忙，请稍后再试");
        }

        StringBuffer userRoleKey = new StringBuffer();
        userRoleKey.append(key).append(":user:").append(user.getUserCode());
        RedisUtil.INSTANCE.set(userRoleKey.toString(), user, UserUtil.CUSTOMER_USER_EXPIRE);
        tokenDto = new TokenDto();
        tokenDto.setToken(userRoleKey.toString());
        tokenDto.setName("");
        return tokenDto;
    }

    public static String getCharAndNumr(int length) {
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // 输出字母还是数字
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            // 字符串
            if ("char".equalsIgnoreCase(charOrNum)) {
                // 取得大写字母还是小写字母
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (choice + random.nextInt(26));
            } else if ("num".equalsIgnoreCase(charOrNum)) { // 数字
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }
}
