package io.github.open.toolkit.example;

import io.github.open.toolkit.annotation.EnableRequestLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author <a href="mailto:yanglu_u@126.com">dbses</a>
 * @since 1.0 2023/5/9
 */
@SpringBootApplication
@EnableRequestLog
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
