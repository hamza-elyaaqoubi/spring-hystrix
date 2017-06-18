package fr.spring.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public int fallback() {
        return 2;
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public int getNumber() throws Exception {
        if (Math.random() > .5) {
            Thread.sleep(1000 * 3);
            throw new RuntimeException("Wrong number");
        }
        return 1;
    }
}
