package org.adarchitecture.example.interview.mock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class RestClientTestWithMock {

    private static final String PRODUCT_API_URI = "http://localhost:8082/api/validateWord/{fWord}/{sWord}";
    private MockMvc mockRest = null;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void before() throws Exception {
        mockRest = webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void after() throws Exception {
        mockRest = null;
    }

    /*
     * Testing Happy Path scenario
     */
    @Test
    public void testValid() throws Exception {
        final MockHttpServletRequestBuilder builder = get(PRODUCT_API_URI, "army","mary");
        final ResultActions result = mockRest.perform(builder);
        result.andExpect(status().isOk());
    }

    /*
     * Testing Error scenario
     */
    @Test
    public void testIsNotValid() throws Exception {
        final MockHttpServletRequestBuilder builder = get(PRODUCT_API_URI, "army","marP");
        final ResultActions result = mockRest.perform(builder);
        result.andExpect(status().isInternalServerError());
    }

}
