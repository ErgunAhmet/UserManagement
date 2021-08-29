package be.usermanagement.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

import static be.usermanagement.usermanagement.constant.FileConstant.USER_FOLDER;

@SpringBootApplication
public class UsermanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermanagementApplication.class, args);
        new File(USER_FOLDER).mkdirs();
    }



}
