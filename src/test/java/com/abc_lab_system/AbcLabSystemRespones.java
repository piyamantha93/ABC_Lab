package com.abc_lab_system;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AbcLabSystemRespones{
   @LocalServerPort
    private int port;

   @Autowired
    private TestRestTemplate testRestTemplate;

   @Test
    public void shouldPassIfStringMatches(){
       assertEquals("AbcLabSystem From Spring Boot",
               testRestTemplate.getForObject("http://localhost:" + port + "/",
                       String.class));
   }
}
