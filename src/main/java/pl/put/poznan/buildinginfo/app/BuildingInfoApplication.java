package pl.put.poznan.buildinginfo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.buildinginfo.rest.BuildingInfoController;

@SpringBootApplication(scanBasePackages = { "pl.put.poznan.buildinginfo.rest" })
public class BuildingInfoApplication {

    public static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

    public static void main(String[] args) {
        logger.info("Starting SpringApplication");
        SpringApplication.run(BuildingInfoApplication.class, args);
        logger.info("SpringApplication is running");
    }
}
