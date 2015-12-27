package com.samao.bootspring;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by samao on 12/26/15.
 */

@RestController
public class MainController {

    private static BigInteger nextId;
    private static Map<BigInteger, Greeting> greetingMap;

    private static Greeting save(Greeting greeting) {
        if (greetingMap == null) {
            greetingMap = new HashMap<BigInteger, Greeting>();
            nextId = BigInteger.ONE;
        }
        greeting.setId(nextId);
        nextId = nextId.add(BigInteger.ONE);
        greetingMap.put(greeting.getId(), greeting);
        return greeting;
    }

    static {
        Greeting g1 = new Greeting();
        g1.setText("Hello World!");
        save(g1);

        Greeting g2 = new Greeting();
        g2.setText("Hola Mundo!");
        save(g2);
    }

    @RequestMapping(value = "/api/greetings", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Greeting>> getGreetings() {

        System.out.println("Hello");

        Collection<Greeting> greetings = greetingMap.values();
        return new ResponseEntity<Collection<Greeting>>(greetings, HttpStatus.OK);
    }


    @RequestMapping(value="/client/list", method= RequestMethod.GET)
    public ResponseEntity<HttpStatus> list() {

        System.out.println("test");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
