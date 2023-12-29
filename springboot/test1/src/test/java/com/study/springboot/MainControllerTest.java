package com.study.springboot;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(controllers = MainController.class)
class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void hello() throws Exception {
        String hello = "hello";
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    void login() throws Exception {
        MultiValueMap<String,String> param = new LinkedMultiValueMap<>();
        param.add("id","hong");
        param.add("pw","1234");

        mockMvc.perform(get("/login").params(param))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }

    @Test
    void join() throws Exception {
        MultiValueMap<String,String> param = new LinkedMultiValueMap<>();
        param.add("id","hong");
        param.add("pw","1234");

        mockMvc.perform(get("/join").params(param))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }

    @Test
    void resultFromDB() {
    }
}