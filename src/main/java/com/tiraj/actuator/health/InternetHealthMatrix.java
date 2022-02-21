package com.tiraj.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.net.URLConnection;

@Component
public class InternetHealthMatrix  implements HealthIndicator {


    @Override
    public Health health() {
        return checkInternet() == true ? Health.up().withDetail("Success Code", "Active internet connection").build() : Health.down()
                .withDetail("error Code", "Deactive internet connection").build();

    }

    private boolean checkInternet(){
        boolean flag =false;
        try {
            URL url = new URL("https://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            flag =true;
        }
        catch (Exception e){
            System.out.println("*-----"+e.getMessage());
        }
        return  flag;
    }
}
