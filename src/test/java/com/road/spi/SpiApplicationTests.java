package com.road.spi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
<<<<<<< HEAD

@SpringBootTest
=======
<<<<<<< HEAD

@SpringBootTest
=======
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = {"com.road.*"})
>>>>>>> Road SPI
>>>>>>> SPI机制
class SpiApplicationTests {
    @Autowired
    private ExtensionLoader extensionLoader;

    @Test
    void contextLoads() {
        AService service = (AService) extensionLoader.getServiceExtension(AService.class);
        service.info();
        AService service1 = (AService) extensionLoader.getServiceExtension(AService.class, "A2");
        service1.info();

    }

}
