package com.mit.springcloudstremdemo.config;


import com.mit.springcloudstremdemo.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
