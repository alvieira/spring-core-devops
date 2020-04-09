package guru.springframework.test.dstest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import guru.springframework.test.config.DataSourceConfig;
import guru.springframework.test.ds.FakeDataSource;

@SpringBootTest(classes = DataSourceConfig.class)
@ContextConfiguration
// @ActiveProfiles("dev")
public class DataSourceTest {

	private FakeDataSource fakeDataSource;

    @Autowired
    public void setFakeDataSource(FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }

    @Test
    public void TestDataSource() throws Exception {

        System.out.println(fakeDataSource.getConnectionInfo());

    }

}
