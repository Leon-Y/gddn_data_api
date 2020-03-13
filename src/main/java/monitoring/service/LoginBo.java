package monitoring.service;

import lombok.Data;

/**
 * @Author: Administrator
 * @Date: 2019/11/26 :10:18
 * @Description:用户登录bo
 */
@Data
public class LoginBo {
    /**
     * 用户名
     */
    String username;
    /**
     * 密码
     */
    String password;
    /**
     * 是否记住： on 记住  其他为否
     */
    String remember;
}
