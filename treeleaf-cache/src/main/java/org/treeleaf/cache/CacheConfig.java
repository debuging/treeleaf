package org.treeleaf.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 缓存配置
 * <p>
 * Created by yaoshuhong on 2015/6/3.
 */
public class CacheConfig {

    private static Logger log = LoggerFactory.getLogger(CacheConfig.class);

    /**
     * 最大等待时间
     */
    private int maxWaitmillis;

    /**
     * 缓存服务器地址
     */
    private String host;

    /**
     * 缓存服务器端口
     */
    private int port;

    /**
     * 缓存服务器密码
     */
    private String password;

    /**
     * 连接池最大数量
     */
    private int maxTotal = 8;

    /**
     * 连接池最大空闲
     */
    private int maxIdle = 8;

    /**
     * 默认采用的cache实现, 0为redis, 1为本地内存
     */
    private int type = 0;

    /**
     * 超时时间,默认10秒
     */
    private int timeout = 10000;

    private static CacheConfig cacheConfig;

    /**
     * 初始化方法
     */
    public synchronized void init() {
        cacheConfig = this;
    }

    public static CacheConfig getInstance() {

        if (cacheConfig == null) {
            //到这一步还未初始化就抛错
            throw new CacheException("CacheConfig未初始化");
        }

        return cacheConfig;
    }

    public int getMaxWaitmillis() {
        return maxWaitmillis;
    }

    public void setMaxWaitmillis(int maxWaitmillis) {
        this.maxWaitmillis = maxWaitmillis;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
