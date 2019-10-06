package com.layman.utils;

import org.springframework.context.ApplicationContext;

/**
 * @ClassName ContextUtils
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/5 14:39
 * @Version 3.0
 **/
public class ContextUtils {
    public static ApplicationContext context;

    private ContextUtils() {
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }

    public static <T> T getBean(Class<T> t) {
        return context.getBean(t);
    }
}
