package com.github.chengzhx76.service.redis.api.service;

import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Desc: redis接口服务
 * Author: Cheng
 * Date: 2017/9/7 0021
 */
@RequestMapping("/redis")
public interface RedisService {

    /**
     * 批量删除对应的value
     *
     * @param keys
     */
    @PutMapping("removes")
    void remove(@RequestParam("keys") final String... keys);

    /**
     * 批量删除key
     *
     * @param pattern
     */
    @PutMapping("remove-pattern")
    void removePattern(@RequestParam("pattern") final String pattern);

    /**
     * 删除对应的value
     *
     * @param key
     */
    @PutMapping("remove")
    void remove(@RequestParam("key") final String key);

    /**
     * 判断缓存中是否有对应的value
     *
     * @param key
     * @return
     */
    @GetMapping("exists")
    boolean exists(@RequestParam("key") final String key);

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    @GetMapping("get")
    Object get(@RequestParam("key") final String key);

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     * @return
     */
    @PostMapping("set")
    boolean set(@RequestParam("key") final String key, @RequestParam("value") Object value);

    /**
     * 写入缓存 并设置过期时间
     * @param key
     * @param value
     * @param expireTime
     * @return
     */
    @PostMapping("set-key-value-expire-time")
    boolean set(@RequestParam("key") final String key, @RequestParam("value") Object value, @RequestParam("expireTime") Long expireTime);
    /**
     * 根据Key刷新超时时间
     * @param key
     * @param expireTime
     * @return
     */
    @GetMapping("flush-expire-time")
    boolean flushExpireTime(@RequestParam("key") final String key, @RequestParam("expireTime") Long expireTime);

    // ================================Hash 操作=================================
    /**
     * 数量递增
     * @param key
     * @param field
     */
    @PutMapping("hash/increase")
    Long increase(@RequestParam("key") String key, @RequestParam("field") String field);
    /**
     * 数量递减
     * @param key
     * @param field
     */
    @PutMapping("hash/decrease")
    Long decrease(@RequestParam("key") String key, @RequestParam("field") String field);

    /**
     * 删除一个Field
     * @param key
     * @param field
     */
    @PutMapping("hash/delete-field")
    void deleteField(@RequestParam("key") String key, @RequestParam("key") String field);

    /**
     * 批量删除
     * @param key
     * @param field
     */
    @PutMapping("hash/batch-delete-field")
    void batchDeleteField(@RequestParam("key") String key, @RequestParam("field") String... field);

    /**
     * 根据key获取所有的Field
     * @param key
     * @return
     */
    @GetMapping("hash/fields")
    Set getFields(@RequestParam("key") String key);

    /**
     * 查看该字段是否已有
     * @param key
     * @param field
     * @return
     */
    @GetMapping("hash/exists")
    boolean exists(@RequestParam("key") String key, @RequestParam("field") String field);

    /**
     * 获取值根据key和Field
     * @param key
     * @param field
     * @return value
     */
    @GetMapping("hash/value")
    Object getValueByKeyANdField(@RequestParam("key") String key, @RequestParam("field") String field);

    /**
     * 获取Field和Value
     * @param key
     * @return
     */
    @GetMapping("hash/entries")
    Map<Serializable, Object> getEntries(@RequestParam("key") String key);

    /**
     * 加入
     * @param key
     * @param field
     * @param value
     */
    @PostMapping("hash/put")
    void put(@RequestParam("key") String key, @RequestParam("field") String field, @RequestParam("value") Long value);

}
