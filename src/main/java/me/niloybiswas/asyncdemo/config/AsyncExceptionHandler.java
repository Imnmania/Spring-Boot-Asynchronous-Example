package me.niloybiswas.asyncdemo.config;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler{

    @Override
    public void handleUncaughtException(Throwable ex, Method method, Object... params) {
        
        log.error("Method name: " + method.getName() 
                    + "---" + Arrays.toString(params) 
                    + "---" + "Error message: " + ex.getMessage());

        // TODO: Send notification to users about failed status
        
    }
    
}
