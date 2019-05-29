/*
 * Copyright (C), 杭州中恒云能源互联网技术有限公司，保留所有权利
 * 创建日期： 2019年5月24日 下午2:54:57
 * 版本： 
 * 作者： yny
 * 功能描述： TODO
 */
package com.yuanrh.voicetotext.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yuanrh.voicetotext.xfyun.WebLfasr;

/**
 * TODO <br/>
 * @date：2019年5月24日 下午2:54:57<br/>
 * @author yny
 * @version 
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    
    @PostMapping("/upload")
    public String voiceToText(@RequestParam("file") MultipartFile file) {
        try {
            String fileName = file.getOriginalFilename();
            Long fileSize = file.getSize();
            InputStream  inputStream = file.getInputStream();
            Optional<String> optional = WebLfasr.toText(inputStream, fileName, fileSize);
            return optional.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fail";
    }
    
    public static void get() {
        
    }

}
