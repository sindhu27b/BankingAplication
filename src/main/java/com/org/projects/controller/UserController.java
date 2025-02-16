package com.org.projects.controller;

import com.org.projects.dto.*;
import com.org.projects.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(
            summary = "Create new user account",
            description = "creating a new user and assigning an acccount number"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }


    @Operation(
            summary = "Balance Enquiry",
            description = "Given an acccount number, check how much the user has"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        return  userService.balanceEnquiry(enquiryRequest);
    }


    @Operation(
            summary = "Name Enquiry",
            description = "Given an acccount number, check user name"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest){
        return  userService.nameEnquiry(enquiryRequest);
    }


    @Operation(
            summary = "Credit Amount",
            description = "Given an acccount number and amount, credit amount"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    @PostMapping("credit")
    public  BankResponse creditAccount(@RequestBody CreditDebitRequest creditDebitRequest){
        return userService.creditAccount(creditDebitRequest);
    }


    @Operation(
            summary = "Debit Amount",
            description = "Given an acccount number and amount, debit amount from account "
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    @PostMapping("debit")
    public BankResponse debitAmount(@RequestBody CreditDebitRequest creditDebitRequest){
        return  userService.debitAccount(creditDebitRequest);
    }



    @Operation(
            summary = "Transfer Amount to another account",
            description = "Given an src, destination acccount number, amount and transfer amount"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    @PostMapping("transfer")
    public BankResponse transferAmount(@RequestBody TranferRequest tranferRequest){
        return userService.transferAmount(tranferRequest);
    }

    @PostMapping("/login")
    public BankResponse login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }

}
