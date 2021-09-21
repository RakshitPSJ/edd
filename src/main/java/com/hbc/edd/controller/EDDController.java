package com.hbc.edd.controller;

import com.hbc.edd.model.Order;
import com.hbc.edd.model.OrderDTO;
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

    @PostMapping("/getEDD")
    @ApiOperation(value = "Get EDD")
    public ResponseEntity<OrderDTO> getEDD(
            @RequestBody Order order) {
        OrderDTO orderDTO = createOrderDTO();
        return ResponseEntity.ok(orderDTO);
    }

    private OrderDTO createOrderDTO(){
        OrderDTO order = new OrderDTO();
        return order;
    }
}
