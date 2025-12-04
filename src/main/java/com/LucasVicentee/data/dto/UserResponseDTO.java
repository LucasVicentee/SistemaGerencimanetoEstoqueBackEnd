package com.LucasVicentee.data.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class UserResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String nickName;
    private LocalDateTime birthDate;
    private String email;
    private LocalDateTime createdAt;
    
}
