package com.hbc.edd.eddService.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.hbc.edd.eddService.exception.InvalidRequest;
import com.hbc.edd.eddService.model.Order;
import com.hbc.edd.eddService.model.OrderDTO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

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
            @RequestBody Order order) {
        OrderDTO orderDTO = createOrderDTO(order);
        return ResponseEntity.ok(orderDTO);
    }

    private OrderDTO createOrderDTO(Order order) {
        OrderDTO orderDTO;
        orderDTO = new OrderDTO();
        ObjectMapper objectMapper = new ObjectMapper();

        if (order.getOrderLines() == null
                || Strings.isNullOrEmpty(order.getBasketId())
                || Strings.isNullOrEmpty(order.getOrganizationCode())
                || Strings.isNullOrEmpty(order.getBasketId())) {
            throw new InvalidRequest("Required fields are missing.");
        }

//        Car car = objectMapper.readValue(order.getOrderLines(), Car.class);
        return orderDTO;
    }
}
