package org.arthaks.lion.mapper;

import lombok.extern.log4j.Log4j2;
import org.arthaks.lion.entity.UserBase;
import org.arthaks.lion.helper.BaseHelper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootTest
class UserBaseMapperTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Test
    public void testInsert(){
        String mobile = "18611993810";
        String pwd = "1234567890";
        UserBase userBase = new UserBase();
        userBase.setCreateTime(LocalDateTime.now());
        userBase.setGid(BaseHelper.generateUUID());
        userBase.setUpdateTime(LocalDateTime.now());
        userBase.setName("arthaks");
        userBase.setMail("arthaks@163.com");
        userBase.setMobile(mobile);
        userBase.setPwdHash(BaseHelper.md5Encode(pwd));
        userBaseMapper.insert(userBase);
        logger.info("testInsert, insert userBase = {}", userBase);
    }


    @Test
    public void testGetById(){
        UserBase userBase = userBaseMapper.selectById(1);
        System.out.println(userBase);
    }

    @Test
    public void testListAll(){
        List<UserBase> userBases = userBaseMapper.selectList(null);
        logger.debug("testListAll, get userBases = {}", userBases);
    }


}