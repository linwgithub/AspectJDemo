package com.lwcd.aspectjdemo.utils.aspectj;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Create by Linw
 * on 2019/1/29
 */
@Aspect
public class ClickFilterHook {

    private static Long sLastclick = 0L;
    private static final Long FILTER_TIME = 200L;

    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    public void clickFilterHook(ProceedingJoinPoint joinPoint) {
        if (System.currentTimeMillis() - sLastclick >= FILTER_TIME) {
            sLastclick = System.currentTimeMillis();
            try {
                joinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        } else {
            Log.e("ClickFilterHook", "防抖拦截");
        }
    }
}
