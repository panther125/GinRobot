package com.panther.diyrabbit;

import com.panther.diyrabbit.service.RobotService;
import com.panther.diyrabbit.service.impl.RobotServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class Application {

    private static final RobotService robotService = new RobotServiceImpl();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        try {
            InetAddress address = InetAddress.getLocalHost();
            log.info(address.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
