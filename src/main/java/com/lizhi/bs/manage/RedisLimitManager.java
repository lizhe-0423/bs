package com.lizhi.bs.manage;


import com.lizhi.bs.common.ErrorCode;
import com.lizhi.bs.exception.ThrowUtils;
import org.redisson.api.RRateLimiter;
import org.redisson.api.RateIntervalUnit;
import org.redisson.api.RateType;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 专门提供Redis Limit 提供基础服务的
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝</a>
 */
@Service
public class RedisLimitManager {
    @Resource
    private RedissonClient redissonClient;

    /**
     * 限流操作
     *
     * @param key 区分不同的限流器
     */
    public void doRateLimitForUser(String key, int userRoleId) {
        //声明一个限流器
        RRateLimiter rateLimiter = redissonClient.getRateLimiter(key);
        if (userRoleId == 1) {
            //设置限流器的普通规则 每秒钟1次
            rateLimiter.trySetRate(RateType.OVERALL, 2, 1, RateIntervalUnit.SECONDS);
        } else if (userRoleId == 2) {
            //设置限流器的vip规则 每秒钟5次
            rateLimiter.trySetRate(RateType.OVERALL, 5, 1, RateIntervalUnit.SECONDS);
        }
        //每当操作来之后 请求一个令牌
        boolean canOp = rateLimiter.tryAcquire(1);

        ThrowUtils.throwIf(!canOp, ErrorCode.TO_MANY_REQUEST);
    }
}
