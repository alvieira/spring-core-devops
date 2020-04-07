package guru.springframework.test.external.props;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import guru.springframework.test.jms.FakeJmsBroker;
import guru.test.config.external.props.ExternalPropsMultiFile;

@SpringBootTest(classes = ExternalPropsMultiFile.class)
@ContextConfiguration
public class PropertySourceMultiFileTest {

	@Autowired
	FakeJmsBroker fakeJmsBroker;

	@Test
	public void testPropsSet() throws Exception {
		assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
		assertEquals(3330, fakeJmsBroker.getPort().intValue());
		assertEquals("Ron", fakeJmsBroker.getUser());
		assertEquals("&%$)(*&#^!@!@#$", fakeJmsBroker.getPassword());
	}

}