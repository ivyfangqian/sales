package com.fqivy.sales;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: sales
 * @description:
 * @author: fqivy
 * @create: 2019-05-09 18:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    //    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        String username = "fqivy";
        String password = "123456";
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        log.info("username: {}, password: {}", username, password);
    }
}
