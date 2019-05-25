package org.arthaks.lion.controller;


import org.arthaks.lion.entity.UserBase;
import org.arthaks.lion.service.IUserBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户 包含用户基本信息 前端控制器
 * </p>
 *
 * @author arthaks
 * @since 2019-05-26
 */
@RestController
@RequestMapping(path =  "/lion/user-base", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserBaseController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private IUserBaseService iUserBaseService;

    @PostMapping(path = "/list")
    public List<UserBase> listAll(){
        List<UserBase> list = iUserBaseService.list();
        logger.debug("listAll, list = {}", list);
        return list;
    }

}

