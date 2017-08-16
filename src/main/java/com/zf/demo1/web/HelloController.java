package com.zf.demo1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**输CHU RestFul接口
 * Created by ZF on 2017/08/16.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
