package jimmy.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced
    // here using builder to extract info | avoid multi-container scenario
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }
}
