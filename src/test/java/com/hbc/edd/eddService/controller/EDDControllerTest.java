package com.hbc.edd.eddService.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.hbc.edd.eddService.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles("test")
public class EDDControllerTest {

    @InjectMocks
    EDDController eddController;
    ObjectMapper mapper = new ObjectMapper();
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = standaloneSetup(eddController)
                .build();
    }

    @Test
    @DisplayName("Healthcheck Test")
    public void getHealth() throws Exception {
        mockMvc.perform(get("http://localhost:8080/api/v1/hello"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("Get EDD")
    public void getEDD() throws Exception {
        Order order = new Order();
        mockMvc.perform(post("http://localhost:8080/api/v1/getEDD")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsString(order)))
                .andExpect(status().isOk());
    }
}