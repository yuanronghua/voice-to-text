/*
 * Copyright (C), 杭州中恒云能源互联网技术有限公司，保留所有权利
 * 创建日期： 2019年5月20日 下午1:48:20
 * 版本： 
 * 作者： yny
 * 功能描述： TODO
 */
package com.yuanrh.voicetotext.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO <br/>
 * @date：2019年5月20日 下午1:48:20<br/>
 * @author yny
 * @version 
 */
@RestController
@RequestMapping("/example")
public class ExampleController {
    
    @RequestMapping("/get")
    public String getX() {
        
    return "success";
    }

}
