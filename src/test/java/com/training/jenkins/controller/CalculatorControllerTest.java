package com.training.jenkins.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
@WebMvcTest(CalculatorController.class)
class CalculatorControllerTest {

		@Autowired
	    private MockMvc mockMvc;
		
		
		 @Test
		    void testAddWithParams() throws Exception {
		        mockMvc.perform(get("/add")
		                .param("a", "5")
		                .param("b", "15"))
		            .andExpect(status().isAccepted())
		            .andExpect(content().string("20"));
		    }

		    @Test
		    void testAddWithDefaults() throws Exception {
		        mockMvc.perform(get("/add"))
		            .andExpect(status().isAccepted())
		            .andExpect(content().string("30")); // 10 + 20 (defaults)
		    }

		    @Test
		    void testSubtractWithParams() throws Exception {
		        mockMvc.perform(get("/substract")
		                .param("a", "50")
		                .param("b", "20"))
		            .andExpect(status().isAccepted())
		            .andExpect(content().string("30"));
		    }

		    @Test
		    void testSubtractWithDefaults() throws Exception {
		        mockMvc.perform(get("/substract"))
		            .andExpect(status().isAccepted())
		            .andExpect(content().string("-10")); // 10 - 20 (defaults)
		    }
}
