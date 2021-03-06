package study.daydayup.wolf.framework.util;

import org.springframework.beans.BeanUtils;
import org.springframework.context.ConfigurableApplicationContext;
import study.daydayup.wolf.framework.exception.WolfException;

/**
 * study.daydayup.wolf.framework.layer.context
 *
 * @author Wingle
 * @since 2020/2/18 10:58 下午
 **/
public class ContextUtil {
    private static boolean isInit = false;
    private static ConfigurableApplicationContext applicationContext;

    public static void init(ConfigurableApplicationContext context) {
        applicationContext = context;
        isInit = true;
    }

    public static <T> T getBean(Class<T> c) {
        if (!isInit) {
            throw new WolfException("BeanUtil does not init");
        }

        return applicationContext.getBean(c);
    }

    public static <T> T getBean(String className, Class<T> t) {
        if (!isInit) {
            throw new WolfException("BeanUtil does not init");
        }

        return applicationContext.getBean(className, t);
    }

    public static Object getBean(String className) {
        if (!isInit) {
            throw new WolfException("BeanUtil does not init");
        }

        return applicationContext.getBean(className);
    }

    public static ConfigurableApplicationContext getContext() {
        return applicationContext;
    }

}
