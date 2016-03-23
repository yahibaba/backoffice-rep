import com.es.bo.biz.repository.NewsRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


/**
 * Created by myachb on 3/4/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/backoffice-biz-context.xml")
public class TestMongo {

    private static final Log log = LogFactory.getLog(TestMongo.class);

    @Autowired
    private NewsRepository db;

    @Test
    public void testContext() throws Exception {
        assertNotNull(db);
    }

}
