package org.arthaks.lion.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户 包含用户基本信息
 * </p>
 *
 * @author arthaks
 * @since 2019-05-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserBase implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 用户全局唯一标识
     */
    private String gid;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 姓名
     */
    private String name;

    /**
     * 邮箱地址
     */
    private String mail;

    /**
     * 加密后的登陆密码
     */
    private String pwdHash;


}
