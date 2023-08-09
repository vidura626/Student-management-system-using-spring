package lk.ijse.studentmanagementsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by (vidur)
 * at (8/9/2023)
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.studentmanagementsystem")
public class WebAppConfig {

}
