package com.tiraj.actuator.customEndpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "tiraj",enableByDefault = true)
public class MyCustomEndpoint {


    @ReadOperation
    public  MyEndpointResponse getInfo(){
        return  new MyEndpointResponse(1,"*-test-*","*-This test message");
    }




    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    class MyEndpointResponse {
        private int id;
        private String name;
        private String status;
    }


}
