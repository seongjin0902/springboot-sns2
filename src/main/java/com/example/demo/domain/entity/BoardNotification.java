package com.example.demo.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Builder
@Table(name = "BoardNotification")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardNotification {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long nid;
    private Long bid;
    @Column
    private String writeusername;
    @Column
    private String replyusername;
    @Column

    private String massage;
    private boolean isread;
    private LocalDateTime rdate;



}
