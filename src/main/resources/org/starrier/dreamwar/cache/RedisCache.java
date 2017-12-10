package org.starrier.dreamwar.cache;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

/*
* Redis Cache
*  @Author Starrier
*  2017-12-10
* */
public class RedisCache {
    /* Cache Name */
    public final static String CACHENAME="caceh";
    /* Cache Time */
    public final static int CACHETIME="60";

    private RedisTemplate<String,String> redisTemplate;
    public <T> boolean putCache(String key,T object) {
        final byte[] bitesKey = key.getBytes();
        final byte[] bitesValue = ProtoStuffSerializerUtil.serialize(object);
        boolean result=redisTemplate.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisConnection.setNX(bitesKey, bitesValue);
            }
        });
        return result;
    }

    public <T> boolean putListCache(String key, List<T> objectList) {
        final byte[] bytesKey=key.getBytes();
        final byte[] bytesValues = ProtoStuffSerialzerUtil.serializeList(objectList);
        boolean result=redisTemplate.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisConnection.setNX(bytesKey, bytesValues);
            }
        });
        return result;
    }

    public <T> T getCache(final String key, Class<T> targetClass) {
        byte[] result=redisTemplate.execute(new RedisCallback<byte[]>() {
            @Override
            public byte[] doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisConnection.get(key, getBytes());
            }
        });
        if (result == null) {
            return null;
        }
        return ProtoStuffSerializaerUtil.deserialize(result, targetClass);
    }

    public <T> List<T> getListCache(final String key, targetClass) {
        byte[] result = redisTemplate.execute(new RedisCallback<byte[]>() {
            @Override
            public byte[] doInRedis(RedisConnection connection) throws DataAccessException {
                return connection.get(key.getBytes());
            }
        });
        if (result == null) {
            return null;
        }
        return ProtoStuffSerializerUtil.deserializeList(result, targetClass);
    }

    /*
    *  Percise Delete
    *
    *  @param key
    * */
    public void deleteCache(String key) {
        return redisTemplate.delete(key);
    }

    /*
    *  Fuzzy Delete
    *
    *  @param pattern
    * */
    public void deleteCacheWithPattern(String pattern) {
        Set<String> keys = redisTemplate.keys(pattern);
        redisTemplate.delete(keys);
    }

    /*
    *  Clear All THe Caches
    *
    *  @param key
    * */
    public void clearCache() {
        deleteCacheWithPattern(RedisCache.CACHENAME + "|*");
    }
}