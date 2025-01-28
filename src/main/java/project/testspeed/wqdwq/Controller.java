package project.testspeed.wqdwq;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/test")
    public long  main1(){
        long startTime = System.currentTimeMillis();
        for(int i =0 ;i<1000000 ; i++){
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        return endTime-startTime;
    }
}
