package com.github.chengzhx76.service.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.io.Serializable;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/9/5
 */
@Configuration
public class RedisConfig {

    @Value("${spring.redis.database}")
    private int dateBase;
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.password}")
    private String password;
    @Value("${spring.redis.pool.max-active}")
    private int maxTotal;
    @Value("${spring.redis.pool.max-wait}")
    private int maxWait;
    @Value("${spring.redis.pool.max-idle}")
    private int maxIdle;
    @Value("${spring.redis.pool.min-idle}")
    private int minIdle;
    @Value("${spring.redis.timeout}")
    private int timeout;

    @Bean
    public StringRedisSerializer stringSerializer() {
        return new StringRedisSerializer();
    }
    @Bean
    public JdkSerializationRedisSerializer jdkSerializer() {
        return new JdkSerializationRedisSerializer();
    }
    @Bean
    public GenericJackson2JsonRedisSerializer jsonSerializer() {
        return new GenericJackson2JsonRedisSerializer();
    }

    @Bean
    public RedisConnectionFactory factory() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setDatabase(dateBase);
        factory.setHostName(host);
        factory.setPort(port);
        factory.setPassword(password);
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMinIdle(minIdle);
        poolConfig.setMaxWaitMillis(maxWait);
        poolConfig.setMaxTotal(maxTotal);
        factory.setPoolConfig(poolConfig);
        factory.setTimeout(timeout);
        return factory;
    }

    @Bean
    public RedisTemplate<Serializable, Object> redisTemplate() {
        RedisTemplate<Serializable, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory());
        redisTemplate.setKeySerializer(stringSerializer());
        redisTemplate.setValueSerializer(jdkSerializer());
        redisTemplate.setHashKeySerializer(stringSerializer());
        return redisTemplate;
    }

}
