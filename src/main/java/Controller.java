import org.springframework.web.bind.annotation.PostMapping;

public class Controller {

    @PostMapping("/test")
    public void main(){
        long startTime = System.currentTimeMillis();
        for(int i =0 ;i<10000000 ; i++){
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
