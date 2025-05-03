package com.example.LowLevelDesign.splitwise.controllers;

import com.example.LowLevelDesign.splitwise.dtos.SettleUpGroupRequestDto;
import com.example.LowLevelDesign.splitwise.dtos.SettleUpGroupResponseDto;
import com.example.LowLevelDesign.splitwise.dtos.SettleUpUserRequestDto;
import com.example.LowLevelDesign.splitwise.dtos.SettleUpUserResponseDto;
import com.example.LowLevelDesign.splitwise.service.SettleUpService;
import org.springframework.stereotype.Controller;

@Controller
public class SettleUpController {

    private SettleUpService settleUpService;

    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto requestDto) {

        return null;

    }


    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto requestDto) {

        return null;

    }
}
