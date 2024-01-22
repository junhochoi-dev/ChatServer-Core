package com.project.chatserver.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

import com.project.chatserver.domain.type.AccessType;
import com.project.chatserver.domain.type.ChannelType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Channel{
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String reference;

    private AccessType accessType;
    private ChannelType channelType;

    @CreatedDate
    private LocalDateTime createdTime;
    @LastModifiedDate
    private LocalDateTime updatedTime;

    public Channel(String name, String reference, AccessType accessType, ChannelType channelType) {
        this.name = name;
        this.reference = reference;
        this.accessType = accessType;
        this.channelType = channelType;
    }
}
