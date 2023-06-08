package com.UST.springbootawssnsexample.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class AWSSNSConfig {
   public static final String SECRET_KEY = "pUQ72+lZjMrCTLAt+ujVhT42bwsHrRapJt9MJCy3";
    public static final String ACCESS_KEY = "AKIAWDYKSVHHH5VCBPHU";

    @Primary
    @Bean
    public AmazonSNSClient getSnsClient() {
        return (AmazonSNSClient) AmazonSNSClientBuilder.standard().withRegion(Regions.AP_SOUTH_1)
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY,
                        SECRET_KEY)))
                .build();
    }

}
