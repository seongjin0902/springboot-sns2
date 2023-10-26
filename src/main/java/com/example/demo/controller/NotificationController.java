package com.example.demo.controller;


import com.example.demo.config.auth.PrincipalDetails;
import com.example.demo.domain.entity.BoardNotification;
import com.example.demo.domain.repository.NotificationRepository;
import com.example.demo.domain.service.NotificationBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/notification")
@Slf4j
public class NotificationController {


//ss
    @Autowired
    private NotificationBoardService notificationBoardService;

    @Autowired
    private NotificationRepository notificationRepository;

    @GetMapping("/notifications")
    public String getNotifications(Model model, Authentication authentication){
        PrincipalDetails principalDetails = (PrincipalDetails)authentication.getPrincipal();
        String writenickname = principalDetails.getNickname();
        List<BoardNotification> notifications =  notificationRepository.findAllByWritenickname(writenickname);
        model.addAttribute("notifications", notifications);
        return "notifications";
    }








}
