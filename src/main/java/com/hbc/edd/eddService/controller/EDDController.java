package com.hbc.edd.eddService.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hbc.edd.eddService.model.*;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@EnableSwagger2
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EDDController {

    @GetMapping("/hello")
    @ApiOperation(value = "Health CheckAPI")
    public ResponseEntity<String> getHealth() {
        return ResponseEntity.ok().body("Hello world this is new image ");
    }

    @PostMapping("/create-edd")
    @ApiOperation(value = "Get EDD")
    public ResponseEntity<OrderDTO> getEDD(
            @RequestBody Order order) throws JsonProcessingException {
        OrderDTO orderDTO = createOrderDTO(order);
        return ResponseEntity.ok(orderDTO);
    }

    private OrderDTO createOrderDTO(Order order) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String orderStr = objectMapper.writeValueAsString(order);
        OrderDTO orderNewDTO = objectMapper.readValue(orderStr, OrderDTO.class);
        orderNewDTO.setAssignments(this.createAssignments());
        orderNewDTO.getOrderLines().getOrderLine().forEach(orderLineDTO -> orderLineDTO.setAssignments(createAssignments()));
        return orderNewDTO;
    }

    private Assignments createAssignments() {
        Assignments assignments = new Assignments();
        Assignment assignment = new Assignment();
        ArrayList<Assignment> assignmentList = new ArrayList<>();
        assignment.setAvailableQty(10L);
        assignment.setEstimatedDeliveryEndDate(LocalDateTime.now());
        assignment.setEstmatedDeliveryStartDate(LocalDateTime.now());
        assignment.setShipNode("NODE123");
        assignment.setLevelOfService("2");
        assignmentList.add(assignment);
        assignments.setAssignment(assignmentList);
        return assignments;
    }
}
