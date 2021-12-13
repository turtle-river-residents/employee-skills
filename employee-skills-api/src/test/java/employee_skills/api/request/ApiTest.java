/*
 * Copyright (c) 2021. Uchi No Project
 */

package employee_skills.api.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import employee_skills.api.persistence.database.CsvDataSetLoader;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("local")
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        TransactionDbUnitTestExecutionListener.class
})
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
public class ApiTest {

    @Autowired
    protected TestRestTemplate template;

    @LocalServerPort
    protected int port;

    protected ObjectMapper mapper = new ObjectMapper();

    protected String createUrl(String suffix) {
        return "http://localhost:" + port + suffix;
    }

    protected String toJsonStr(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

}
