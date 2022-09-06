package fu.sen.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GatewayApplication
 * @Description gateway main application
 * @Author wu
 * @Date 2022-09-06 16:59:57
 * @version v1.0
 */
@SpringCloudApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @RestController
    @RequestMapping("/fallback")
    static class FallbackController {
        @GetMapping("")
        public String fallback() {
            return "GATEWAY FALLBACK!!!";
        }
    }
}
