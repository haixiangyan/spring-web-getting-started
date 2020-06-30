package monster;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Aspect
@Configuration
public class CacheAspect {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Around("@annotation(monster.annotation.Cache)")
    public Object cache(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        String methodName = signature.getName();

        Object cachedValue = redisTemplate.opsForValue().get(methodName);

        if (cachedValue != null) {
            // 开始拦截
            System.out.println("使用缓存");
            return cachedValue;
        } else {
            // 继续执行原来的方法
            System.out.println("第一次");
            Object returnValue = joinPoint.proceed();
            redisTemplate.opsForValue().set(methodName, returnValue);
            return returnValue;
        }
    }
}
