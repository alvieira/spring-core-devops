package guru.springframework.test.external.props;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.web.WebAppConfiguration;

import guru.springframework.test.SpringBootJavaConfig;
import guru.springframework.test.jms.FakeJmsBroker;

@SpringBootTest(classes = SpringBootJavaConfig.class)
@WebAppConfiguration
@TestPropertySource("/application.properties")
public class SpringBootPropertiesTest {
	
	@Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropsSet() throws Exception {
        assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        assertEquals(3330, fakeJmsBroker.getPort().intValue());
        assertEquals("Ron", fakeJmsBroker.getUser());
        assertEquals("Burgundy", fakeJmsBroker.getPassword());
    }

}
