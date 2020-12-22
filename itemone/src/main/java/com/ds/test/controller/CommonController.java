package com.ds.test.controller;

import com.ds.test.commonDto.ResultInfo;
import com.ds.test.dto.Advertisement;
import com.ds.test.dto.UpLoad;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author clm
 * @date 2020/12/16
 * hh
 **/
@Controller
public class CommonController extends BaseController{

    @Value("${filePath}")
    private String filePath;

    /**
     * 上传图片
     * @param
     * @return
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo upload(@RequestParam MultipartFile sortPicImg, String attachName)  {
        Date date = new Date();
        SimpleDateFormat fomat = new SimpleDateFormat("yyyyMMdd");
        String mydate = fomat.format(date);
        //新文件子目录
        String strPath = mydate+"\\";
        System.out.println("日期："+strPath);
        //原文件名称
        String fileName = sortPicImg.getOriginalFilename();
        //新文件名称
        String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));
        File newFile = new File(filePath + strPath);
        UpLoad upLoad = new UpLoad();
        if (!newFile.exists()) {
            newFile.mkdirs();
        }
        try {
            sortPicImg.transferTo(new File(filePath + strPath + newFileName));
            upLoad.setUrl(filePath + strPath + newFileName);
            return returnSuccess(upLoad);
        } catch (IOException e) {
            e.printStackTrace();
            return returnSuccess(1);
        }
    }
}
