package com.ddy.EatFood.Configuration;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class ElasticSearchConfig {
<<<<<<< HEAD
    @Bean
    public TransportClient client() throws UnknownHostException {
        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9300
        );
        Settings settings = Settings.builder().put("wali").build();
        TransportClient client = new PreBuiltTransportClient(settings);
        client.addTransportAddress(node);
        return client;
    }
=======
//    @Bean
//    public TransportClient client() throws UnknownHostException {
//        InetSocketTransportAddress node = new InetSocketTransportAddress(
//                InetAddress.getByName("localhost"),
//                9300
//        );
//        Settings settings = Settings.builder().put("wali").build();
//        TransportClient client = new PreBuiltTransportClient(settings);
//        client.addTransportAddress(node);
//        return client;
//    }
>>>>>>> 3967f03851ca7d42e17cdd671bdf610b6760b590

}
