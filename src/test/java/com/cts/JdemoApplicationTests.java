package com.cts;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest
class JdemoApplicationTests {

	Logger log=LoggerFactory.getLogger(JdemoApplicationTests.class);
	@Test
	void contextLoads() {
	log.info("==============> Jenkins test demo startted");
	}

}
