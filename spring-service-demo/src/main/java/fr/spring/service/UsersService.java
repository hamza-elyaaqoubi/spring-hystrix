package fr.spring.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    public int fallback() {
        return -1;
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public int fetchUserId() throws Exception {
        if (Math.random() > .5) {
            Thread.sleep(1000 * 3);
            throw new RuntimeException("Wrong user Id");
        }
        return 1;
    }
}
