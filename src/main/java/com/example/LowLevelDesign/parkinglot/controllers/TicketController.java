package com.example.LowLevelDesign.parkinglot.controllers;

import com.example.LowLevelDesign.parkinglot.dtos.IssueTicketRequestDto;
import com.example.LowLevelDesign.parkinglot.dtos.IssueTicketResponseDto;
import com.example.LowLevelDesign.parkinglot.dtos.ResponseStatus;
import com.example.LowLevelDesign.parkinglot.models.SpotAssignmentStrategyType;
import com.example.LowLevelDesign.parkinglot.models.Ticket;
import com.example.LowLevelDesign.parkinglot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
       Ticket ticket = ticketService.issueTicket(requestDto.getGateId(),
               requestDto.getVehicleNumber(),
               requestDto.getVehicleOwnerName(),
               requestDto.getVehicleType(), SpotAssignmentStrategyType.CHEAP);

       IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
       responseDto.setTicket(ticket);
       responseDto.setResponseStatus(ResponseStatus.SUCCESS);
       return responseDto;
    }
}
