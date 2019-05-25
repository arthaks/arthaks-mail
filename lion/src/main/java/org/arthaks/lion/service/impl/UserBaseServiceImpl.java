package org.arthaks.lion.service.impl;

import org.arthaks.lion.entity.UserBase;
import org.arthaks.lion.mapper.UserBaseMapper;
import org.arthaks.lion.service.IUserBaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 包含用户基本信息 服务实现类
 * </p>
 *
 * @author arthaks
 * @since 2019-05-26
 */
@Service
public class UserBaseServiceImpl extends ServiceImpl<UserBaseMapper, UserBase> implements IUserBaseService {

}
