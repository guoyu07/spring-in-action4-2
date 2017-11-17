package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class SpittlerControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception{
        SpittlerController spittlerController = new SpittlerController();

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittlerController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("spitter/register"))
                .andExpect(MockMvcResultMatchers.view().name("registerForm"));
    }
}
