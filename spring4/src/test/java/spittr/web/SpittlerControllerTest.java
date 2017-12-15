package spittr.web;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spittr.data.SpitterRepository;
import spittr.model.Spitter;

public class SpittlerControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception{
        SpitterRepository mockRepository = Mockito.mock(SpitterRepository.class);
        SpittlerController spittlerController = new SpittlerController(mockRepository);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittlerController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/spitter/register"))
                .andExpect(MockMvcResultMatchers.view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {
        SpitterRepository mockRepository = Mockito.mock(SpitterRepository.class);
        Spitter unsaved =
                new Spitter("jbauer", "Bauer", "Jack", "24hours");
        Spitter saved =
                new Spitter("jbauer", "Bauer", "Jack", "24hours");
        Mockito.when(mockRepository.save(unsaved)).thenReturn(saved);

        SpittlerController spittlerController = new SpittlerController(mockRepository);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittlerController).build();

        mockMvc.perform(MockMvcRequestBuilders.post("/spitter/register")
                .param("username", "jbauer")
                .param("lastName", "Bauer")
                .param("firstName", "Jack")
                .param("password", "24hours"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/spitter/jbauer"));
        Mockito.verify(mockRepository, Mockito.atLeastOnce()).save(unsaved);


    }
}
