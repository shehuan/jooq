package com.sh.jooq;

import com.sh.jooq.service.JooqService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JooqTest {
    @Autowired
    private JooqService jooqService;

    @Test
    public void test() {
        jooqService.select0();
    }
}
