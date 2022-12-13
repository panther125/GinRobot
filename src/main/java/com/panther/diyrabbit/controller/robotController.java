package com.panther.diyrabbit.controller;

import com.panther.diyrabbit.entity.Response;
import com.panther.diyrabbit.service.RobotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/robot")
public class robotController {

    @Resource
    private RobotService robotService;

    @GetMapping(produces = "application/json;charset=utf-8")
    public Response index(String mes){
        //System.out.println(mes);
//        System.out.println("大佬好,我是大数据Gin 琴酒博客里的机器人，直接给我下达指令哦~");
//        System.out.println("-------------------------------");
        if("88".equalsIgnoreCase(mes)){
           return new Response(500,"Gin: 下次再来玩啊！！");
        }else {
            Response response = robotService.qa(mes);
            if(response != null && response.getCode() == 0){
                //System.out.println("Gin:"+ new String(response.getContent().getBytes(),"UTF-8"));
                return response;
                //System.out.println("-------------------------------");
            }else {
               return new Response(500,"Gin: 大佬你刚刚这句话我没听懂，可否再陈述一次~");
            }
        }
    }

}
