package com.org.projects.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    //userRequest(only necessary fields required to client are stored in dto class) is coming from controller
    private String firstName;
    private String lastName;
    private String otherName;
    private String gender;
    private String address;
    private String stateOfOrigin;
    //private String accountNumber;
   // private BigDecimal accountBalance; these 2 values user will not pass in the request. similarly createdAt and modifiedAt
    private String email;
    private String password;
    private String phoneNumber;
    private String alternativePhoneNumber;

    // no need initially because it will be active.  -->private String status;

}
