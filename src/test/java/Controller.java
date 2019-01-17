import com.kennysoft.controller.AdmAccountController;

import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static
        org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class Controller {
    private static Logger logger = Logger.getLogger(Controller.class);

    @Test
    public void testHomePage() throws Exception {
        AdmAccountController controller = new AdmAccountController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("account/"))
                .andExpect(view().name("index"));
    }
}

