package com.example.demo.websocket;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/socket")
public class WebSocketController {


    @GetMapping("/index")
    public void f1(){

    }

}
